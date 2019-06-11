package com.cc.entity;

import java.math.BigDecimal;

public class SpProductSpecifications {
	private int spppId;
	private String sppName;
	private int sppNumber;
	private BigDecimal sppPrice;
	private String sppUnit;
	private int sppStock;
	private String spppType;
	private String spppDescribe;
	private String spppParameter;
	private String spppComment;
	private String spppPicture;
	private int spppMid;

	public SpProductSpecifications() {

	}

	public SpProductSpecifications(int spppId, String sppName, int sppNumber,
			BigDecimal sppPrice, String sppUnit, int sppStock, String spppType,
			String spppDescribe, String spppParameter, String spppComment,
			String spppPicture, int spppMid) {
		super();
		this.spppId = spppId;
		this.sppName = sppName;
		this.sppNumber = sppNumber;
		this.sppPrice = sppPrice;
		this.sppUnit = sppUnit;
		this.sppStock = sppStock;
		this.spppType = spppType;
		this.spppDescribe = spppDescribe;
		this.spppParameter = spppParameter;
		this.spppComment = spppComment;
		this.spppPicture = spppPicture;
		this.spppMid = spppMid;
	}

	@Override
	public String toString() {
		return "SpProductSpecifications [sppName=" + sppName + ", sppNumber="
				+ sppNumber + ", sppPrice=" + sppPrice + ", sppStock="
				+ sppStock + ", sppUnit=" + sppUnit + ", spppComment="
				+ spppComment + ", spppDescribe=" + spppDescribe + ", spppId="
				+ spppId + ", spppMid=" + spppMid + ", spppParameter="
				+ spppParameter + ", spppPicture=" + spppPicture
				+ ", spppType=" + spppType + "]\n";
	}

	public int getSpppId() {
		return spppId;
	}

	public void setSpppId(int spppId) {
		this.spppId = spppId;
	}

	public String getSppName() {
		return sppName;
	}

	public void setSppName(String sppName) {
		this.sppName = sppName;
	}

	public int getSppNumber() {
		return sppNumber;
	}

	public void setSppNumber(int sppNumber) {
		this.sppNumber = sppNumber;
	}

	public BigDecimal getSppPrice() {
		return sppPrice;
	}

	public void setSppPrice(BigDecimal sppPrice) {
		this.sppPrice = sppPrice;
	}

	public String getSppUnit() {
		return sppUnit;
	}

	public void setSppUnit(String sppUnit) {
		this.sppUnit = sppUnit;
	}

	public int getSppStock() {
		return sppStock;
	}

	public void setSppStock(int sppStock) {
		this.sppStock = sppStock;
	}

	public String getSpppType() {
		return spppType;
	}

	public void setSpppType(String spppType) {
		this.spppType = spppType;
	}

	public String getSpppDescribe() {
		return spppDescribe;
	}

	public void setSpppDescribe(String spppDescribe) {
		this.spppDescribe = spppDescribe;
	}

	public String getSpppParameter() {
		return spppParameter;
	}

	public void setSpppParameter(String spppParameter) {
		this.spppParameter = spppParameter;
	}

	public String getSpppComment() {
		return spppComment;
	}

	public void setSpppComment(String spppComment) {
		this.spppComment = spppComment;
	}

	public String getSpppPicture() {
		return spppPicture;
	}

	public void setSpppPicture(String spppPicture) {
		this.spppPicture = spppPicture;
	}

	public int getSpppMid() {
		return spppMid;
	}

	public void setSpppMid(int spppMid) {
		this.spppMid = spppMid;
	}

}
