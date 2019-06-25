package com.yb.vo;

import java.util.Date;

public class ParentChildThemeActivityShowVo {
	private int pcnpctId;
	private String pcnThemeName;
	private Date pcnStartTime;
	private Date pcnEndTime;
	private int pcnStatus;
	private String pcnSite;
	private int pcnMerchantActivity;
	private String imgUrl;
	private int price;
	public ParentChildThemeActivityShowVo() {
	
	}
	public ParentChildThemeActivityShowVo(int pcnpctId, String pcnThemeName,
			Date pcnStartTime, Date pcnEndTime, int pcnStatus,
			String pcnSite, int pcnMerchantActivity, String imgUrl, int price) {
		super();
		this.pcnpctId = pcnpctId;
		this.pcnThemeName = pcnThemeName;
		this.pcnStartTime = pcnStartTime;
		this.pcnEndTime = pcnEndTime;
		this.pcnStatus = pcnStatus;
		this.pcnSite = pcnSite;
		this.pcnMerchantActivity = pcnMerchantActivity;
		this.imgUrl = imgUrl;
		this.price = price;
	}
	public int getPcnpctId() {
		return pcnpctId;
	}
	public void setPcnpctId(int pcnpctId) {
		this.pcnpctId = pcnpctId;
	}
	public String getPcnThemeName() {
		return pcnThemeName;
	}
	public void setPcnThemeName(String pcnThemeName) {
		this.pcnThemeName = pcnThemeName;
	}
	public Date getPcnStartTime() {
		return pcnStartTime;
	}
	public void setPcnStartTime(Date pcnStartTime) {
		this.pcnStartTime = pcnStartTime;
	}
	public Date getPcnEndTime() {
		return pcnEndTime;
	}
	public void setPcnEndTime(Date pcnEndTime) {
		this.pcnEndTime = pcnEndTime;
	}
	public int getPcnStatus() {
		return pcnStatus;
	}
	public void setPcnStatus(int pcnStatus) {
		this.pcnStatus = pcnStatus;
	}
	public String getPcnSite() {
		return pcnSite;
	}
	public void setPcnSite(String pcnSite) {
		this.pcnSite = pcnSite;
	}
	public int getPcnMerchantActivity() {
		return pcnMerchantActivity;
	}
	public void setPcnMerchantActivity(int pcnMerchantActivity) {
		this.pcnMerchantActivity = pcnMerchantActivity;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ParentChildThemeActivity [pcnpctId=" + pcnpctId
				+ ", pcnThemeName=" + pcnThemeName + ", pcnStartTime="
				+ pcnStartTime + ", pcnEndTime=" + pcnEndTime + ", pcnStatus="
				+ pcnStatus + ", pcnSite=" + pcnSite + ", pcnMerchantActivity="
				+ pcnMerchantActivity + ", imgUrl=" + imgUrl + ", price="
				+ price + "]";
	}
	
}
