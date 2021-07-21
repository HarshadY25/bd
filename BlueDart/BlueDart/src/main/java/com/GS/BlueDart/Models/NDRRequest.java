/**
 * 
 */
package com.GS.BlueDart.Models;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * @author gp
 *
 */
@Component
public class NDRRequest {
	
	/**
		 * @author gp
		 *
		 */
	public static class NdrRequest {
		
		private String awbNumber;

		private Integer shipmentId;

		private String shopOrderNumber;

		private String ndrKey;

		private Timestamp createdAt;

		private String newAddress;

		private String newContact;

		private String newDate;

		private String newpin;

		private String remarks;

		private Integer shipperId;

	//	private String ndrUserType;

	//	private String ndrSource;


		public NdrRequest(){

		}
		public NdrRequest(String awbNumber) {
			this.awbNumber = awbNumber;
		}


		public String getAwbNumber() {
			return awbNumber;
		}

		public void setAwbNumber(String awbNumber) {
			this.awbNumber = awbNumber;
		}

		public Integer getShipmentId() {
			return shipmentId;
		}

		public void setShipmentId(Integer shipmentId) {
			this.shipmentId = shipmentId;
		}

		public String getShopOrderNumber() {
			return shopOrderNumber;
		}

		public void setShopOrderNumber(String shopOrderNumber) {
			this.shopOrderNumber = shopOrderNumber;
		}


		public String getNdrKey() {
			return ndrKey;
		}

		public void setNdrKey(String ndrKey) {
			this.ndrKey = ndrKey;
		}

		public Integer getShipperId() {
			return shipperId;
		}

		public void setShipperId(Integer shipperId) {
			this.shipperId = shipperId;
		}

		public Timestamp getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(Timestamp createdAt) {
			this.createdAt = createdAt;
		}

		public String getNewAddress() {
			return newAddress;
		}

		public void setNewAddress(String newAddress) {
			this.newAddress = newAddress;
		}

		public String getNewContact() {
			return newContact;
		}

		public void setNewContact(String newContact) {
			this.newContact = newContact;
		}

		public String getNewDate() {
			return newDate;
		}

		public void setNewDate(String newDate) {
			this.newDate = newDate;
		}

		public String getNewpin() {
			return newpin;
		}

		public void setNewpin(String newpin) {
			this.newpin = newpin;
		}

		public String getRemarks() {
			return remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
	}

	private ArrayList<NdrRequest> ndrRequests;

	/**
	 * @return the ndrDetails
	 */
	public ArrayList<NdrRequest> getNdrRequests() {
		if (ndrRequests==null) return new ArrayList<NdrRequest>();
		return ndrRequests;
	}

	/**
	 * @param ndrRequests the ndrRequests to set
	 */
	public void setNdrRequests(ArrayList<NdrRequest> ndrRequests) {
		this.ndrRequests = ndrRequests;
	}
	
	
	
	

		
	
	
	
}
