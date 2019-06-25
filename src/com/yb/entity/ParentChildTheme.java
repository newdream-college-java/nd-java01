package com.yb.entity;

import java.util.Date;

public class ParentChildTheme {
	private int pcnpctId; //主题id
	private String pcnpctThemeName;//主题名称
	private Date pcnpctStartTime;//开始时间
	private Date pcnpctEndTime;//结束时间
	private int pcnpctStatus;//状态
	private String pcnpctSite;//地址
	private int pcnpctMerchantActivity;//商家活动
	private int pcnpctShow;//是否展示
	private int pcnpctRecommend; //是否推荐 
	private int pcnpctRankingList; //排行（0不排行，1排行）
	private int pcnpcttId; //亲子主题类型id（1亲子活动2亲子旅游3票务）
	private String pcnpctReason; //推荐理由
	private int pcnpctTripMode; //出行方式 （1自驾2跟团）
	private int pcnpctTravelDays;//出行日 （1一日游2二日游....）
	private String pcnpctimgUrl;//商品主图路径
	public ParentChildTheme() {
	
	}
	
	public ParentChildTheme(int pcnpctId, String pcnpctThemeName,
			Date pcnpctStartTime, Date pcnpctEndTime, int pcnpctStatus,
			String pcnpctSite, int pcnpctMerchantActivity, int pcnpctShow,
			int pcnpctRecommend, int pcnpctRankingList, int pcnpcttId,
			String pcnpctReason, int pcnpctTripMode, int pcnpctTravelDays,
			String pcnpctimgUrl) {
		super();
		this.pcnpctId = pcnpctId;
		this.pcnpctThemeName = pcnpctThemeName;
		this.pcnpctStartTime = pcnpctStartTime;
		this.pcnpctEndTime = pcnpctEndTime;
		this.pcnpctStatus = pcnpctStatus;
		this.pcnpctSite = pcnpctSite;
		this.pcnpctMerchantActivity = pcnpctMerchantActivity;
		this.pcnpctShow = pcnpctShow;
		this.pcnpctRecommend = pcnpctRecommend;
		this.pcnpctRankingList = pcnpctRankingList;
		this.pcnpcttId = pcnpcttId;
		this.pcnpctReason = pcnpctReason;
		this.pcnpctTripMode = pcnpctTripMode;
		this.pcnpctTravelDays = pcnpctTravelDays;
		this.pcnpctimgUrl = pcnpctimgUrl;
	}

	public int getPcnpctId() {
		return pcnpctId;
	}

	public void setPcnpctId(int pcnpctId) {
		this.pcnpctId = pcnpctId;
	}

	public String getPcnpctThemeName() {
		return pcnpctThemeName;
	}

	public void setPcnpctThemeName(String pcnpctThemeName) {
		this.pcnpctThemeName = pcnpctThemeName;
	}

	public Date getPcnpctStartTime() {
		return pcnpctStartTime;
	}

	public void setPcnpctStartTime(Date pcnpctStartTime) {
		this.pcnpctStartTime = pcnpctStartTime;
	}

	public Date getPcnpctEndTime() {
		return pcnpctEndTime;
	}

	public void setPcnpctEndTime(Date pcnpctEndTime) {
		this.pcnpctEndTime = pcnpctEndTime;
	}

	public int getPcnpctStatus() {
		return pcnpctStatus;
	}

	public void setPcnpctStatus(int pcnpctStatus) {
		this.pcnpctStatus = pcnpctStatus;
	}

	public String getPcnpctSite() {
		return pcnpctSite;
	}

	public void setPcnpctSite(String pcnpctSite) {
		this.pcnpctSite = pcnpctSite;
	}

	public int getPcnpctMerchantActivity() {
		return pcnpctMerchantActivity;
	}

	public void setPcnpctMerchantActivity(int pcnpctMerchantActivity) {
		this.pcnpctMerchantActivity = pcnpctMerchantActivity;
	}

	public int getPcnpctShow() {
		return pcnpctShow;
	}

	public void setPcnpctShow(int pcnpctShow) {
		this.pcnpctShow = pcnpctShow;
	}

	public int getPcnpctRecommend() {
		return pcnpctRecommend;
	}

	public void setPcnpctRecommend(int pcnpctRecommend) {
		this.pcnpctRecommend = pcnpctRecommend;
	}

	public int getPcnpctRankingList() {
		return pcnpctRankingList;
	}

	public void setPcnpctRankingList(int pcnpctRankingList) {
		this.pcnpctRankingList = pcnpctRankingList;
	}

	public int getPcnpcttId() {
		return pcnpcttId;
	}

	public void setPcnpctttId(int pcnpcttId) {
		this.pcnpcttId = pcnpcttId;
	}

	public String getPcnpctReason() {
		return pcnpctReason;
	}

	public void setPcnpctReason(String pcnpctReason) {
		this.pcnpctReason = pcnpctReason;
	}

	public int getPcnpctTripMode() {
		return pcnpctTripMode;
	}

	public void setPcnpctTripMode(int pcnpctTripMode) {
		this.pcnpctTripMode = pcnpctTripMode;
	}

	public int getPcnpctTravelDays() {
		return pcnpctTravelDays;
	}

	public void setPcnpctTravelDays(int pcnpctTravelDays) {
		this.pcnpctTravelDays = pcnpctTravelDays;
	}

	public String getPcnpctimgUrl() {
		return pcnpctimgUrl;
	}

	public void setPcnpctimgUrl(String pcnpctimgUrl) {
		this.pcnpctimgUrl = pcnpctimgUrl;
	}

	@Override
	public String toString() {
		return "ParentChildTheme [pcnpctId=" + pcnpctId + ", pcnpctThemeName="
				+ pcnpctThemeName + ", pcnpctStartTime=" + pcnpctStartTime
				+ ", pcnpctEndTime=" + pcnpctEndTime + ", pcnpctStatus="
				+ pcnpctStatus + ", pcnpctSite=" + pcnpctSite
				+ ", pcnpctMerchantActivity=" + pcnpctMerchantActivity
				+ ", pcnpctShow=" + pcnpctShow + ", pcnpctRecommend="
				+ pcnpctRecommend + ", pcnpctRankingList=" + pcnpctRankingList
				+ ", pcnpctttId=" + pcnpcttId + ", pcnpctReason="
				+ pcnpctReason + ", pcnpctTripMode=" + pcnpctTripMode
				+ ", pcnpctTravelDays=" + pcnpctTravelDays + ", pcnpctimgUrl="
				+ pcnpctimgUrl + "]";
	}
	
}
