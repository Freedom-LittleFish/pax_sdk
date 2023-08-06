package littlefish.pos.pax_sdk_example.model.PaymentRequest;

import com.pax.poslink.PaymentRequest;
import com.pax.poslink.PosLink;
import com.pax.poslink.entity.FleetCard;
import com.pax.poslink.entity.MultiMerchant;
import com.pax.poslink.entity.Restaurant;

import java.util.ArrayList;
import java.util.List;

import io.flutter.plugins.pax_sdk;

public class PaymentRequestMapper extends PosLink {

    public PaymentRequestMapper(pax_sdk.PaymentRequest paymentRequest){
        this.PaymentRequest = new PaymentRequest();
        this.PaymentRequest.HostCredentialInformation = paymentRequest.getHostCredentialInformation()== null ?
                new PaymentRequest.HostCredentialInformation() : getHostCredentialInformation(paymentRequest.getHostCredentialInformation());
        this.PaymentRequest.GiftTenderType = paymentRequest.getGiftTenderType() == null ?
                "" :paymentRequest.getGiftTenderType();
        this.PaymentRequest.CVVBypassReason =  paymentRequest.getCVVBypassReason() == null ? "":
                paymentRequest.getCVVBypassReason();
        this.PaymentRequest.AutoRentalInfo = paymentRequest.getAutoRentalInfo() == null ? new PaymentRequest.AutoRentalInfo()
                : getAutoRentalInfo(paymentRequest.getAutoRentalInfo());
        this.PaymentRequest.LodgingInfo =  paymentRequest.getLodgingInfo() == null ? new PaymentRequest.LodgingInfo():
                getLodgingInfo(paymentRequest.getLodgingInfo());
        this.PaymentRequest.CVVBypassReason = paymentRequest.getCVVBypassReason() == null ? "":
                paymentRequest.getCVVBypassReason();
        this.PaymentRequest.GiftCardType =  paymentRequest.getGiftTenderType() == null ? "" :
                paymentRequest.getGiftCardType();
        this.PaymentRequest.MultiMerchant = paymentRequest.getMultiMerchant()== null ? new MultiMerchant():
                getMultiMerchant(paymentRequest.getMultiMerchant());
        this.PaymentRequest.FleetCard = paymentRequest.getFleetCard() == null ? new FleetCard():
                getFleetCard(paymentRequest.getFleetCard());
        this.PaymentRequest.Original = paymentRequest.getOriginal() == null ? new PaymentRequest.Original():
                getOriginal(paymentRequest.getOriginal());
        this.PaymentRequest.TransactionBehavior = paymentRequest.getTransactionBehavior() == null ? new PaymentRequest.TransactionBehavior():
                getTransactionBehavior(paymentRequest.getTransactionBehavior());
        this.PaymentRequest.HostGateWay =  paymentRequest.getHostGateWay() == null ? new PaymentRequest.HostGateWay():
                getHostGateWay(paymentRequest.getHostGateWay());
        this.PaymentRequest.Restaurant = paymentRequest.getRestaurant()== null? new Restaurant():
                getRestaurant(paymentRequest.getRestaurant());
        this.PaymentRequest.CommercialCard = paymentRequest.getCommercialCard() == null? new PaymentRequest.CommercialCard():
                getCommercialCard(paymentRequest.getCommercialCard());
        this.PaymentRequest.ContinuousScreen = paymentRequest.getContinuousScreen() == null? "":
                paymentRequest.getContinuousScreen();
        this.PaymentRequest.ServiceFee = paymentRequest.getServiceFee() == null ? "":
                paymentRequest.getServiceFee();
        this.PaymentRequest.AuthCode = paymentRequest.getAuthCode() == null? "":
                paymentRequest.getAuthCode();
        this.PaymentRequest.ECRTransID =  paymentRequest.getECRTransID() == null ? "":
                paymentRequest.getECRTransID();
        this.PaymentRequest.OrigECRRefNum = paymentRequest.getOrigECRRefNum() == null? "":
                paymentRequest.getOrigECRRefNum();
        this.PaymentRequest.ECRRefNum = paymentRequest.getECRRefNum() == null ? "":
                paymentRequest.getECRRefNum();
        this.PaymentRequest.InvNum = paymentRequest.getInvNum() == null ? "":
                paymentRequest.getInvNum();
        this.PaymentRequest.OrigRefNum = paymentRequest.getOrigRefNum() == null? "":
                paymentRequest.getOrigRefNum();
        this.PaymentRequest.PONum = paymentRequest.getPONum() == null?"":
                paymentRequest.getPONum();
        this.PaymentRequest.SurchargeAmt = paymentRequest.getSurchargeAmt()== null ? "":
                paymentRequest.getSurchargeAmt();
        this.PaymentRequest.Street2 = paymentRequest.getStreet2() == null?"":
                paymentRequest.getStreet2();
        this.PaymentRequest.Street = paymentRequest.getStreet() == null? "":
                paymentRequest.getStreet();
        this.PaymentRequest.FuelAmt =  paymentRequest.getFuelAmt() == null ? "" :
                paymentRequest.getFuelAmt();
        this.PaymentRequest.TaxAmt = paymentRequest.getTaxAmt() == null? "":
                paymentRequest.getTaxAmt();
        this.PaymentRequest.TipAmt = paymentRequest.getTipAmt() == null?"":
                paymentRequest.getTipAmt();
        this.PaymentRequest.Zip = paymentRequest.getZip() == null ? "":
                paymentRequest.getZip();
        this.PaymentRequest.ClerkID = paymentRequest.getClerkID() == null? "":
                paymentRequest.getClerkID();
        this.PaymentRequest.CashBackAmt = paymentRequest.getCashBackAmt() == null?"":
                paymentRequest.getCashBackAmt();
        this.PaymentRequest.Amount = paymentRequest.getAmount();
        this.PaymentRequest.ExtData = paymentRequest.getExtData() == null ? "":
                paymentRequest.getExtData();
        this.PaymentRequest.TransType = Math.toIntExact(paymentRequest.getTransType());
        this.PaymentRequest.TenderType = Math.toIntExact(paymentRequest.getTenderType());
        this.PaymentRequest.OrigTraceNum = paymentRequest.getOrigTraceNum() == null? "":
                paymentRequest.getOrigTraceNum();
    }

    private com.pax.poslink.PaymentRequest.CommercialCard getCommercialCard(pax_sdk.CommercialCard pr) {

        com.pax.poslink.PaymentRequest.CommercialCard cc = new com.pax.poslink.PaymentRequest.CommercialCard();

        cc.AdditionalFees = pr == null ? "" : pr.getAdditionalFees();
        cc.CustomerCode = pr == null ? "" : pr.getCustomerCode();
        cc.DestinationCountryCode = pr == null ? "" : pr.getDestinationCountryCode();
        cc.DiscountAmount = pr == null ? "" : pr.getDiscountAmount();
        cc.DutyAmount = pr == null ? "" : pr.getDutyAmount();
        cc.DestinationZipCode = pr == null ? "" : pr.getDestinationZipCode();
        cc.FreightAmount = pr == null ? "" : pr.getFreightAmount();
        cc.LineItemDetails = getLineItemsDetails(pr == null ? new ArrayList() : pr.getLineItemDetails());
        cc.MerchantTaxID = pr == null ? "" : pr.getMerchantTaxID();
        cc.OrderDate = pr == null ? "" : pr.getOrderDate();
        cc.PONumber = pr == null ? "" : pr.getPONumber();
        cc.ProductDescription = pr == null ? "" : pr.getProductDescription();
        cc.ShipFromZipCode = pr == null ? "" : pr.getShipFromZipCode();
        cc.ShippingCompany = pr == null ? "" : pr.getShippingCompany();
        cc.ShippingTrackingNumber = pr == null ? "" : pr.getShippingTrackingNumber();
        cc.SummaryCommodityCode = pr == null ? "" : pr.getSummaryCommodityCode();
        cc.TaxDetails = getTaxDetails(pr == null ? new ArrayList<>() : pr.getTaxDetails());
        cc.TaxExempt = pr == null ? "" : pr.getTaxExempt();
        cc.TaxExemptID = pr == null ? "" : pr.getTaxExemptID();

        return cc;
    }

    private List<com.pax.poslink.PaymentRequest.CommercialCard.LineItemDetail> getLineItemsDetails(List<pax_sdk.LineItemDetail> pr) {
        List<com.pax.poslink.PaymentRequest.CommercialCard.LineItemDetail> lidl = new ArrayList<>();

        for (pax_sdk.LineItemDetail lid : pr){
            com.pax.poslink.PaymentRequest.CommercialCard.LineItemDetail temp
                    = new com.pax.poslink.PaymentRequest.CommercialCard.LineItemDetail();

            temp.ItemCommodityCode = lid.getItemCommodityCode();
            temp.ItemDescription = lid.getItemDescription();
            temp.ItemQuantity = lid.getItemQuantity();
            temp.LineItemTotal = lid.getLineItemTotal();
            temp.ItemDiscountRate = lid.getItemDiscountRate();
            temp.ItemMeasurementUnit = lid.getItemMeasurementUnit();
            temp.ItemSequenceNumber = lid.getItemSequenceNumber();
            temp.ItemUnitPrice = lid.getItemUnitPrice();
            temp.ProductCode = lid.getProductCode();
            temp.TaxDetails = getTaxDetails(lid.getTaxDetails());
            temp.ItemDiscountAmount = lid.getItemDiscountAmount();;

            lidl.add(temp);
        }

        return  lidl;
    }

    private List<com.pax.poslink.PaymentRequest.CommercialCard.TaxDetail> getTaxDetails(List<pax_sdk.TaxDetail> pr) {
        List<com.pax.poslink.PaymentRequest.CommercialCard.TaxDetail> tdl = new ArrayList<>();

        for (pax_sdk.TaxDetail td: pr) {
            com.pax.poslink.PaymentRequest.CommercialCard.TaxDetail temp =
                    new com.pax.poslink.PaymentRequest.CommercialCard.TaxDetail();

            temp.AlternateTaxID = td.getAlternateTaxID();
            temp.CustomerTaxID = td.getCustomerTaxID();
            temp.TaxRate = td.getTaxRate();
            temp.TaxType = td.getTaxType();
            temp.TaxAmount = td.getTaxAmount();
            temp.MerChantTaxID = td.getMerChantTaxID();
            temp.VATInvoiceNumber = td.getVATInvoiceNumber();

                    tdl.add(temp);
        }
        return tdl;
    }

    private Restaurant getRestaurant(pax_sdk.Restaurant restaurant) {
        Restaurant r = new Restaurant();

        r.GuestNumber = restaurant.getGuestNumber();
        r.TableNumber = restaurant.getTableNumber();
        r.TicketNumber = restaurant.getTicketNumber();

        return r;

    }

    private com.pax.poslink.PaymentRequest.HostGateWay getHostGateWay(pax_sdk.HostGateWay pr) {
        com.pax.poslink.PaymentRequest.HostGateWay hgw = new com.pax.poslink.PaymentRequest.HostGateWay();

        hgw.CardType = pr == null ? "" : pr.getCardType();;
        hgw.CustomizeData1 = pr == null ? "" : pr.getCustomizeData1();
        hgw.CustomizeData2 = pr == null ? "" : pr.getCustomizeData2();
        hgw.CustomizeData3 = pr == null ? "" : pr.getCustomizeData3();;
        hgw.GatewayId = pr == null ? "" : pr.getGatewayId();
        hgw.EwicDiscountAmount = pr == null ? "" : pr.getEwicDiscountAmount();
        hgw.GlobalUid = pr == null ? "" : pr.getGlobalUid();
        hgw.HRef = pr == null ? "" : pr.getHRef();
        hgw.CardType = pr == null ? "" : pr.getCardType();
        hgw.PassThruData = pr == null ? "" : pr.getPassThruData();
        hgw.ReturnReason = pr == null ? "" : pr.getReturnReason();
        hgw.StationId = pr == null ? "" : pr.getStationId();
        hgw.Token = pr == null ? "" : pr.getToken();
        hgw.TokenRequestFlag = pr == null ? "" : pr.getTokenRequestFlag();
        hgw.TokenSerialNum = pr == null ? "" : pr.getTokenSerialNum();

        return hgw;
    }

    private com.pax.poslink.PaymentRequest.TransactionBehavior getTransactionBehavior(pax_sdk.TransactionBehavior pr) {

        com.pax.poslink.PaymentRequest.TransactionBehavior tb = new PaymentRequest.TransactionBehavior();

        tb.AcceptedCardType = pr == null ? "" : pr.getAcceptedCardType();
        tb.AcceptedCardType = pr == null ? "" : pr.getAcceptedCardType();
        tb.AddlRspDataFlag = pr == null ? "" : pr.getAddlRspDataFlag();

        return tb;

    }

    private com.pax.poslink.PaymentRequest.Original getOriginal(pax_sdk.Original pr) {

        com.pax.poslink.PaymentRequest.Original o = new PaymentRequest.Original();

        o.Amount = pr == null ? "" : pr.getAmount();
        o.Pan = pr == null ? "" : pr.getPan();
        o.PaymentService2000 = pr == null ? "" : pr.getPaymentService2000();
        o.BatchNumber = pr == null ? "" : pr.getBatchNumber();
        o.ExpiryDate = pr == null ? "" : pr.getExpiryDate();
        o.AuthorizationResponse = pr == null ? "" : pr.getAuthorizationResponse();
        o.SettlementDate = pr == null ? "" : pr.getSettlementDate();
        o.TransDate = pr == null ? "" : pr.getTransDate();;
        o.TransId = pr == null ? "" : pr.getTransId();
        o.TransTime = pr == null ? "" : pr.getTransTime();
        o.TransType = pr == null ? "" : pr.getTransType();

        return o;
    }

    private FleetCard getFleetCard(pax_sdk.FleetCard pr) {

        FleetCard fc = new FleetCard();

        fc.CustomerData = pr == null ? "" : pr.getCustomerData();
        fc.DepartmentNumber = pr == null ? "" : pr.getDepartmentNumber();
        fc.DriverId = pr == null ? "" : pr.getDriverId();
        fc.FleetPromptCode = pr == null ? "" : pr.getFleetPromptCode();
        fc.EmployeeNumber = pr == null ? "" : pr.getEmployeeNumber();
        fc.JobId = pr == null ? "" : pr.getJobId();
        fc.JobNumber = pr == null ? "" : pr.getJobNumber();
        fc.LicenseNumber = pr == null ? "" : pr.getLicenseNumber();
        fc.Odometer = pr == null ? "" : pr.getOdometer();
        fc.UserId = pr == null ? "" : pr.getUserId();
        fc.VehicleId = pr == null ? "" : pr.getVehicleId();
        fc.VehicleNumber = pr == null ? "" : pr.getVehicleNumber();

        return fc;
    }

    private MultiMerchant getMultiMerchant(pax_sdk.MultiMerchant pr) {

        MultiMerchant mm = new MultiMerchant();

        mm.Name = pr == null ? "" : pr.getName();
        mm.Id = pr == null ? "" : pr.getId();

        return mm;
    }

    private com.pax.poslink.PaymentRequest.LodgingInfo getLodgingInfo(pax_sdk.LodgingInfo pr) {
        com.pax.poslink.PaymentRequest.LodgingInfo li = new PaymentRequest.LodgingInfo();

        li.ChargeType = pr == null ? "" : pr.getChargeType();
        li.CheckInDate = pr == null ? "" : pr.getCheckInDate();
        li.LodgingItems = getLodgingItems(pr == null ? new ArrayList<>() : pr.getLodgingItems());
        li.CheckOutDate = pr == null ? "" : pr.getCheckOutDate();
        li.FolioNumber = pr == null ? "" : pr.getFolioNumber();
        li.DepartureAdjustedAmount = pr == null ? "" : pr.getDepartureAdjustedAmount();
        li.NoShowFlag = pr == null ? "" : pr.getNoShowFlag();
        li.ChargeType = pr == null ? "" : pr.getChargeType();
        li.RoomNumber = pr == null ? "" : pr.getRoomNumber();
        li.RoomRates = getRoomRates(pr.getRoomRates());
        li.SpecialProgramCode = pr.getSpecialProgramCode();

        return  li;
    }

    private List<com.pax.poslink.PaymentRequest.LodgingInfo.RoomRates> getRoomRates(List<pax_sdk.RoomRates> pr) {
        List<com.pax.poslink.PaymentRequest.LodgingInfo.RoomRates> rrl = new ArrayList<>();

        for(pax_sdk.RoomRates rr : pr){
            com.pax.poslink.PaymentRequest.LodgingInfo.RoomRates temp = new PaymentRequest.LodgingInfo.RoomRates();
            temp.RoomRateAmount = rr.getRoomRateAmount();
            temp.RoomRateTax = rr.getRoomRateTax();
            temp.StayDuration = rr.getStayDuration();
            rrl.add(temp);
        }
        return  rrl;

    }

    private List<com.pax.poslink.PaymentRequest.LodgingInfo.LodgingItem> getLodgingItems(List<pax_sdk.LodgingItem> pr) {
        List<PaymentRequest.LodgingInfo.LodgingItem> lil = new ArrayList<>();

        for (pax_sdk.LodgingItem li: pr) {
            PaymentRequest.LodgingInfo.LodgingItem temp = new com.pax.poslink.PaymentRequest.LodgingInfo.LodgingItem();
            temp.ItemType = li.getItemType();
            temp.ItemAmount = li.getItemAmount();
            temp.ItemCode = li.getItemCode();

            lil.add(temp);
        }

        return lil;
    }


    private  PaymentRequest.HostCredentialInformation getHostCredentialInformation(pax_sdk.HostCredentialInformation pr){
        com.pax.poslink.PaymentRequest.HostCredentialInformation  hci = new PaymentRequest.HostCredentialInformation();

            hci.MID = pr == null ? pr.getMID() :  "";
            hci.ServicePassword = pr == null? "":pr.getServicePassword();
            hci.ServiceUser = pr == null? "":pr.getServiceUser();


        return hci;
    }

    private PaymentRequest.AutoRentalInfo getAutoRentalInfo(pax_sdk.AutoRentalInfo pr){
        PaymentRequest.AutoRentalInfo ari = new PaymentRequest.AutoRentalInfo();

        ari.AgreementNumber = pr.getAgreementNumber();
        ari.AllocatedMiles = pr.getAllocatedMiles();;
        ari.CustomerTaxID = pr.getCustomerTaxID();
        ari.DailyRate = pr.getDailyRate();
        ari.DriverLicenseNumber = pr.getDriverLicenseNumber();
        ari.ExtraChargeItems = getExtraChargeItemsList(pr.getExtraChargeItems());
        ari.ExtraChargesAmount = pr.getExtraChargesAmount();
        ari.InsuranceAmount = pr.getInsuranceAmount();
        ari.MileRate = pr.getMileRate();
        ari.Name = pr.getName();;
        ari.PickupCity = pr.getPickupCity();
        ari.PickupCountryCode = pr.getPickupCountryCode();
        ari.PickupDatetime = pr.getPickupDatetime();
        ari.PickupLocationName = pr.getPickupLocationName();;
        ari.PickupState = pr.getPickupState();
        ari.RentalDuration = pr.getRentalDuration();
        ari.RentalProgramType = pr.getRentalProgramType();
        ari.ReturnCity = pr.getReturnCity();
        ari.ReturnCountryCode = pr.getReturnCountryCode();
        ari.ReturnDatetime = pr.getReturnDatetime();
        ari.ReturnLocation = pr.getReturnLocation();
        ari.ReturnState = pr.getReturnState();
        ari.TotalMiles = pr.getTotalMiles();
        ari.VehicleClassID = pr.getVehicleClassID();

        return ari;
    }

    private List<PaymentRequest.AutoRentalInfo.ExtraChargeItem> getExtraChargeItemsList(List<pax_sdk.ExtraChargeItem> pr){
        List<PaymentRequest.AutoRentalInfo.ExtraChargeItem> ecil = new ArrayList<>();
        com.pax.poslink.PaymentRequest.AutoRentalInfo.ExtraChargeItem temp =
                new com.pax.poslink.PaymentRequest.AutoRentalInfo.ExtraChargeItem();
        for (pax_sdk.ExtraChargeItem  eci : pr){
            temp.ExtraChargeAmount = eci.getExtraChargeAmount();
            temp.ItemType = eci.getItemType();;
            ecil.add(temp);
        }

        return ecil;
    }

}
