package com.yb.entity;

public class ActivityIntroduction {
	private int pcnaiId;//活动介绍id
	private int pcnaiPctid;//主题id
	private String pcnaiContent;//活动介绍内容
	private String pcnaiImgurl;//活动介绍图片路径
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
