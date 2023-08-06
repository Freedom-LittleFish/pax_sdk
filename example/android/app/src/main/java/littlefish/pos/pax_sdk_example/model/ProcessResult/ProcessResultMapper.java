package littlefish.pos.pax_sdk_example.model.ProcessResult;

import com.pax.poslink.peripheries.ProcessResult;

import io.flutter.plugins.pax_sdk;

public class ProcessResultMapper extends pax_sdk.ProcessResult {

     public ProcessResultMapper(ProcessResult pr){
         pax_sdk.ProcessResult processResult = new pax_sdk.ProcessResult();
         processResult.setA(pr.getMessage());
         processResult.setB(pr.getCode());

    }


}
