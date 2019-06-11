package com.cc.entity;

public class SpOrder {
	private int spoNumber;
	private String spoAdress;
	private String spoPlaceTime;
	private int spoTelephone;
	private String spoUser;
	private int spoZip;
	private String spoReceivingTime;
	private int spuId;
	public SpOrder() {
	}
	public SpOrder(int spoNumber, String spoAdress, String spoPlaceTime,
			int spoTelephone, String spoUser, int spoZip,
			String spoReceivingTime, int spuId) {
		super();
		this.spoNumber = spoNumber;
		this.spoAdress = spoAdress;
		this.spoPlaceTime = spoPlaceTime;
		this.spoTelephone = spoTelephone;
		this.spoUser = spoUser;
		this.spoZip = spoZip;
		this.spoReceivingTime = spoReceivingTime;
		this.spuId = spuId;
	}
	public int getSpoNumber() {
		return spoNumber;
	}
	public void setSpoNumber(int spoNumber) {
		this.spoNumber = spoNumber;
	}
	public String getSpoAdress() {
		return spoAdress;
	}
	public void setSpoAdress(String spoAdress) {
		this.spoAdress = spoAdress;
	}
	public String getSpoPlaceTime() {
		return spoPlaceTime;
	}
	public void setSpoPlaceTime(String spoPlaceTime) {
		this.spoPlaceTime = spoPlaceTime;
	}
	public int getSpoTelephone() {
		return spoTelephone;
	}
	public void setSpoTelephone(int spoTelephone) {
		this.spoTelephone = spoTelephone;
	}
	public String getSpoUser() {
		return spoUser;
	}
	public void setSpoUser(String spoUser) {
		this.spoUser = spoUser;
	}
	public int getSpoZip() {
		return spoZip;
	}
	public void setSpoZip(int spoZip) {
		this.spoZip = spoZip;
	}
	public String getSpoReceivingTime() {
		return spoReceivingTime;
	}
	public void setSpoReceivingTime(String spoReceivingTime) {
		this.spoReceivingTime = spoReceivingTime;
	}
	public int getSpuId() {
		return spuId;
	}
	public void setSpuId(int spuId) {
		this.spuId = spuId;
	}
	@Override
	public String toString() {
		return "SpOrder [spoAdress=" + spoAdress + ", spoNumber=" + spoNumber
				+ ", spoPlaceTime=" + spoPlaceTime + ", spoReceivingTime="
				+ spoReceivingTime + ", spoTelephone=" + spoTelephone
				+ ", spoUser=" + spoUser + ", spoZip=" + spoZip + ", spuId="
				+ spuId + "]\n";
	}
	
}
