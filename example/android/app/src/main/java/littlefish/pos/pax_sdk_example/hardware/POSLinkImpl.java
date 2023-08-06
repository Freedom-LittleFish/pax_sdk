package littlefish.pos.pax_sdk_example.hardware;


import android.content.Context;

import com.pax.poslink.CommSetting;
import com.pax.poslink.LogSetting;
import com.pax.poslink.POSLinkAndroid;
import com.pax.poslink.PaymentResponse;
import com.pax.poslink.PosLink;
import com.pax.poslink.poslink.POSLinkCreator;

import javax.inject.Inject;

import littlefish.pos.pax_sdk_example.model.PaymentRequest.PaymentRequestMapper;

public class POSLinkImpl{
    Context context;
    PosLink posLink;



    @Inject
    public POSLinkImpl(PosLink posLink,
                       Context context){
        this.posLink = posLink;
        this.context = context;
        initPosLink(context);


    }

    void initPosLink(Context context){
        POSLinkAndroid.init(context);
        this.posLink = POSLinkCreator.createPoslink(context);
        this.posLink.SetCommSetting(initCom());
        initLogSetting(context);
    }

    private CommSetting initCom(){
        CommSetting commSetting = new CommSetting();
        commSetting.setTimeOut("60000");
        commSetting.setSerialPort("COM1");
        commSetting.setBaudRate("9600");
        commSetting.setDestIP("172.16.20.15");
        commSetting.setDestPort("10009");
        commSetting.setMacAddr("");
        commSetting.setEnableProxy(false);
        commSetting.setType(CommSetting.AIDL);
        return commSetting;
    }

    private static void initLogSetting(Context context){
        String LogOutputFile = context.getExternalFilesDir(null).getPath();
        LogSetting.setLogMode(true);
        LogSetting.setLevel(LogSetting.LOGLEVEL.DEBUG);
        LogSetting.setOutputPath(LogOutputFile);
    }


    public PaymentResponse charge(PaymentRequestMapper paymentRequest) {
        posLink.CancelTrans();
        posLink.PaymentRequest = paymentRequest.PaymentRequest;
        posLink.ProcessTrans();
        return posLink.PaymentResponse;
    }
}