package com.cc.entity;

public class SpUser {
	private int spuId;
	private String spuName;
	private int spuPwd;
	private String spuRname;
	private int spuTable;
	private String spuZip;
	private String spuNumber;
	private String spuAdress;
	public SpUser() {;
	}
	public SpUser(int spuId, String spuName, int spuPwd, String spuRname,
			int spuTable, String spuZip, String spuNumber, String spuAdress) {
		super();
		this.spuId = spuId;
		this.spuName = spuName;
		this.spuPwd = spuPwd;
		this.spuRname = spuRname;
		this.spuTable = spuTable;
		this.spuZip = spuZip;
		this.spuNumber = spuNumber;
		this.spuAdress = spuAdress;
	}
	public int getSpuId() {
		return spuId;
	}
	public void setSpuId(int spuId) {
		this.spuId = spuId;
	}
	public String getSpuName() {
		return spuName;
	}
	public void setSpuName(String spuName) {
		this.spuName = spuName;
	}
	public int getSpuPwd() {
		return spuPwd;
	}
	public void setSpuPwd(int spuPwd) {
		this.spuPwd = spuPwd;
	}
	public String getSpuRname() {
		return spuRname;
	}
	public void setSpuRname(String spuRname) {
		this.spuRname = spuRname;
	}
	public int getSpuTable() {
		return spuTable;
	}
	public void setSpuTable(int spuTable) {
		this.spuTable = spuTable;
	}
	public String getSpuZip() {
		return spuZip;
	}
	public void setSpuZip(String spuZip) {
		this.spuZip = spuZip;
	}
	public String getSpuNumber() {
		return spuNumber;
	}
	public void setSpuNumber(String spuNumber) {
		this.spuNumber = spuNumber;
	}
	public String getSpuAdress() {
		return spuAdress;
	}
	public void setSpuAdress(String spuAdress) {
		this.spuAdress = spuAdress;
	}
	@Override
	public String toString() {
		return "SpUser [spuAdress=" + spuAdress + ", spuId=" + spuId
				+ ", spuName=" + spuName + ", spuNumber=" + spuNumber
				+ ", spuPwd=" + spuPwd + ", spuRname=" + spuRname
				+ ", spuTable=" + spuTable + ", spuZip=" + spuZip + "]\n";
	}
	
}
