package com.cc.entity;

public class SpProduct {
	private int spppMid;
	private String sppName;
	private String sppCreateTime;
	private String sppVippice;
	private String sppInputTime;
	private String sppPromotion;
	private String sppRecommend;
	public SpProduct() {
	}
	public SpProduct(int spppMid, String sppName, String sppCreateTime,
			String sppVippice, String sppInputTime, String sppPromotion,
			String sppRecommend) {
		super();
		this.spppMid = spppMid;
		this.sppName = sppName;
		this.sppCreateTime = sppCreateTime;
		this.sppVippice = sppVippice;
		this.sppInputTime = sppInputTime;
		this.sppPromotion = sppPromotion;
		this.sppRecommend = sppRecommend;
	}
	public int getSpppMid() {
		return spppMid;
	}
	public void setSpppMid(int spppMid) {
		this.spppMid = spppMid;
	}
	public String getSppName() {
		return sppName;
	}
	public void setSppName(String sppName) {
		this.sppName = sppName;
	}
	public String getSppCreateTime() {
		return sppCreateTime;
	}
	public void setSppCreateTime(String sppCreateTime) {
		this.sppCreateTime = sppCreateTime;
	}
	public String getSppVippice() {
		return sppVippice;
	}
	public void setSppVippice(String sppVippice) {
		this.sppVippice = sppVippice;
	}
	public String getSppInputTime() {
		return sppInputTime;
	}
	public void setSppInputTime(String sppInputTime) {
		this.sppInputTime = sppInputTime;
	}
	public String getSppPromotion() {
		return sppPromotion;
	}
	public void setSppPromotion(String sppPromotion) {
		this.sppPromotion = sppPromotion;
	}
	public String getSppRecommend() {
		return sppRecommend;
	}
	public void setSppRecommend(String sppRecommend) {
		this.sppRecommend = sppRecommend;
	}
	@Override
	public String toString() {
		return "SpProduct [sppCreateTime=" + sppCreateTime + ", sppInputTime="
				+ sppInputTime + ", sppName=" + sppName + ", sppPromotion="
				+ sppPromotion + ", sppRecommend=" + sppRecommend
				+ ", sppVippice=" + sppVippice + ", spppMid=" + spppMid + "]\n";
	}
	
}
