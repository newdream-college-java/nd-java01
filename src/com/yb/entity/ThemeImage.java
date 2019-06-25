package com.yb.entity;

public class ThemeImage {
	private int pcntiId;//主题介绍图片id
	private int pcntiPctId;//主题id
	private String pcntiImagePath;//图片路径
	public ThemeImage() {
	
	}
	public ThemeImage(int pcntiId, int pcntiPctId, String pcntiImagePath) {
		super();
		this.pcntiId = pcntiId;
		this.pcntiPctId = pcntiPctId;
		this.pcntiImagePath = pcntiImagePath;
	}
	public int getPcntiId() {
		return pcntiId;
	}
	public void setPcntiId(int pcntiId) {
		this.pcntiId = pcntiId;
	}
	public int getPcntiPctId() {
		return pcntiPctId;
	}
	public void setPcntiPctId(int pcntiPctId) {
		this.pcntiPctId = pcntiPctId;
	}
	public String getPcntiImagePath() {
		return pcntiImagePath;
	}
	public void setPcntiImagePath(String pcntiImagePath) {
		this.pcntiImagePath = pcntiImagePath;
	}
	@Override
	public String toString() {
		return "ThemeImage [pcntiId=" + pcntiId + ", pcntiPctId=" + pcntiPctId
				+ ", pcntiImagePath=" + pcntiImagePath + "]";
	}
	
}
