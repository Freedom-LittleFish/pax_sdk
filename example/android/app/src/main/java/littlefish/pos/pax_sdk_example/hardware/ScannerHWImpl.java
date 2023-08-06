package littlefish.pos.pax_sdk_example.hardware;

import android.content.Context;

import com.pax.poslink.peripheries.POSLinkScannerHw;

public class ScannerHWImpl {

    public POSLinkScannerHw posLinkScannerHw;

    public ScannerHWImpl(Context context){
        initScannerHWImpl(context);
    }

    private void initScannerHWImpl(Context context){
        this.posLinkScannerHw =  POSLinkScannerHw.getInstance(context);
    }
}
