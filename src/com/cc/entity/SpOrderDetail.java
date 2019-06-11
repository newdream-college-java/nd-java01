package com.cc.entity;

public class SpOrderDetail {
	private int spodId;
	private String spoProduct;
	private int spodCount;
	private String spodPrice;
	private String spodTotalprice;
	private int spoNumber;
	public SpOrderDetail() {
	}
	public SpOrderDetail(int spodId, String spoProduct, int spodCount,
			String spodPrice, String spodTotalprice, int spoNumber) {
		super();
		this.spodId = spodId;
		this.spoProduct = spoProduct;
		this.spodCount = spodCount;
		this.spodPrice = spodPrice;
		this.spodTotalprice = spodTotalprice;
		this.spoNumber = spoNumber;
	}
	public int getSpodId() {
		return spodId;
	}
	public void setSpodId(int spodId) {
		this.spodId = spodId;
	}
	public String getSpoProduct() {
		return spoProduct;
	}
	public void setSpoProduct(String spoProduct) {
		this.spoProduct = spoProduct;
	}
	public int getSpodCount() {
		return spodCount;
	}
	public void setSpodCount(int spodCount) {
		this.spodCount = spodCount;
	}
	public String getSpodPrice() {
		return spodPrice;
	}
	public void setSpodPrice(String spodPrice) {
		this.spodPrice = spodPrice;
	}
	public String getSpodTotalprice() {
		return spodTotalprice;
	}
	public void setSpodTotalprice(String spodTotalprice) {
		this.spodTotalprice = spodTotalprice;
	}
	public int getSpoNumber() {
		return spoNumber;
	}
	public void setSpoNumber(int spoNumber) {
		this.spoNumber = spoNumber;
	}
	@Override
	public String toString() {
		return "SpOrderDetail [spoNumber=" + spoNumber + ", spoProduct="
				+ spoProduct + ", spodCount=" + spodCount + ", spodId="
				+ spodId + ", spodPrice=" + spodPrice + ", spodTotalprice="
				+ spodTotalprice + "]\n";
	}
	
}
