package littlefish.pos.pax_sdk_example.model.PaymentResponse;

import com.pax.poslink.AddlRspData;
import com.pax.poslink.PaymentResponse;
import com.pax.poslink.TORResponseInfo;
import com.pax.poslink.VASResponseInfo;
import com.pax.poslink.entity.CardInfo;
import com.pax.poslink.entity.FleetCard;
import com.pax.poslink.entity.MultiMerchant;
import com.pax.poslink.entity.Restaurant;

import java.util.ArrayList;
import java.util.List;

import io.flutter.plugins.pax_sdk;


public class PaymentResponseMapper extends pax_sdk.PaymentResponse {

    public PaymentResponseMapper(PaymentResponse paymentResponse){
        this.setAddlRspData(mapAddlRspData(paymentResponse.AddlRspData));
        this.setAvsResponse(paymentResponse.AvsResponse);
        this.setCvResponse(paymentResponse.CvResponse);
        this.setHostResponse(paymentResponse.HostResponse);
        this.setAuthCode(paymentResponse.AuthCode);
        this.setApprovedAmount(paymentResponse.ApprovedAmount);
        this.setBogusAccountNum(paymentResponse.BogusAccountNum);
        this.setCardInfo(mapCardInfo(paymentResponse.CardInfo));
        this.setCardType(paymentResponse.CardType);
        this.setExtData(paymentResponse.ExtData);
        this.setExtraBalance(paymentResponse.ExtraBalance);
        this.setFleetCard(mapFleetCard(paymentResponse.FleetCard));
        this.setHostCode(paymentResponse.HostCode);
        this.setMessage(paymentResponse.Message);
        this.setMultiMerchant(mapMultiMerchant(paymentResponse.MultiMerchant));
        this.setPaymentEmvTag(mapPaymentEmvTag(paymentResponse.PaymentEmvTag));
        this.setPaymentTransInfo(mapPaymentTransInfo(paymentResponse.PaymentTransInfo));
        this.setRefNum(paymentResponse.RefNum);
        this.setRemainingBalance(paymentResponse.RemainingBalance);
        this.setRequestedAmount(paymentResponse.RequestedAmount);
        this.setRestaurant(mapResaurant(paymentResponse.Restaurant));
        this.setRawResponse(paymentResponse.RawResponse);
        this.setResultCode(paymentResponse.ResultCode);
        this.setResultTxt(paymentResponse.ResultTxt);
        this.setSigFileName(paymentResponse.SigFileName);
        this.setSignData(paymentResponse.SignData);
        this.setTimestamp(paymentResponse.Timestamp);
        this.setTORResponseInfo(mapTORResponseInfo(paymentResponse.TORResponseInfo));
        this.setTransactionIntegrityClass(paymentResponse.TransactionIntegrityClass);
        this.setVASResponseInfo(mapVASResponseInfo(paymentResponse.VASResponseInfo));
    }

    private pax_sdk.VASResponseInfo mapVASResponseInfo(VASResponseInfo vasResponseInfo) {

        pax_sdk.VASResponseInfo vri = new pax_sdk.VASResponseInfo();

        vri.setNDEFData(vasResponseInfo.NDEFData);
        vri.setVASCode(vasResponseInfo.VASCode);
        vri.setVASData(mapVASDataList(vasResponseInfo.VASData));

        return vri;
    }

    private List<String> mapVASDataList(String[] vasData) {
        List<String> vd = new ArrayList<>();
        if(vasData != null)
        for(String vdl : vasData){

            vd.add(vdl);

        }

        return vd;
    }

    private pax_sdk.TORResponseInfo mapTORResponseInfo(TORResponseInfo torResponseInfo) {
        pax_sdk.TORResponseInfo tri = new pax_sdk.TORResponseInfo();
        tri.setBatchNo(torResponseInfo.BatchNo);
        tri.setHostResponseCode(torResponseInfo.HostResponseCode);
        tri.setHostResponseMessage(torResponseInfo.HostResponseMessage);
        tri.setMaskedPAN(torResponseInfo.MaskedPAN);
        tri.setOrigAmount(torResponseInfo.OrigAmount);
        tri.setGatewayTransactionID(torResponseInfo.GatewayTransactionID);
        tri.setHostResponseMessage(torResponseInfo.HostResponseMessage);
        tri.setRecordType(torResponseInfo.RecordType);
        tri.setOrigTransAuthCode(torResponseInfo.OrigTransAuthCode);
        tri.setHostReferenceNumber(torResponseInfo.HostReferenceNumber);
        tri.setReversalAuthCode(torResponseInfo.ReversalAuthCode);
        tri.setReversalTimeStamp(torResponseInfo.ReversalTimeStamp);

        return tri;
    }

    private pax_sdk.Restaurant mapResaurant(Restaurant restaurant) {

        pax_sdk.Restaurant r = new pax_sdk.Restaurant();

        r.setGuestNumber(restaurant.GuestNumber);
        r.setTicketNumber(restaurant.TicketNumber);
        r.setTableNumber(restaurant.TableNumber);

        return r;
    }

    private pax_sdk.PaymentTransInfo mapPaymentTransInfo(PaymentResponse.PaymentTransInfo paymentTransInfo) {
        pax_sdk.PaymentTransInfo pti = new pax_sdk.PaymentTransInfo();

        pti.setEdcType(paymentTransInfo.EdcType);
        pti.setEwicBalance(paymentTransInfo.EwicBalance);
        pti.setEwicDetail(paymentTransInfo.EwicDetail);
        pti.setEwicBenefitExpd(paymentTransInfo.EwicBenefitExpd);
        pti.setOrigTip(paymentTransInfo.OrigTip);
        pti.setPrintLine1(paymentTransInfo.PrintLine1);
        pti.setPrintLine2(paymentTransInfo.PrintLine2);
        pti.setPrintLine3(paymentTransInfo.PrintLine3);
        pti.setReversalStatus(paymentTransInfo.ReversalStatus);
        pti.setPrintLine4(paymentTransInfo.PrintLine4);
        pti.setReverseAmount(paymentTransInfo.ReverseAmount);
        pti.setReversalStatus(paymentTransInfo.ReversalStatus);
        pti.setPrintLine5(paymentTransInfo.PrintLine5);
        pti.setTokenSerialNum(paymentTransInfo.TokenSerialNum);

        return pti;
    }

    private pax_sdk.PaymentEmvTag mapPaymentEmvTag(PaymentResponse.PaymentEmvTag paymentEmvTag) {
        pax_sdk.PaymentEmvTag pet = new pax_sdk.PaymentEmvTag();

        pet.setAc(paymentEmvTag.Ac);
        pet.setAip(paymentEmvTag.Aip);
        pet.setAuc(paymentEmvTag.Auc);
        pet.setAvn(paymentEmvTag.Avn);
        pet.setHred(paymentEmvTag.Hred);
        pet.setCdol2(paymentEmvTag.Cdol2);
        pet.setIacDefault(paymentEmvTag.IacDefault);
        pet.setIacDenial(paymentEmvTag.IacDenial);
        pet.setIacOnline(paymentEmvTag.IacOnline);
        pet.setIssuerAuthData(paymentEmvTag.IssuerAuthData);
        pet.setPanSeqNum(paymentEmvTag.PanSeqNum);
        pet.setTacOnline(paymentEmvTag.TacOnline);
        pet.setTacDenial(paymentEmvTag.TacDenial);
        pet.setTacDefault(paymentEmvTag.TacDefault);


        return pet;
    }

    private pax_sdk.MultiMerchant mapMultiMerchant(MultiMerchant multiMerchant) {

        pax_sdk.MultiMerchant mm = new pax_sdk.MultiMerchant();

        mm.setId(multiMerchant.Id);
        mm.setName(multiMerchant.Name);

        return mm;
    }

    private pax_sdk.FleetCard mapFleetCard(FleetCard fleetCard) {
        pax_sdk.FleetCard fc = new pax_sdk.FleetCard();

        fc.setCustomerData(fleetCard.CustomerData);
        fc.setDriverId(fleetCard.DriverId);
        fc.setDepartmentNumber(fleetCard.DepartmentNumber);
        fc.setEmployeeNumber(fleetCard.EmployeeNumber);
        fc.setJobId(fleetCard.JobId);
        fc.setFleetPromptCode(fleetCard.FleetPromptCode);
        fc.setJobNumber(fleetCard.JobNumber);
        fc.setOdometer(fleetCard.Odometer);
        fc.setUserId(fleetCard.UserId);
        fc.setLicenseNumber(fleetCard.LicenseNumber);


        return fc;
    }

    private pax_sdk.CardInfo mapCardInfo(CardInfo cardInfo) {

        pax_sdk.CardInfo ci = new pax_sdk.CardInfo();

        ci.setCardBin(cardInfo.CardBin);
        ci.setNewCardBin(cardInfo.NewCardBin);
        ci.setProgramType(cardInfo.ProgramType);

        return ci;
    }

    private pax_sdk.AddlRspData mapAddlRspData(AddlRspData addlRspData) {

        pax_sdk.AddlRspData ard = new pax_sdk.AddlRspData();

        ard.setACI(addlRspData.ACI);
        ard.setBankNetData(addlRspData.BankNetData);
        ard.setAthNtwkID(addlRspData.AthNtwkID);
        ard.setDiscNRID(addlRspData.DiscNRID);
        ard.setCVVErrorCode(addlRspData.CVVErrorCode);
        ard.setCardLevelResult(addlRspData.CardLevelResult);
        ard.setDiscPOSEntry(addlRspData.DiscPOSEntry);
        ard.setEMVTags(addlRspData.EMVTags);
        ard.setOrigSTAN(addlRspData.OrigSTAN);
        ard.setDiscProcCode(addlRspData.DiscProcCode);
        ard.setPOSData(addlRspData.POSData);
        ard.setDiscRespCode(addlRspData.DiscRespCode);
        ard.setPOSEntryMode(addlRspData.POSEntryMode);
        ard.setServCode(addlRspData.ServCode);
        ard.setWltID(addlRspData.WltID);
        ard.setDiscTransQualifier(addlRspData.DiscTransQualifier);
        ard.setTransID(addlRspData.TransID);
        ard.setLocalDateTime(addlRspData.LocalDateTime);
        ard.setPOSEntryModeChg(addlRspData.POSEntryModeChg);
        ard.setSourceReasonCode(addlRspData.SourceReasonCode);
        ard.setSpendQInd(addlRspData.SpendQInd);
        ard.setTermEntryCapablt(addlRspData.TermEntryCapablt);
        ard.setTranEditErrCode(addlRspData.TranEditErrCode);
        ard.setTrnmsnDateTime(addlRspData.TrnmsnDateTime);
        ard.setXCodeResp(addlRspData.XCodeResp);

        return ard;
    }
}
