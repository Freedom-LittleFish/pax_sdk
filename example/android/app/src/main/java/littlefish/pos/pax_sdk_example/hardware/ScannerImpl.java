package littlefish.pos.pax_sdk_example.hardware;

import android.content.Context;

import com.pax.poslink.peripheries.POSLinkScanner;


public class ScannerImpl {

    public POSLinkScanner posLinkScanner;

    public ScannerImpl(Context context){
        initScanner(context);
    }

    private void initScanner(Context context){
        this.posLinkScanner = POSLinkScanner.getPOSLinkScanner(context,"REAR");
    }

}
