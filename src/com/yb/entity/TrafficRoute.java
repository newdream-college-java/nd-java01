package com.yb.entity;

public class TrafficRoute {
	private int pcntrId;//��ͨ·��id
	private int pcntrPctid;//����id
	private String pcntrContent;//��ͨ·������
	private String pcntrImgurl;//��ͨ·��ͼƬ·��
	public TrafficRoute() {
		
	}
	public TrafficRoute(int pcntrId, int pcntrPctid, String pcntrContent,
			String pcntrImgurl) {
		super();
		this.pcntrId = pcntrId;
		this.pcntrPctid = pcntrPctid;
		this.pcntrContent = pcntrContent;
		this.pcntrImgurl = pcntrImgurl;
	}
	public int getPcntrId() {
		return pcntrId;
	}
	public void setPcntrId(int pcntrId) {
		this.pcntrId = pcntrId;
	}
	public int getPcntrPctid() {
		return pcntrPctid;
	}
	public void setPcntrPctid(int pcntrPctid) {
		this.pcntrPctid = pcntrPctid;
	}
	public String getPcntrContent() {
		return pcntrContent;
	}
	public void setPcntrContent(String pcntrContent) {
		this.pcntrContent = pcntrContent;
	}
	public String getPcntrImgurl() {
		return pcntrImgurl;
	}
	public void setPcntrImgurl(String pcntrImgurl) {
		this.pcntrImgurl = pcntrImgurl;
	}
	@Override
	public String toString() {
		return "TrafficRoute [pcntrId=" + pcntrId + ", pcntrPctid="
				+ pcntrPctid + ", pcntrContent=" + pcntrContent
				+ ", pcntrImgurl=" + pcntrImgurl + "]";
	}
	
}
