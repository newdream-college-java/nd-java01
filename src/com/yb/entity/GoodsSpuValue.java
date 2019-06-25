package com.yb.entity;

public class GoodsSpuValue {
	private int pcngsvId;//����ֵid
	private int pcngsvPctId;//����id
	private int pcngsvGsid;	//������id
	private int largePriceAndSmallPrice;//һ��һС
	private int adultPrice;//���˼�
	private int childrenPrice;//��ͯ��
	private int storePrice;//�ŵ��
	
	public GoodsSpuValue() {
	
	}
	
	

	public GoodsSpuValue(int pcngsvId, int pcngsvPctId, int pcngsvGsid,
			int largePriceAndSmallPrice, int adultPrice, int childrenPrice,
			int storePrice) {
		super();
		this.pcngsvId = pcngsvId;
		this.pcngsvPctId = pcngsvPctId;
		this.pcngsvGsid = pcngsvGsid;
		this.largePriceAndSmallPrice = largePriceAndSmallPrice;
		this.adultPrice = adultPrice;
		this.childrenPrice = childrenPrice;
		this.storePrice = storePrice;
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
	
	
	public int getStorePrice() {
		return storePrice;
	}

	public void setStorePrice(int storePrice) {
		this.storePrice = storePrice;
	}



	@Override
	public String toString() {
		return "GoodsSpuValue [pcngsvId=" + pcngsvId + ", pcngsvPctId="
				+ pcngsvPctId + ", pcngsvGsid=" + pcngsvGsid
				+ ", largePriceAndSmallPrice=" + largePriceAndSmallPrice
				+ ", adultPrice=" + adultPrice + ", childrenPrice="
				+ childrenPrice + ", storePrice=" + storePrice + "]";
	}

	
	
	
	
	
}
