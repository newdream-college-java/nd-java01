package com.yb.entity;

public class ActivityIntroduction {
	private int pcnaiId;//�����id
	private int pcnaiPctid;//����id
	private String pcnaiContent;//���������
	private String pcnaiImgurl;//�����ͼƬ·��
	public ActivityIntroduction() {
		
	}
	public ActivityIntroduction(int pcnaiId, int pcnaiPctid,
			String pcnaiContent, String pcnaiImgurl) {
		super();
		this.pcnaiId = pcnaiId;
		this.pcnaiPctid = pcnaiPctid;
		this.pcnaiContent = pcnaiContent;
		this.pcnaiImgurl = pcnaiImgurl;
	}
	public int getPcnaiId() {
		return pcnaiId;
	}
	public void setPcnaiId(int pcnaiId) {
		this.pcnaiId = pcnaiId;
	}
	public int getPcnaiPctid() {
		return pcnaiPctid;
	}
	public void setPcnaiPctid(int pcnaiPctid) {
		this.pcnaiPctid = pcnaiPctid;
	}
	public String getPcnaiContent() {
		return pcnaiContent;
	}
	public void setPcnaiContent(String pcnaiContent) {
		this.pcnaiContent = pcnaiContent;
	}
	public String getPcnaiImgurl() {
		return pcnaiImgurl;
	}
	public void setPcnaiImgurl(String pcnaiImgurl) {
		this.pcnaiImgurl = pcnaiImgurl;
	}
	@Override
	public String toString() {
		return "ActivityIntroduction [pcnaiId=" + pcnaiId + ", pcnaiPctid="
				+ pcnaiPctid + ", pcnaiContent=" + pcnaiContent
				+ ", pcnaiImgurl=" + pcnaiImgurl + "]";
	}
	
}
