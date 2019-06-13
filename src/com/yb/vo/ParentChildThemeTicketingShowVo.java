package com.yb.vo;

public class ParentChildThemeTicketingShowVo {
	private int pcnpctId;
	private String pcnThemeName;
	private String pcnStartTime;
	private String pcnEndTime;
	private int pcnStatus;
	private String pcnSite;
	private int pcnMerchantActivity;
	private String imgUrl;
	private int counterPrice;
	private int netPurchasing;
	public ParentChildThemeTicketingShowVo() {
	
	}
	public ParentChildThemeTicketingShowVo(int pcnpctId, String pcnThemeName,
			String pcnStartTime, String pcnEndTime, int pcnStatus,
			String pcnSite, int pcnMerchantActivity, String imgUrl,
			int counterPrice, int netPurchasing) {
		super();
		this.pcnpctId = pcnpctId;
		this.pcnThemeName = pcnThemeName;
		this.pcnStartTime = pcnStartTime;
		this.pcnEndTime = pcnEndTime;
		this.pcnStatus = pcnStatus;
		this.pcnSite = pcnSite;
		this.pcnMerchantActivity = pcnMerchantActivity;
		this.imgUrl = imgUrl;
		this.counterPrice = counterPrice;
		this.netPurchasing = netPurchasing;
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
	public String getPcnStartTime() {
		return pcnStartTime;
	}
	public void setPcnStartTime(String pcnStartTime) {
		this.pcnStartTime = pcnStartTime;
	}
	public String getPcnEndTime() {
		return pcnEndTime;
	}
	public void setPcnEndTime(String pcnEndTime) {
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
		return "ParentChildThemeTicketingShowVo [pcnpctId=" + pcnpctId
				+ ", pcnThemeName=" + pcnThemeName + ", pcnStartTime="
				+ pcnStartTime + ", pcnEndTime=" + pcnEndTime + ", pcnStatus="
				+ pcnStatus + ", pcnSite=" + pcnSite + ", pcnMerchantActivity="
				+ pcnMerchantActivity + ", imgUrl=" + imgUrl
				+ ", counterPrice=" + counterPrice + ", netPurchasing="
				+ netPurchasing + "]";
	}
	
}
