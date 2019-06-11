package com.cc.entity;

public class SpHelpCategory {
	private int sphcMid;
	private String sphcName;
	private int sphcId;

	public SpHelpCategory() {
	}

	public SpHelpCategory(int sphcMid, String sphcName, int sphcId) {
		super();
		this.sphcMid = sphcMid;
		this.sphcName = sphcName;
		this.sphcId = sphcId;
	}

	@Override
	public String toString() {
		return "SpHelpCategory [sphcId=" + sphcId + ", sphcMid=" + sphcMid
				+ ", sphcName=" + sphcName + "]\n";
	}

	public int getSphcMid() {
		return sphcMid;
	}

	public void setSphcMid(int sphcMid) {
		this.sphcMid = sphcMid;
	}

	public String getSphcName() {
		return sphcName;
	}

	public void setSphcName(String sphcName) {
		this.sphcName = sphcName;
	}

	public int getSphcId() {
		return sphcId;
	}

	public void setSphcId(int sphcId) {
		this.sphcId = sphcId;
	}

}
