package com.GS.BlueDart.EntityModels;

import org.springframework.stereotype.Component;

import javax.persistence.*;

import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * @author gp
 */

@Component
@Entity
@Table(name = "shipment")
public class OrderPlacementResponse {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipment_id")
    private Integer shipmentId;

    @Column(name = "awb_number")
    private String awbNumber;

    @Column(name = "shipper_id")
    private Integer shipperId;

    @Column(name = "warehouse_id")
    private Integer wareHouseId;

    @Column(name = "user_id")
    private BigInteger userId;

    @Column(name = "shipper_order_id")
    private String shipperOrderId;

    @Column(name = "order_id")
    private BigInteger orderId;

    @Column(name = "rto_as_pickup")
    private Boolean isRtoSameAsPickup;

    @Column(name = "shipper_status")
    private String shipperStatus;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "modified_date")
    private Timestamp modifiedDate;

    @Column(name = "rto_address")
    private String rtoAddress;

    @Column(name = "rto_pincode")
    private Integer rtoPincode;

    @Column(name = "rto_city")
    private String rtoCity;

    @Column(name = "rto_phone")
    private String rtoPhone;

    @Column(name = "rto_state")
    private String rtoState;

    @Column(name = "shipment_status")
    private String shipmentStatus;

    @Column(name = "shipment_location")
    private String shipmentLocation;

    @Column(name = "invoice_url")
    private String invoiceUrl;

    @Column(name = "label_url")
    private String labelUrl;

    @Column(name = "manifest_url")
    private String manifestUrl;

    @Column(name = "manifest_number")
    private Integer manifestNumber;

    @Column(name = "ndr_count")
    private Integer ndrCount;

    @Column(name = "is_picked_from_warehouse", columnDefinition = "boolean default false")
    private boolean isPickedFormWareHouse;

    @Column(name = "is_cancelled", columnDefinition = "boolean default false")
    private boolean isCancelled;

    @Column(name = "is_delivered", columnDefinition = "boolean default false")
    private boolean isDelivered;

    @Column(name = "estimated_shipping_cost", columnDefinition = "double precision default 0")
    private double estimatedShippingCost;

    @Column(name = "shipping_zone")
    private String shippingZone;

    @Column(name = "shipment_length", columnDefinition = "character varying default ''")
    private String shipmentLength;

    @Column(name = "shipment_breadth", columnDefinition = "character varying default ''")
    private String shipmentBreadth;

    @Column(name = "shipment_height", columnDefinition = "character varying default ''")
    private String shipmentHeight;

    @Column(name = "shipment_dead_weight", columnDefinition = "character varying default ''")
    private String shipmentDeadWeight;


    @Column(name = "shipment_tat", columnDefinition = "character varying default ''")
    private String tat;

    @Column(name = "shipment_cost_type", columnDefinition = "character varying default ''")
    private String costType;

    @Column(name = "shipment_invoice_no", columnDefinition = "character varying default ''")
    private String invoiceNo;

    @Column(name = "shipment_shop_order_number", columnDefinition = "character varying default ''")
    private String shopOrderNumber;


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

    public String getShipmentLength() {
        return shipmentLength;
    }

    public void setShipmentLength(String shipmentLength) {
        this.shipmentLength = shipmentLength;
    }

    public String getShipmentBreadth() {
        return shipmentBreadth;
    }

    public void setShipmentBreadth(String shipmentBreadth) {
        this.shipmentBreadth = shipmentBreadth;
    }

    public String getShipmentHeight() {
        return shipmentHeight;
    }

    public void setShipmentHeight(String shipmentHeight) {
        this.shipmentHeight = shipmentHeight;
    }

    public String getShipmentDeadWeight() {
        return shipmentDeadWeight;
    }

    public void setShipmentDeadWeight(String shipmentDeadWeight) {
        this.shipmentDeadWeight = shipmentDeadWeight;
    }

    public Boolean getRtoSameAsPickup() {
        return isRtoSameAsPickup;
    }

    public void setRtoSameAsPickup(Boolean rtoSameAsPickup) {
        isRtoSameAsPickup = rtoSameAsPickup;
    }

    public boolean isPickedFormWareHouse() {
        return isPickedFormWareHouse;
    }

    public void setPickedFormWareHouse(boolean pickedFormWareHouse) {
        isPickedFormWareHouse = pickedFormWareHouse;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public double getEstimatedShippingCost() {
        return estimatedShippingCost;
    }

    public void setEstimatedShippingCost(double estimatedShippingCost) {
        this.estimatedShippingCost = estimatedShippingCost;
    }

    public String getShippingZone() {
        return shippingZone;
    }

    public void setShippingZone(String shippingZone) {
        this.shippingZone = shippingZone;
    }

    public String getLabelUrl() {
        return labelUrl;
    }

    public void setLabelUrl(String labelUrl) {
        this.labelUrl = labelUrl;
    }

    public String getManifestUrl() {
        return manifestUrl;
    }

    public void setManifestUrl(String manifestUrl) {
        this.manifestUrl = manifestUrl;
    }

    public Integer getManifestNumber() { return manifestNumber; }

    public void setManifestNumber(Integer manifestNumber) { this.manifestNumber = manifestNumber; }

    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    public void setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
    }

    public String getShipmentLocation() {
        return shipmentLocation;
    }

    public void setShipmentLocation(String shipmentLocation) {
        this.shipmentLocation = shipmentLocation;
    }


    public Integer getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Integer shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getAwbNumber() {
        return awbNumber;
    }

    public void setAwbNumber(String awbNumber) {
        this.awbNumber = awbNumber;
    }

    public Integer getShipperId() {
        return shipperId;
    }

    public void setShipperId(Integer shipperId) {
        this.shipperId = shipperId;
    }

    public Integer getWareHouseId() {
        return wareHouseId;
    }

    public void setWareHouseId(Integer wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getShipperOrderId() {
        return shipperOrderId;
    }

    public void setShipperOrderId(String shipperOrderId) {
        this.shipperOrderId = shipperOrderId;
    }

    @Deprecated
    public BigInteger getOrderId() {
        return orderId;
    }

    @Deprecated
    public void setOrderId(BigInteger orderId) {
        this.orderId = orderId;
    }

    public Boolean getIsRtoSameAsPickup() {
        return isRtoSameAsPickup;
    }

    public void setIsRtoSameAsPickup(Boolean isRtoSameAsPickup) {
        this.isRtoSameAsPickup = isRtoSameAsPickup;
    }

    public String getShipperStatus() {
        return shipperStatus;
    }

    public void setShipperStatus(String shipperStatus) {
        this.shipperStatus = shipperStatus;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getRtoAddress() {
        return rtoAddress;
    }

    public void setRtoAddress(String rtoAddress) {
        this.rtoAddress = rtoAddress;
    }

    public Integer getRtoPincode() {
        return rtoPincode;
    }

    public void setRtoPincode(Integer rtoPincode) {
        this.rtoPincode = rtoPincode;
    }

    public String getRtoCity() {
        return rtoCity;
    }

    public void setRtoCity(String rtoCity) {
        this.rtoCity = rtoCity;
    }

    public String getRtoPhone() {
        return rtoPhone;
    }

    public void setRtoPhone(String rtoPhone) {
        this.rtoPhone = rtoPhone;
    }

    public String getRtoState() {
        return rtoState;
    }

    public void setRtoState(String rtoState) {
        this.rtoState = rtoState;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public Integer getNdrCount() {
        return ndrCount;
    }

    public void setNdrCount(Integer ndrCount) {
        this.ndrCount = ndrCount;
    }

    @Override
    public String toString() {
        return "OrderPlacementResponse [shipmentId=" + shipmentId + ", awbNumber=" + awbNumber + ", shipperId="
                + shipperId + ", wareHouseId=" + wareHouseId + ", userId=" + userId + ", shipperOrderId="
                + shipperOrderId + ", orderId=" + orderId + ", isRtoSameAsPickup=" + isRtoSameAsPickup
                + ", shipperStatus=" + shipperStatus + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
                + ", rtoAddress=" + rtoAddress + ", rtoPincode=" + rtoPincode + ", rtoCity=" + rtoCity + ", rtoPhone="
                + rtoPhone + ", rtoState=" + rtoState + ", subOrderSatus=" + shipmentStatus + ", shipmentLocation="
                + shipmentLocation + ", invoiceUrl=" + invoiceUrl + ", labelUrl=" + labelUrl + ", manifestUrl="
                + manifestUrl + "]";
    }


    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public String getShopOrderNumber() {
        return shopOrderNumber;
    }

    public void setShopOrderNumber(String shopOrderNumber) {
        this.shopOrderNumber = shopOrderNumber;
    }
}
