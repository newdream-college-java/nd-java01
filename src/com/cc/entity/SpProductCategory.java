package com.cc.entity;

public class SpProductCategory {
	private int sppcId;
	private String sppcName;
	private int sppcnId;

	public SpProductCategory() {
	}

	public SpProductCategory(int sppcId, String sppcName, int sppcnId) {
		super();
		this.sppcId = sppcId;
		this.sppcName = sppcName;
		this.sppcnId = sppcnId;
	}

	@Override
	public String toString() {
		return "SpProductCategory [sppcId=" + sppcId + ", sppcName=" + sppcName
				+ ", sppcnId=" + sppcnId + "]\n";
	}

	public int getSppcId() {
		return sppcId;
	}

	public void setSppcId(int sppcId) {
		this.sppcId = sppcId;
	}

	public String getSppcName() {
		return sppcName;
	}

	public void setSppcName(String sppcName) {
		this.sppcName = sppcName;
	}

	public int getSppcnId() {
		return sppcnId;
	}

	public void setSppcnId(int sppcnId) {
		this.sppcnId = sppcnId;
	}

}
