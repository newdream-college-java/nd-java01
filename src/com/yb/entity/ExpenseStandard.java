package com.yb.entity;

public class ExpenseStandard {
	private int pcnesId;//收费标准id
	private int pcnesPctid;//主题id
	private	String pcnesContent;//收费标准内容
	private String pcnesImgurl;//收费标准图片路径
	public ExpenseStandard() {
		
	}
	public ExpenseStandard(int pcnesId, int pcnesPctid, String pcnesContent,
			String pcnesImgurl) {
		super();
		this.pcnesId = pcnesId;
		this.pcnesPctid = pcnesPctid;
		this.pcnesContent = pcnesContent;
		this.pcnesImgurl = pcnesImgurl;
	}
	
	public int getPcnesId() {
		return pcnesId;
	}

	public void setPcnesId(int pcnesId) {
		this.pcnesId = pcnesId;
	}

	public int getPcnesPctid() {
		return pcnesPctid;
	}

	public void setPcnesPctid(int pcnesPctid) {
		this.pcnesPctid = pcnesPctid;
	}

	public String getPcnesContent() {
		return pcnesContent;
	}

	public void setPcnesContent(String pcnesContent) {
		this.pcnesContent = pcnesContent;
	}

	public String getPcnesImgurl() {
		return pcnesImgurl;
	}

	public void setPcnesImgurl(String pcnesImgurl) {
		this.pcnesImgurl = pcnesImgurl;
	}

	@Override
	public String toString() {
		return "ExpenseStandard [pcnesId=" + pcnesId + ", pcnesPctid="
				+ pcnesPctid + ", pcnesContent=" + pcnesContent
				+ ", pcnesImgurl=" + pcnesImgurl + "]";
	}
	
}
