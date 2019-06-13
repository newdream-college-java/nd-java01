package com.yb.entity;

public class GoodsSpuValue {
	private int pcngsvId;
	private int pcngsvPctId;
	private int pcngsvGsid;
	private int adultPrice;
	private int childrenPrice;	
	private int largePriceAndSmallPrice;
	private int counterPrice;
	private int netPurchasing;
	public GoodsSpuValue() {
	
	}
	public GoodsSpuValue(int pcngsvId, int pcngsvPctId, int pcngsvGsid,
			int adultPrice, int childrenPrice, int largePriceAndSmallPrice,
			int counterPrice, int netPurchasing) {
		super();
		this.pcngsvId = pcngsvId;
		this.pcngsvPctId = pcngsvPctId;
		this.pcngsvGsid = pcngsvGsid;
		this.adultPrice = adultPrice;
		this.childrenPrice = childrenPrice;
		this.largePriceAndSmallPrice = largePriceAndSmallPrice;
		this.counterPrice = counterPrice;
		this.netPurchasing = netPurchasing;
	}
	public int getPcngsvId() {
		return pcngsvId;
	}
	public void setPcngsvId(int pcngsvId) {
		this.pcngsvId = pcngsvId;
	}
	public int getPcngsvPctId() {
		return pcngsvPctId;
	}
	public void setPcngsvPctId(int pcngsvPctId) {
		this.pcngsvPctId = pcngsvPctId;
	}
	public int getPcngsvGsid() {
		return pcngsvGsid;
	}
	public void setPcngsvGsid(int pcngsvGsid) {
		this.pcngsvGsid = pcngsvGsid;
	}
	public int getAdultPrice() {
		return adultPrice;
	}
	public void setAdultPrice(int adultPrice) {
		this.adultPrice = adultPrice;
	}
	public int getChildrenPrice() {
		return childrenPrice;
	}
	public void setChildrenPrice(int childrenPrice) {
		this.childrenPrice = childrenPrice;
	}
	public int getLargePriceAndSmallPrice() {
		return largePriceAndSmallPrice;
	}
	public void setLargePriceAndSmallPrice(int largePriceAndSmallPrice) {
		this.largePriceAndSmallPrice = largePriceAndSmallPrice;
	}
	public int getCounterPrice() {
		return counterPrice;
	}
	public void setCounterPrice(int counterPrice) {
		this.counterPrice = counterPrice;
	}
	public int getNetPurchasing() {
		return netPurchasing;
	}
	public void setNetPurchasing(int netPurchasing) {
		this.netPurchasing = netPurchasing;
	}
	@Override
	public String toString() {
		return "PcnGoodsSpuValue [pcngsvId=" + pcngsvId + ", pcngsvPctId="
				+ pcngsvPctId + ", pcngsvGsid=" + pcngsvGsid + ", adultPrice="
				+ adultPrice + ", childrenPrice=" + childrenPrice
				+ ", largePriceAndSmallPrice=" + largePriceAndSmallPrice
				+ ", counterPrice=" + counterPrice + ", netPurchasing="
				+ netPurchasing + "]";
	}
	
	
}
