/**
 * 
 */
package com.GS.BlueDart.Models;

/**
 * @author gp
 *
 */
public class OrderDetails {
	 
	private String productName;
	private String productPrice;
	private int quantity;
	private int subOrderId;
	private int deadWeight;
	private int length;
	private int breadth;
	private int height;
	private int totaltaxes;
	private String codAmount;
    private String channelID;
    private String channelListingID;
    private String hsn;
    private int srNo;

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public String getHsn() {
		return hsn;
	}
	public void setHsn(String hsn) {
		this.hsn = hsn;
	}
	public String getChannelID() {
		return channelID;
	}
	public void setChannelID(String channelID) {
		this.channelID = channelID;
	}
	public String getChannelListingID() {
		return channelListingID;
	}
	public void setChannelListingID(String channelListingID) {
		this.channelListingID = channelListingID;
	}
	public int getDeadWeight() {
		return deadWeight;
	}
	public void setDeadWeight(int deadWeight) {
		this.deadWeight = deadWeight;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public int getTotaltaxes() {
		return totaltaxes;
	}
	public void setTotaltaxes(int totaltaxes) {
		this.totaltaxes = totaltaxes;
	}
	public String getCodAmount() {
		return codAmount;
	}
	public void setCodAmount(String codAmount) {
		this.codAmount = codAmount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public int getSubOrderId() {
		return subOrderId;
	}
	public void setSubOrderId(int subOrderId) {
		this.subOrderId = subOrderId;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "OrderDetails [productName=" + productName + ", productPrice=" + productPrice + ", quantity=" + quantity
				+ ", subOrderId=" + subOrderId + ", deadWeight=" + deadWeight + ", length=" + length + ", breadth="
				+ breadth + ", height=" + height + ", totaltaxes=" + totaltaxes + ", codAmount=" + codAmount
				+ ", channelID=" + channelID + ", channelListingID=" + channelListingID + ", hsn=" + hsn + "]";
	}


	
	
}
