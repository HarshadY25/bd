/**
 * 
 */
package com.GS.BlueDart.Models;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * @author gp
 *
 */
public class TrackOrderResponse {
	
	private ArrayList<EachShipment> trackOrderResponse;
	
	
	
	
	
	@Override
	public String toString() {
		return "TrackOrderResponse [trackOrderResponse=" + trackOrderResponse + "]";
	}





	/**
	 * @return the trackOrderResponse
	 */
	public ArrayList<EachShipment> getTrackOrderResponse() {
		return trackOrderResponse;
	}





	/**
	 * @param trackOrderResponse the trackOrderResponse to set
	 */
	public void setTrackOrderResponse(ArrayList<EachShipment> trackOrderResponse) {
		this.trackOrderResponse = trackOrderResponse;
	}





	public static  class EachShipment{
	
	private String message;
	private Boolean isSuccess;
	private String 	shipperStatus;
	private String shipmentLocation;
	private Timestamp modifiedDate;
	private String awb;
	private Integer shipperId;
	private String remark;
	private String statusType;
	private String rider_name;
	private String rider_contact;

	public String getRider_name() {
	return rider_name;
}

	public void setRider_name(String rider_name) {
		this.rider_name = rider_name;
	}

	public String getRider_contact() {
		return rider_contact;
	}

	public void setRider_contact(String rider_contact) {
		this.rider_contact = rider_contact;
	}

	public String getStatusType() {
		return statusType;
	}
	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getShipperId() {
		return shipperId;
	}
	public void setShipperId(Integer shipperId) {
		this.shipperId = shipperId;
	}
	/**
	 * @return the awb
	 */
	public String getAwb() {
		return awb;
	}
	/**
	 * @param awb the awb to set
	 */
	public void setAwb(String awb) {
		this.awb = awb;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getShipperStatus() {
		return shipperStatus;
	}
	public void setShipperStatus(String shipperStatus) {
		this.shipperStatus = shipperStatus;
	}
	public String getShipmentLocation() {
		return shipmentLocation;
	}
	public void setShipmentLocation(String shipmentLocation) {
		this.shipmentLocation = shipmentLocation;
	}
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@Override
	public String toString() {
		return "EachShipment [message=" + message + ", isSuccess=" + isSuccess + ", shipperStatus=" + shipperStatus
				+ ", shipmentLocation=" + shipmentLocation + ", modifiedDate=" + modifiedDate + ", awb=" + awb
				+ ", shipperId=" + shipperId + ", remark=" + remark + ", statusType=" + statusType + "]";
	}
	
	
	}
	
	
	
	

}
