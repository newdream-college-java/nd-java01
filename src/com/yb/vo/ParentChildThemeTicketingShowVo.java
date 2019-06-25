package com.yb.vo;

import java.util.Date;

public class ParentChildThemeTicketingShowVo {
	private int pcnpctId;
	private String pcnThemeName;
	private Date pcnStartTime;
	private Date pcnEndTime;
	private int pcnStatus;
	private String pcnSite;
	private int pcnMerchantActivity;
	private String imgUrl;
	private int adultPrice;
	private int storePrice;
	public ParentChildThemeTicketingShowVo() {
	
	}
	public ParentChildThemeTicketingShowVo(int pcnpctId, String pcnThemeName,
			Date pcnStartTime, Date pcnEndTime, int pcnStatus,
			String pcnSite, int pcnMerchantActivity, String imgUrl,
			int adultPrice, int storePrice) {
		super();
		this.pcnpctId = pcnpctId;
		this.pcnThemeName = pcnThemeName;
		this.pcnStartTime = pcnStartTime;
		this.pcnEndTime = pcnEndTime;
		this.pcnStatus = pcnStatus;
		this.pcnSite = pcnSite;
		this.pcnMerchantActivity = pcnMerchantActivity;
		this.imgUrl = imgUrl;
		this.adultPrice = adultPrice;
		this.storePrice = storePrice;
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
	public int getAdultPrice() {
		return adultPrice;
	}
	public void setAdultPrice(int adultPrice) {
		this.adultPrice = adultPrice;
	}
	public int getStorePrice() {
		return storePrice;
	}
	public void setStorePrice(int storePrice) {
		this.storePrice = storePrice;
	}
	@Override
	public String toString() {
		return "ParentChildThemeTicketingShowVo [pcnpctId=" + pcnpctId
				+ ", pcnThemeName=" + pcnThemeName + ", pcnStartTime="
				+ pcnStartTime + ", pcnEndTime=" + pcnEndTime + ", pcnStatus="
				+ pcnStatus + ", pcnSite=" + pcnSite + ", pcnMerchantActivity="
				+ pcnMerchantActivity + ", imgUrl=" + imgUrl
				+ ", adultPrice=" + adultPrice + ", storePrice="
				+ storePrice + "]";
	}
	
}
