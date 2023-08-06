package littlefish.pos.pax_sdk_example.hardware;

import android.content.Context;

import com.pax.poslink.PaymentRequest;
import com.pax.poslink.peripheries.POSLinkPrinter;
import com.pax.poslink.peripheries.ProcessResult;

import io.flutter.plugins.pax_sdk;

public class PrinterImpl  {

    Context context;

    public POSLinkPrinter posLinkPrinter;

    public PrinterImpl(Context context, POSLinkPrinter posLinkPrinter){
        super();
        this.posLinkPrinter = posLinkPrinter;
        this.context = context;
        initPrinter();
    }

    void initPrinter(){
        posLinkPrinter.setGray(-1);
        posLinkPrinter.setPrintWidth(getPrinterWidth());
    }

    int getPrinterWidth(){
         return posLinkPrinter.getRecommendWidth();
    }






}
