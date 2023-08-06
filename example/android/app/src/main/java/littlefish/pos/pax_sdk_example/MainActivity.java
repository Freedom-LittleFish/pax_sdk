package littlefish.pos.pax_sdk_example;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.pax.poslink.PaymentResponse;
import com.pax.poslink.PosLink;
import com.pax.poslink.entity.ScanResult;
import com.pax.poslink.exceptions.PaxScannerHwException;
import com.pax.poslink.peripheries.POSLinkPrinter;
import com.pax.poslink.peripheries.POSLinkScanner;
import com.pax.poslink.peripheries.ProcessResult;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;


import io.flutter.plugins.pax_sdk;
import littlefish.pos.pax_sdk_example.hardware.POSLinkImpl;
import littlefish.pos.pax_sdk_example.hardware.PrinterImpl;
import littlefish.pos.pax_sdk_example.hardware.ScannerHWImpl;
import littlefish.pos.pax_sdk_example.hardware.ScannerImpl;
import littlefish.pos.pax_sdk_example.model.PaymentRequest.PaymentRequestMapper;
import littlefish.pos.pax_sdk_example.model.PaymentResponse.PaymentResponseMapper;
import littlefish.pos.pax_sdk_example.model.ProcessResult.ProcessResultMapper;
import littlefish.pos.pax_sdk_example.model.ScanResult.MapScanResult;


public class MainActivity extends FlutterActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);
        pax_sdk.PaxPosApi.setup(flutterEngine.getDartExecutor(), new pax_sdk.PaxPosApi() {


            @Override
            public void print(@NonNull pax_sdk.PrinterRequest printerRequest, pax_sdk.Result<pax_sdk.ProcessResult> result) {
                PrinterImpl printer = new PrinterImpl(
                        getApplicationContext(),
                        POSLinkPrinter.getInstance(getApplicationContext()));
                printer.posLinkPrinter.print( new POSLinkPrinter.PrintDataFormatter(printerRequest.getFormatPrintStr()).build()
                        , new POSLinkPrinter.PrintListener() {
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError(ProcessResult processResult) {
                       runOnUiThread(new Runnable() {
                           @Override
                           public void run() {
                               result.error( new Throwable("Printer Error"+processResult.getMessage() + " Code:"+ processResult.getCode()));
                           }
                       });
                    }
                });
            }

            @Override
            public void ScanHW(pax_sdk.Result<pax_sdk.ScanResult> result) {
                ScannerHWImpl scannerHWImpl = new ScannerHWImpl(getApplicationContext());
                try {
                    scannerHWImpl.posLinkScannerHw.scanOpen();
                    final ScanResult decodeResult = scannerHWImpl.posLinkScannerHw.scanRead(10000);

                   runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            result.success(new MapScanResult(decodeResult));
                        }
                    });
                    scannerHWImpl.posLinkScannerHw.scanClose();
                } catch (PaxScannerHwException e) {
                    result.error(e);
                }
            }

            @Override
            public void Scan(pax_sdk.Result<pax_sdk.ScanResult> result) {
                ScannerImpl scannerImpl = new ScannerImpl(getApplicationContext());
                try {
                    scannerImpl.posLinkScanner.open();
                    scannerImpl.posLinkScanner.start(new POSLinkScanner.IScanListener() {
                        @Override
                        public void onRead(ScanResult scanResult) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    result.success(new MapScanResult(scanResult));
                                }
                            });
                        }

                        @Override
                        public void onFinish() {
                            scannerImpl.posLinkScanner.close();
                        }
                    });

                }catch(Exception e){
                    result.error(e);
                }
            }

            @Override
            public void charge(@NonNull pax_sdk.PaymentRequest paymentRequest, pax_sdk.Result result) {
                new Thread(
                        new Runnable() {
                            @Override
                            public void run() {
                                POSLinkImpl posLinkImpl = new POSLinkImpl(new PosLink(),getApplicationContext());
                                PaymentResponse paymentResponse =
                                        posLinkImpl.charge(new PaymentRequestMapper(paymentRequest));
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        result.success(new PaymentResponseMapper(paymentResponse));
                                    }
                                });
                            }
                        }
                ).start();
            }


        });


    }
}
