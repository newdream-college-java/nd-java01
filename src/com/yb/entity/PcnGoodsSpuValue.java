package com.yb.entity;

public class PcnGoodsSpuValue {
	private int pcngssId;
	private int pcngssPctId;
	private int pcngsvGsid;
	private int Price;	
	public PcnGoodsSpuValue() {
	
	}
	public PcnGoodsSpuValue(int pcngssId, int pcngssPctId,int pcngsvGsid,
			int Price) {
		this.pcngssId = pcngssId;
		this.pcngssPctId = pcngssPctId;
		this.Price = Price;
		this.pcngsvGsid=pcngsvGsid;
	}
	
	public int getPcngsvGsid() {
		return pcngsvGsid;
	}
	public void setPcngsvGsid(int pcngsvGsid) {
		this.pcngsvGsid = pcngsvGsid;
	}
	public int getPcngssId() {
		return pcngssId;
	}
	public void setPcngssId(int pcngssId) {
		this.pcngssId = pcngssId;
	}
	public int getPcngssPctId() {
		return pcngssPctId;
	}
	public void setPcngssPctId(int pcngssPctId) {
		this.pcngssPctId = pcngssPctId;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int Price) {
		this.Price = Price;
	}
	@Override
	public String toString() {
		return "PcnGoodsSpuValue [pcngssId=" + pcngssId + ", pcngssPctId="
				+ pcngssPctId + ", pcngsvGsid=" + pcngsvGsid + ", Price="
				+ Price + "]";
	}
	
	
	
}
