package com.yb.vo;

public class ActivityDisplayShowVo {
	private int pcnpctId; //����id
	private String pcnpctThemeName;//��������
	private int pcnpcttId; //������������id��1���ӻ2��������3Ʊ��
	private String pcnpctimgUrl;//��Ʒ��ͼ·��
	public ActivityDisplayShowVo() {
	
	}
	public ActivityDisplayShowVo(int pcnpctId, String pcnpctThemeName,
			int pcnpcttId, String pcnpctimgUrl) {
		super();
		this.pcnpctId = pcnpctId;
		this.pcnpctThemeName = pcnpctThemeName;
		this.pcnpcttId = pcnpcttId;
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
	public int getPcnpcttId() {
		return pcnpcttId;
	}
	public void setPcnpcttId(int pcnpcttId) {
		this.pcnpcttId = pcnpcttId;
	}
	public String getPcnpctimgUrl() {
		return pcnpctimgUrl;
	}
	public void setPcnpctimgUrl(String pcnpctimgUrl) {
		this.pcnpctimgUrl = pcnpctimgUrl;
	}
	@Override
	public String toString() {
		return "ActivityDisplayVo [pcnpctId=" + pcnpctId + ", pcnpctThemeName="
				+ pcnpctThemeName + ", pcnpcttId=" + pcnpcttId
				+ ", pcnpctimgUrl=" + pcnpctimgUrl + "]";
	}
	
}
