import 'package:pigeon/pigeon.dart';


@ConfigurePigeon(PigeonOptions(
  dartOut: 'lib/PaxSdkPlugin.g.dart',
  dartOptions: DartOptions(),
  javaOut:  'example/android/app/src/main/java/io/flutter/plugins/pax_sdk.java',
  javaOptions: JavaOptions(),
))
//Payment request
class AutoRentalInfo{
  String?  AgreementNumber;
  String?  DailyRate;
  String?  RentalDuration;
  String?  InsuranceAmount;
  String?  AllocatedMiles;
  String?  MileRate;
  String?  Name;
  String?  DriverLicenseNumber;
  String?  RentalProgramType;
  String?  PickupLocationName;
  String?  PickupCity;
  String?  PickupState;
  String?  PickupCountryCode;
  String?  PickupDatetime;
  String?  ReturnLocation;
  String?  ReturnCity;
  String?  ReturnState;
  String?  ReturnCountryCode;
  String?  ReturnDatetime;
  String?  TotalMiles;
  String?  CustomerTaxID;
  String?  VehicleClassID;
  List<ExtraChargeItem?>? ExtraChargeItems;
  String?  ExtraChargesAmount;


}
class CommercialCard{
  String? PONumber;
  String? CustomerCode;
  String? TaxExempt;
  String? TaxExemptID;
  String? MerchantTaxID;
  String? DestinationZipCode;
  String? ProductDescription;
  String? ShipFromZipCode;
  String? DestinationCountryCode;
  List<TaxDetail?>? TaxDetails;
  String? SummaryCommodityCode;
  String? DiscountAmount;
  String? FreightAmount;
  String? DutyAmount;
  String? OrderDate;
  List<LineItemDetail?>? LineItemDetails;
  String? ShippingCompany;
  String? ShippingTrackingNumber;
  String? AdditionalFees;

  CommercialCard({this.PONumber, this.CustomerCode, this.TaxExempt, this.TaxExemptID, this.MerchantTaxID, this.DestinationZipCode, this.ProductDescription, this.ShipFromZipCode, this.DestinationCountryCode, this.TaxDetails, this.SummaryCommodityCode, this.DiscountAmount, this.FreightAmount, this.DutyAmount, this.OrderDate, this.LineItemDetails, this.ShippingCompany, this.ShippingTrackingNumber, this.AdditionalFees});

}
class ExtraChargeItem{
  String? ItemType ;
  String? ExtraChargeAmount ;
}
class FleetCard{
  String?  Odometer ;
  String?  VehicleNumber ;
  String?  JobNumber ;
  String?  DriverId ;
  String?  EmployeeNumber ;
  String?  LicenseNumber ;
  String?  JobId ;
  String?  DepartmentNumber ;
  String?  CustomerData ;
  String?  UserId ;
  String?  VehicleId ;
  String?  FleetPromptCode ;

  FleetCard({this.Odometer, this.VehicleNumber, this.JobNumber, this.DriverId, this.EmployeeNumber, this.LicenseNumber, this.JobId, this.DepartmentNumber, this.CustomerData, this.UserId, this.VehicleId, this.FleetPromptCode});

}
class HostCredentialInformation{

  String?  MID ;
  String?  ServiceUser ;
  String?  ServicePassword ;

  HostCredentialInformation({this.MID, this.ServiceUser, this.ServicePassword});


}
class HostGateWay{

  String? HRef ;

  String? GatewayId ;

  String? TokenRequestFlag ;

  String? Token ;

  String? CardType ;

  String? PassThruData ;

  String? ReturnReason ;

  String? StationId ;

  String? GlobalUid ;

  String? CustomizeData1 ;

  String? CustomizeData2 ;

  String? CustomizeData3 ;

  String? EwicDiscountAmount ;

  String? TokenSerialNum ;

  HostGateWay({this.HRef, this.GatewayId, this.TokenRequestFlag, this.Token, this.CardType, this.PassThruData, this.ReturnReason, this.StationId, this.GlobalUid, this.CustomizeData1, this.CustomizeData2, this.CustomizeData3, this.EwicDiscountAmount, this.TokenSerialNum});


}
class LineItemDetail{
  String? ItemSequenceNumber;
  String? ProductCode;
  String? ItemCommodityCode;
  String? ItemDescription;
  String? ItemQuantity;
  String? ItemMeasurementUnit;
  String? ItemUnitPrice;
  String? ItemDiscountAmount;
  String? ItemDiscountRate;
  List<TaxDetail?>? TaxDetails;
  String? LineItemTotal;

}
class LodgingInfo{
  String?  RoomNumber;
  String?  FolioNumber;
  List<RoomRates?>? roomRates;
  String?  ChargeType;
  String?  NoShowFlag;
  String?  CheckInDate;
  String?  CheckOutDate;
  String?  SpecialProgramCode;
  String?  DepartureAdjustedAmount;
  List<LodgingItem?>? LodgingItems;

  LodgingInfo({this.RoomNumber, this.FolioNumber, this.roomRates, this.ChargeType, this.NoShowFlag, this.CheckInDate, this.CheckOutDate, this.SpecialProgramCode, this.DepartureAdjustedAmount, this.LodgingItems});
}
class LodgingItem{
  String?  ItemType ;
  String?  ItemAmount ;
  String?  ItemCode ;

  LodgingItem({this.ItemType, this.ItemAmount, this.ItemCode});

}
class MultiMerchant{
  String? Id ;
  String? Name ;

  MultiMerchant({this.Id, this.Name});


}
class Original{

  String?  TransDate ;
  String?  Pan ;
  String?  ExpiryDate ;
  String?  TransTime ;
  String?  SettlementDate ;
  String?  TransType ;
  String?  Amount ;
  String?  BatchNumber ;
  String?  TransId ;
  String?  PaymentService2000 ;
  String?  AuthorizationResponse ;

  Original({this.TransDate, this.Pan, this.ExpiryDate, this.TransTime, this.SettlementDate, this.TransType, this.Amount, this.BatchNumber, this.TransId, this.PaymentService2000, this.AuthorizationResponse});


}
class PaymentRequest{
  int? TenderType;
  int? TransType;
  String? Amount;
  String? CashBackAmt;
  String? ClerkID;
  String? Zip;
  String? TipAmt;
  String? TaxAmt;
  String? Street;
  String? Street2;
  String? SurchargeAmt;
  String? ServerID;
  String? AutoSubmit;
  String? PONum;
  String? OrigRefNum;
  String? Misc3Amt;
  String? Misc2Amt;
  String? Misc1Amt;
  String? MerchantKey;
  String? InvNum;
  String? ECRRefNum;
  String? ECRTransID;
  String? OrigECRRefNum;
  String? AuthCode;
  String? ExtData;
  String? FuelAmt;
  String? ContinuousScreen;
  String? ServiceFee;
  String? GiftCardType;
  CommercialCard? commercialCard;
  Restaurant? restaurant;
  HostGateWay? hostGateWay;
  TransactionBehavior? transactionBehavior;
  Original? original;
  FleetCard? fleetCard;
  MultiMerchant? multiMerchant;
  LodgingInfo? lodgingInfo;
  AutoRentalInfo? autoRentalInfo;
  String? CVVBypassReason;
  String? GiftTenderType;
  String? OrigTraceNum;
  HostCredentialInformation? hostCredentialInformation;

  PaymentRequest({
    this.TenderType,
    this.TransType,
    this.Amount,
    this.CashBackAmt,
    this.ClerkID,
    this.Zip,
    this.TipAmt,
    this.TaxAmt,
    this.Street,
    this.Street2,
    this.SurchargeAmt,
    this.ServerID,
    this.AutoSubmit,
    this.PONum,
    this.OrigRefNum,
    this.Misc3Amt,
    this.Misc2Amt,
    this.Misc1Amt,
    this.MerchantKey,
    this.InvNum,
    this.ECRRefNum,
    this.ECRTransID,
    this.OrigECRRefNum,
    this.AuthCode,
    this.ExtData,
    this.FuelAmt,
    this.ContinuousScreen,
    this.ServiceFee,
    this.GiftCardType,
    this.commercialCard,
    this.restaurant,
    this.hostGateWay,
    this.transactionBehavior,
    this.original,
    this.fleetCard,
    this.multiMerchant,
    this.lodgingInfo,
    this.autoRentalInfo,
    this.CVVBypassReason,
    this.GiftTenderType,
    this.OrigTraceNum,
    this.hostCredentialInformation});



}
class Restaurant{

  String? TableNumber ;
  String? GuestNumber ;
  String? TicketNumber ;

  Restaurant({this.TableNumber, this.GuestNumber, this.TicketNumber});

}
class RoomRates{
  String?  StayDuration ;
  String?  RoomRateAmount ;
  String?  RoomRateTax ;

  RoomRates({this.StayDuration, this.RoomRateAmount, this.RoomRateTax});


}
class TaxDetail{
  String? TaxType ;
  String? TaxAmount ;
  String? TaxRate ;
  String? MerChantTaxID ;
  String? CustomerTaxID ;
  String? VATInvoiceNumber ;
  String? AlternateTaxID ;

  TaxDetail({this.TaxType, this.TaxAmount, this.TaxRate, this.MerChantTaxID, this.CustomerTaxID, this.VATInvoiceNumber, this.AlternateTaxID});


}
class TransactionBehavior{
  String? SignatureCaptureFlag ;
  String? TipRequestFlag ;
  String? SignatureUploadFlag ;
  String? StatusReportFlag ;
  String? AcceptedCardType ;
  String? ProgramPromptsFlag ;
  String? SignatureAcquireFlag ;
  String? EntryMode ;
  String? ReceiptPrintFlag ;
  String? CardPresentMode ;
  String? DebitNetwork ;
  String? UserLanguage ;
  String? AddlRspDataFlag ;
  String? ForceCC ;
  String? ForceFsa ;
  String? AccessibilityPinPad ;
  String? ForceDuplicate ;

  TransactionBehavior({this.SignatureCaptureFlag, this.TipRequestFlag, this.SignatureUploadFlag, this.StatusReportFlag, this.AcceptedCardType, this.ProgramPromptsFlag, this.SignatureAcquireFlag, this.EntryMode, this.ReceiptPrintFlag, this.CardPresentMode, this.DebitNetwork, this.UserLanguage, this.AddlRspDataFlag, this.ForceCC, this.ForceFsa, this.AccessibilityPinPad, this.ForceDuplicate});

}

//Payment response
class AddlRspData {
  String? ACI ;
  String? TransID ;
  String? CardLevelResult ;
  String? SourceReasonCode ;
  String? BankNetData ;
  String? POSEntryModeChg ;
  String? TranEditErrCode ;
  String? DiscProcCode ;
  String? DiscPOSEntry ;
  String? DiscRespCode ;
  String? POSData ;
  String? DiscTransQualifier ;
  String? DiscNRID ;
  String? TrnmsnDateTime ;
  String? OrigSTAN ;
  String? CVVErrorCode ;
  String? XCodeResp ;
  String? AthNtwkID ;
  String? TermEntryCapablt ;
  String? POSEntryMode ;
  String? ServCode ;
  String? SpendQInd ;
  String? WltID ;
  String? LocalDateTime ;
  String? EMVTags ;

  AddlRspData({this.ACI, this.TransID, this.CardLevelResult, this.SourceReasonCode, this.BankNetData, this.POSEntryModeChg, this.TranEditErrCode, this.DiscProcCode, this.DiscPOSEntry, this.DiscRespCode, this.POSData, this.DiscTransQualifier, this.DiscNRID, this.TrnmsnDateTime, this.OrigSTAN, this.CVVErrorCode, this.XCodeResp, this.AthNtwkID, this.TermEntryCapablt, this.POSEntryMode, this.ServCode, this.SpendQInd, this.WltID, this.LocalDateTime, this.EMVTags});
}
class CardInfo {
  String? CardBin ;
  String? NewCardBin ;
  String? ProgramType ;

  CardInfo({this.CardBin, this.NewCardBin, this.ProgramType});


}
class EmvTag {
  String? Tc ;
  String? Tvr ;
  String? Aid ;
  String? Tsi ;
  String? Atc ;
  String? AppLabel ;
  String? AppPreferName ;
  String? Iad ;
  String? Arc ;
  String? Cid ;
  String? Cvm ;
  String? Arqc ;


}
class PaymentEmvTag extends EmvTag {
  String? Ac ;
  String? Aip ;
  String? Avn ;
  String? IssuerAuthData ;
  String? Cdol2 ;
  String? Hred ;
  String? TacDefault ;
  String? TacDenial ;
  String? TacOnline ;
  String? IacDefault ;
  String? IacDenial ;
  String? IacOnline ;
  String? Auc ;
  String? PanSeqNum ;


}
class PaymentResponse {
  String?  AuthCode;
  String?  ApprovedAmount;
  String?  AvsResponse;
  String?  BogusAccountNum;
  String?  CardType;
  String?  CvResponse;
  String?  HostCode;
  String?  HostResponse;
  String?  Message;
  String?  RefNum;
  String?  RawResponse;
  String?  RemainingBalance;
  String?  ExtraBalance;
  String?  RequestedAmount;
  String?  ResultCode;
  String?  ResultTxt;
  String?  Timestamp;
  String?  SigFileName;
  String?  SignData;
  String?  TransactionIntegrityClass;
  VASResponseInfo? vASResponseInfo;
  TORResponseInfo? tORResponseInfo;
  AddlRspData? addlRspData;
  Restaurant? restaurant; //
  MultiMerchant? multiMerchant; //
  CardInfo? cardInfo;
  FleetCard? fleetCard; //
  PaymentTransInfo? paymentTransInfo;
  PaymentEmvTag? paymentEmvTag;
  String? ExtData;

  PaymentResponse({this.AuthCode,
    this.ApprovedAmount,
    this.AvsResponse,
    this.BogusAccountNum,
    this.CardType,
    this.CvResponse,
    this.HostCode,
    this.HostResponse,
    this.Message,
    this.RefNum,
    this.RawResponse,
    this.RemainingBalance,
    this.ExtraBalance,
    this.RequestedAmount,
    this.ResultCode,
    this.ResultTxt,
    this.Timestamp,
    this.SigFileName,
    this.SignData,
    this.TransactionIntegrityClass,
    this.vASResponseInfo,
    this.tORResponseInfo,
    this.addlRspData,
    this.restaurant,
    this.multiMerchant,
    this.cardInfo,
    this.fleetCard,
    this.paymentTransInfo,
    this.paymentEmvTag,
    this.ExtData
  });






}
class PaymentTransInfo extends TransInfo {
  String? OrigTip ;
  String? EdcType ;
  String? PrintLine1 ;
  String? PrintLine2 ;
  String? PrintLine3 ;
  String? PrintLine4 ;
  String? PrintLine5 ;
  String? EwicBenefitExpd ;
  String? EwicBalance ;
  String? EwicDetail ;
  String? ReverseAmount ;
  String? ReversalStatus ;
  String? TokenSerialNum ;

  PaymentTransInfo({this.OrigTip, this.EdcType, this.PrintLine1, this.PrintLine2, this.PrintLine3, this.PrintLine4, this.PrintLine5, this.EwicBenefitExpd, this.EwicBalance, this.EwicDetail, this.ReverseAmount, this.ReversalStatus, this.TokenSerialNum});
}
class TORResponseInfo {
  String? RecordType ;
  String? ReversalTimeStamp ;
  String? HostResponseCode ;
  String? HostResponseMessage ;
  String? HostReferenceNumber ;
  String? GatewayTransactionID ;
  String? OrigAmount ;
  String? MaskedPAN ;
  String? BatchNo ;
  String? ReversalAuthCode ;
  String? OrigTransType ;
  String? OrigTransDateTime ;
  String? OrigTransAuthCode ;

  TORResponseInfo({this.RecordType, this.ReversalTimeStamp, this.HostResponseCode, this.HostResponseMessage, this.HostReferenceNumber, this.GatewayTransactionID, this.OrigAmount, this.MaskedPAN, this.BatchNo, this.ReversalAuthCode, this.OrigTransType, this.OrigTransDateTime, this.OrigTransAuthCode});
}
class TransInfo {
  String? DiscountAmount ;
  String? ChargedAmount ;
  String? SignatureStatus ;
  String? Fps ;
  String? FpsSignature ;
  String? FpsReceipt ;
  String? Token ;
  String? HRef ;
  String? SN ;
  String? SettlementDate ;
  String? HostEchoData ;
  String? PinStatusNum ;
  String? ValidationCode ;
  String? UserLanguageStatus ;
  String? GlobalUid ;

  TransInfo({this.DiscountAmount, this.ChargedAmount, this.SignatureStatus, this.Fps, this.FpsSignature, this.FpsReceipt, this.Token, this.HRef, this.SN, this.SettlementDate, this.HostEchoData, this.PinStatusNum, this.ValidationCode, this.UserLanguageStatus, this.GlobalUid});
}
class VASResponseInfo {
  String? VASCode;
  List<String?>? VASData;
  String? NDEFData;

  VASResponseInfo({this.VASCode, this.VASData, this.NDEFData});


}
 //Printer Request
class ProcessResult {
 Map<String?, String?>? c ;
String? a;
String? b;
}
class PrinterRequest{
   String? formatPrintStr;
   int? cutMode;
   Uint8List? bitMapImage;
   int? alignment;
 }
class PrinterSettings{
  int? greyLevel;
  int? cutMode;
  int? printWidth;
}


//Scan results
class ScanResult {
String? a;
String? b;
}



@HostApi()
abstract class PaxPosApi{
  @async
  PaymentResponse charge(PaymentRequest paymentRequest);

  @async
  ProcessResult print(PrinterRequest printerRequest);

  @async
  ScanResult ScanHW();

  @async
  ScanResult Scan();




}


