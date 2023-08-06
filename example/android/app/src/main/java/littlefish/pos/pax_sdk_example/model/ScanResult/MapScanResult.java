package littlefish.pos.pax_sdk_example.model.ScanResult;

import com.pax.poslink.entity.ScanResult;

import io.flutter.plugins.pax_sdk;

public class MapScanResult extends pax_sdk.ScanResult {

    public MapScanResult(ScanResult scanResult){
        this.setA(scanResult.getContent());
        this.setB(scanResult.getFormat());
    }
}
