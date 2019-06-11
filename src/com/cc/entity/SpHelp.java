package com.cc.entity;

public class SpHelp {
	private int sphId;
	private String sphTitle;
	private String sphCoutent;
	private int sphcMid;

	public SpHelp() {
	}

	public SpHelp(int sphId, String sphTitle, String sphCoutent, int sphcMid) {
		super();
		this.sphId = sphId;
		this.sphTitle = sphTitle;
		this.sphCoutent = sphCoutent;
		this.sphcMid = sphcMid;
	}

	@Override
	public String toString() {
		return "SpHelp [sphCoutent=" + sphCoutent + ", sphId=" + sphId
				+ ", sphTitle=" + sphTitle + ", sphcMid=" + sphcMid + "]\n";
	}

	public int getSphId() {
		return sphId;
	}

	public void setSphId(int sphId) {
		this.sphId = sphId;
	}

	public String getSphTitle() {
		return sphTitle;
	}

	public void setSphTitle(String sphTitle) {
		this.sphTitle = sphTitle;
	}

	public String getSphCoutent() {
		return sphCoutent;
	}

	public void setSphCoutent(String sphCoutent) {
		this.sphCoutent = sphCoutent;
	}

	public int getSphcMid() {
		return sphcMid;
	}

	public void setSphcMid(int sphcMid) {
		this.sphcMid = sphcMid;
	}
}
