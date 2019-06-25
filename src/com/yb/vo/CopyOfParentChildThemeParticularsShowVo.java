package com.yb.vo;

public class CopyOfParentChildThemeParticularsShowVo {
	private int pcnpctId;//主题id
	private String pcnpctThemeName;//主题名字
	private int pcnttId;//类型
	private String pcnpctSite;//详细地址 
	private int pcnpctRecommend;//是否推荐
	private String pcnpctReason;//推荐理由
	private String pcnpctTripMode;//出行方式
	private String pcnpctTravelDays;//出行日
	private String introductionContent;//介绍内容
	private String introductionContentImg;//介绍图片
	private String expenseContent;//收费标准内容
	private String expenseContentImg;//收费标准图片
	private String trafficRouteContent;//交通路线内容
	private String trafficRouteContentImg;//交通路线图片
	public CopyOfParentChildThemeParticularsShowVo() {
	
	}
	public CopyOfParentChildThemeParticularsShowVo(int pcnpctId,
			String pcnpctThemeName, String pcnpctSite, int pcnpctRecommend,
			String pcnpctReason, String pcnpctTripMode,
			String pcnpctTravelDays, String introductionContent,
			String introductionContentImg, String expenseContent,
			String expenseContentImg, String trafficRouteContent,
			String trafficRouteContentImg) {
		super();
		this.pcnpctId = pcnpctId;
		this.pcnpctThemeName = pcnpctThemeName;
		this.pcnpctSite = pcnpctSite;
		this.pcnpctRecommend = pcnpctRecommend;
		this.pcnpctReason = pcnpctReason;
		this.pcnpctTripMode = pcnpctTripMode;
		this.pcnpctTravelDays = pcnpctTravelDays;
		this.introductionContent = introductionContent;
		this.introductionContentImg = introductionContentImg;
		this.expenseContent = expenseContent;
		this.expenseContentImg = expenseContentImg;
		this.trafficRouteContent = trafficRouteContent;
		this.trafficRouteContentImg = trafficRouteContentImg;
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
	
	public int getPcnttId() {
		return pcnttId;
	}
	public void setPcnttId(int pcnttId) {
		this.pcnttId = pcnttId;
	}
	public String getPcnSite() {
		return pcnpctSite;
	}
	public void setPcnpctSite(String pcnpctSite) {
		this.pcnpctSite = pcnpctSite;
	}
	public int getPcnpctRecommend() {
		return pcnpctRecommend;
	}
	public void setPcnpctRecommend(int pcnpctRecommend) {
		this.pcnpctRecommend = pcnpctRecommend;
	}
	public String getPcnpctReason() {
		return pcnpctReason;
	}
	public void setPcnpctReason(String pcnpctReason) {
		this.pcnpctReason = pcnpctReason;
	}
	public String getPcnpctTripMode() {
		return pcnpctTripMode;
	}
	public void setPcnpctTripMode(String pcnpctTripMode) {
		this.pcnpctTripMode = pcnpctTripMode;
	}
	public String getPcnpctTravelDays() {
		return pcnpctTravelDays;
	}
	public void setPcnpctTravelDays(String pcnpctTravelDays) {
		this.pcnpctTravelDays = pcnpctTravelDays;
	}
	public String getIntroductionContent() {
		return introductionContent;
	}
	public void setIntroductionContent(String introductionContent) {
		this.introductionContent = introductionContent;
	}
	public String getIntroductionContentImg() {
		return introductionContentImg;
	}
	public void setIntroductionContentImg(String introductionContentImg) {
		this.introductionContentImg = introductionContentImg;
	}
	public String getExpenseContent() {
		return expenseContent;
	}
	public void setExpenseContent(String expenseContent) {
		this.expenseContent = expenseContent;
	}
	public String getExpenseContentImg() {
		return expenseContentImg;
	}
	public void setExpenseContentImg(String expenseContentImg) {
		this.expenseContentImg = expenseContentImg;
	}
	public String getTrafficRouteContent() {
		return trafficRouteContent;
	}
	public void setTrafficRouteContent(String trafficRouteContent) {
		this.trafficRouteContent = trafficRouteContent;
	}
	public String getTrafficRouteContentImg() {
		return trafficRouteContentImg;
	}
	public void setTrafficRouteContentImg(String trafficRouteContentImg) {
		this.trafficRouteContentImg = trafficRouteContentImg;
	}
	@Override
	public String toString() {
		return "CopyOfParentChildThemeParticularsShowVo [pcnpctId=" + pcnpctId
				+ ", pcnpctThemeName=" + pcnpctThemeName + ", pcnpctSite=" + pcnpctSite
				+ ", pcnpctRecommend=" + pcnpctRecommend + ", pcnpctReason="
				+ pcnpctReason + ", pcnpctTripMode=" + pcnpctTripMode
				+ ", pcnpctTravelDays=" + pcnpctTravelDays
				+ ", introductionContent=" + introductionContent
				+ ", introductionContentImg=" + introductionContentImg
				+ ", ratesContent=" + expenseContent + ", ratesContentImg="
				+ expenseContentImg + ", trafficRouteContent="
				+ trafficRouteContent + ", trafficRouteContentImg="
				+ trafficRouteContentImg + "]";
	}
	
	
}
