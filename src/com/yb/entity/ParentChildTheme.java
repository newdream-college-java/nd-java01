package com.yb.entity;

public class ParentChildTheme {
	private int pcnpctId;
	private String pcnThemeName;
	private String pcnStartTime;
	private String pcnEndTime;
	private int pcnStatus;
	private String pcnSite;
	private int pcnMerchantActivity;
	private int pcnShow;
	private int pcnRecommend;
	private int pcnRankingList;
	private int pcnttId;
	private String pcnReason;
	private int pcnTripMode;
	private int pcnTravelDays;
	private String imgUrl;
	public ParentChildTheme() {
	
	}
	public ParentChildTheme(int pcnpctId, String pcnThemeName,
			String pcnStartTime, String pcnEndTime, int pcnStatus,
			String pcnSite, int pcnMerchantActivity, int pcnShow,
			int pcnRecommend, int pcnRankingList, int pcnttId,
			String pcnReason, int pcnTripMode, int pcnTravelDays,String imgUrl) {
		this.pcnpctId = pcnpctId;
		this.pcnThemeName = pcnThemeName;
		this.pcnStartTime = pcnStartTime;
		this.pcnEndTime = pcnEndTime;
		this.pcnStatus = pcnStatus;
		this.pcnSite = pcnSite;
		this.pcnMerchantActivity = pcnMerchantActivity;
		this.pcnShow = pcnShow;
		this.pcnRecommend = pcnRecommend;
		this.pcnRankingList = pcnRankingList;
		this.pcnttId = pcnttId;
		this.pcnReason = pcnReason;
		this.pcnTripMode = pcnTripMode;
		this.pcnTravelDays = pcnTravelDays;
		this.imgUrl=imgUrl;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
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
	public int getPcnShow() {
		return pcnShow;
	}
	public void setPcnShow(int pcnShow) {
		this.pcnShow = pcnShow;
	}
	public int getPcnRecommend() {
		return pcnRecommend;
	}
	public void setPcnRecommend(int pcnRecommend) {
		this.pcnRecommend = pcnRecommend;
	}
	public int getPcnRankingList() {
		return pcnRankingList;
	}
	public void setPcnRankingList(int pcnRankingList) {
		this.pcnRankingList = pcnRankingList;
	}
	public int getPcnttId() {
		return pcnttId;
	}
	public void setPcnttId(int pcnttId) {
		this.pcnttId = pcnttId;
	}
	public String getPcnReason() {
		return pcnReason;
	}
	public void setPcnReason(String pcnReason) {
		this.pcnReason = pcnReason;
	}
	public int getPcnTripMode() {
		return pcnTripMode;
	}
	public void setPcnTripMode(int pcnTripMode) {
		this.pcnTripMode = pcnTripMode;
	}
	public int getPcnTravelDays() {
		return pcnTravelDays;
	}
	public void setPcnTravelDays(int pcnTravelDays) {
		this.pcnTravelDays = pcnTravelDays;
	}
	@Override
	public String toString() {
		return "ParentChildTheme [pcnpctId=" + pcnpctId + ", pcnThemeName="
				+ pcnThemeName + ", pcnStartTime=" + pcnStartTime
				+ ", pcnEndTime=" + pcnEndTime + ", pcnStatus=" + pcnStatus
				+ ", pcnSite=" + pcnSite + ", pcnMerchantActivity="
				+ pcnMerchantActivity + ", pcnShow=" + pcnShow
				+ ", pcnRecommend=" + pcnRecommend + ", pcnRankingList="
				+ pcnRankingList + ", pcnttId=" + pcnttId + ", pcnReason="
				+ pcnReason + ", pcnTripMode=" + pcnTripMode
				+ ", pcnTravelDays=" + pcnTravelDays + "]";
	}
	
}
