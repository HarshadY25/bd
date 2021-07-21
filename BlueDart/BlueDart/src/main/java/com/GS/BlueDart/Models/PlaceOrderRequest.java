/**
 *
 */
package com.GS.BlueDart.Models;

import java.util.ArrayList;
import java.util.HashMap;

public class PlaceOrderRequest implements Cloneable {

    private String channelOrderId;

    private PersonalDetails shippingDetails;

    private ArrayList<OrderDetails> subOrderdetail;

    private Boolean isCod;

    private Boolean isFragile;

    private Boolean rtoSameAsPickup;

    private PersonalDetails rto;

    private PersonalDetails pickupDetails;

    private int shipperId;

    private int warehouseId;
    private String awb;
    private String paymentType;
    private String shipmentId;
    private String date;

    private String clientName;

    private String clientGSTIN;

    private String shipmentWidth;

    private String sortCode;

    private String totalAmount;

    private String shipmentLength;

    private String totalShipmentWeight;

    private String invoiceNo;

    private String shipmentHeight;

    private String shippperName;

    private String shippingSymbol;
    private String origin_code;

    private String tat;
    private String costType;
    private String shopOrderNo;
    private String totalCODAmount;
    private double estimatedShippingCost;
    private String barcodeAWB;
    private String barcodeShopOrderNo;
    private HashMap<String, String> orgIdToName = new HashMap<String, String>();
    private HashMap<String, String> orgIdToGSTIN = new HashMap<String, String>();
//    private HashMap<String, String> orgIdToName = new HashMap<String, String>();
    //orgIdToName.put("da", "sd");


    public String getOrigin_code() { return origin_code; }

    public void setOrigin_code(String origin_code) { this.origin_code = origin_code; }

    public HashMap<String, String> getOrgIdToName() {
        return orgIdToName;
    }

    public void setOrgIdToName(HashMap<String, String> orgIdToName) {
        this.orgIdToName = orgIdToName;
    }

    public HashMap<String, String> getOrgIdToGSTIN() {
        return orgIdToGSTIN;
    }

    public void setOrgIdToGSTIN(HashMap<String, String> orgIdToGSTIN) {
        this.orgIdToGSTIN = orgIdToGSTIN;
    }

    public String getBarcodeAWB() {
        return barcodeAWB;
    }

    public void setBarcodeAWB(String barcodeAWB) {
        this.barcodeAWB = barcodeAWB;
    }

    public String getBarcodeShopOrderNo() {
        return barcodeShopOrderNo;
    }

    public void setBarcodeShopOrderNo(String barcodeShopOrderNo) {
        this.barcodeShopOrderNo = barcodeShopOrderNo;
    }




    private boolean is_warehouse_used;
    private boolean is_shipper_used;
    private String wareHouseOwner;

    public String getChannelOrderId() {
        return channelOrderId;
    }

    public void setChannelOrderId(String channelOrderId) {
        this.channelOrderId = channelOrderId;
    }

    public String getTotalCODAmount() {
        return totalCODAmount;
    }

    public void setTotalCODAmount(String totalCODAmount) {
        this.totalCODAmount = totalCODAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientGSTIN() {
        return clientGSTIN;
    }

    public void setClientGSTIN(String clientGSTIN) {
        this.clientGSTIN = clientGSTIN;
    }

    public String getShipmentWidth() {
        return shipmentWidth;
    }

    public void setShipmentWidth(String shipmentWidth) {
        this.shipmentWidth = shipmentWidth;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getShipmentLength() {
        return shipmentLength;
    }

    public void setShipmentLength(String shipmentLength) {
        this.shipmentLength = shipmentLength;
    }

    public String getTotalShipmentWeight() {
        return totalShipmentWeight;
    }

    public void setTotalShipmentWeight(String totalShipmentWeight) {
        this.totalShipmentWeight = totalShipmentWeight;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getShipmentHeight() {
        return shipmentHeight;
    }

    public void setShipmentHeight(String shipmentHeight) {
        this.shipmentHeight = shipmentHeight;
    }

    public String getShippperName() {
        return shippperName;
    }

    public void setShippperName(String shippperName) {
        this.shippperName = shippperName;
    }

    public String getShippingSymbol() {
        return shippingSymbol;
    }

    public void setShippingSymbol(String shippingSymbol) {
        this.shippingSymbol = shippingSymbol;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Boolean getIsCod() {
        return isCod;
    }

    public void setIsCod(Boolean isCod) {
        this.isCod = isCod;
    }

    public Boolean getIsFragile() {
        return isFragile;
    }

    public void setIsFragile(Boolean isFragile) {
        this.isFragile = isFragile;
    }

    public PersonalDetails getRto() {
        return rto;
    }

    public void setRto(PersonalDetails rto) {
        this.rto = rto;
    }


    public PersonalDetails getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(PersonalDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public ArrayList<OrderDetails> getSubOrderdetail() {
        return subOrderdetail;
    }

    public void setSubOrderdetail(ArrayList<OrderDetails> subOrderdetail) {
        this.subOrderdetail = subOrderdetail;
    }

    public Boolean getRtoSameAsPickup() {
        return rtoSameAsPickup;
    }

    public void setRtoSameAsPickup(Boolean rtoSameAsPickup) {
        this.rtoSameAsPickup = rtoSameAsPickup;
    }

    public PersonalDetails getPickupDetails() {
        return pickupDetails;
    }

    public void setPickupDetails(PersonalDetails pickupDetails) {
        this.pickupDetails = pickupDetails;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }

    public String getTat() {
        return tat;
    }

    public void setTat(String tat) {
        this.tat = tat;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getShopOrderNo() {
        return shopOrderNo;
    }

    public void setShopOrderNo(String shopOrderNo) {
        this.shopOrderNo = shopOrderNo;
    }


    public String getWareHouseOwner() {
        return wareHouseOwner;
    }

    public void setWareHouseOwner(String wareHouseOwner) {
        this.wareHouseOwner = wareHouseOwner;
    }

    public boolean isIs_warehouse_used() {
        return is_warehouse_used;
    }

    public void setIs_warehouse_used(boolean is_warehouse_used) {
        this.is_warehouse_used = is_warehouse_used;
    }

    public boolean isIs_shipper_used() {
        return is_shipper_used;
    }

    public void setIs_shipper_used(boolean is_shipper_used) {
        this.is_shipper_used = is_shipper_used;
    }

    public double getEstimatedShippingCost() {
        return estimatedShippingCost;
    }

    public void setEstimatedShippingCost(double estimatedShippingCost) {
        this.estimatedShippingCost = estimatedShippingCost;
    }

    //@Override
    public Object clone() throws CloneNotSupportedException {
        PlaceOrderRequest placeOrderRequestClone = (PlaceOrderRequest) super.clone();
        return placeOrderRequestClone;
    }

    @Override
    public String toString() {
        return "PlaceOrderRequest [channelOrderId=" + channelOrderId + ", shippingDetails=" + shippingDetails
                + ", subOrderdetail=" + subOrderdetail + ", isCod=" + isCod + ", isFragile=" + isFragile
                + ", rtoSameAsPickup=" + rtoSameAsPickup + ", rto=" + rto + ", pickupDetails=" + pickupDetails
                + ", shipperId=" + shipperId + ", warehouseId=" + warehouseId + ", awb=" + awb + ", paymentType="
                + paymentType + ", shipmentId=" + shipmentId + ", date=" + date + ", clientName=" + clientName
                + ", clientGSTIN=" + clientGSTIN + ", shipmentWidth=" + shipmentWidth + ", sortCode=" + sortCode
                + ", totalAmount=" + totalAmount + ", shipmentLength=" + shipmentLength + ", totalShipmentWeight="
                + totalShipmentWeight + ", invoiceNo=" + invoiceNo + ", shipmentHeight=" + shipmentHeight
                + ", shippperName=" + shippperName + ", shippingSymbol=" + shippingSymbol + ", tat=" + tat
                + ", costType=" + costType + ", shopOrderNo=" + shopOrderNo + ", totalCODAmount=" + totalCODAmount
                + "]";
    }


}
