package com.yb.entity;

import java.util.Date;

public class ParentChildTheme {
	private int pcnpctId; //����id
	private String pcnpctThemeName;//��������
	private Date pcnpctStartTime;//��ʼʱ��
	private Date pcnpctEndTime;//����ʱ��
	private int pcnpctStatus;//״̬
	private String pcnpctSite;//��ַ
	private int pcnpctMerchantActivity;//�̼һ
	private int pcnpctShow;//�Ƿ�չʾ
	private int pcnpctRecommend; //�Ƿ��Ƽ� 
	private int pcnpctRankingList; //���У�0�����У�1���У�
	private int pcnpcttId; //������������id��1���ӻ2��������3Ʊ��
	private String pcnpctReason; //�Ƽ�����
	private int pcnpctTripMode; //���з�ʽ ��1�Լ�2���ţ�
	private int pcnpctTravelDays;//������ ��1һ����2������....��
	private String pcnpctimgUrl;//��Ʒ��ͼ·��
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
