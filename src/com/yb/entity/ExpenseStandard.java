package com.yb.entity;

public class ExpenseStandard {
	private int pcnesId;//�շѱ�׼id
	private int pcnesPctid;//����id
	private	String pcnesContent;//�շѱ�׼����
	private String pcnesImgurl;//�շѱ�׼ͼƬ·��
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
