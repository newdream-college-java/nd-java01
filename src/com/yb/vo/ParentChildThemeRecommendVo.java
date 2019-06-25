package com.yb.vo;

public class ParentChildThemeRecommendVo {
	private int pcnpctId; //主题id
	private String pcnpctThemeName;//主题名称
	private String pcnpctimgUrl;
	public ParentChildThemeRecommendVo() {
		
	}
	public ParentChildThemeRecommendVo(int pcnpctId, String pcnpctThemeName,
			String pcnpctimgUrl) {
		super();
		this.pcnpctId = pcnpctId;
		this.pcnpctThemeName = pcnpctThemeName;
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

	public String getPcnpctimgUrl() {
		return pcnpctimgUrl;
	}

	public void setPcnpctimgUrl(String pcnpctimgUrl) {
		this.pcnpctimgUrl = pcnpctimgUrl;
	}

	@Override
	public String toString() {
		return "ParentChildThemeRecommendVo [pcnpctId=" + pcnpctId
				+ ", pcnpctThemeName=" + pcnpctThemeName + ", pcnpctimgUrl="
				+ pcnpctimgUrl + "]";
	}
	
}
