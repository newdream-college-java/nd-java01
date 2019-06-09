package com.entity;

public class Membersinfo {
	private int mid;
	private String mname;
	private String mgender;
	private int mage;
	private String maddress;
	private String memail;
	public Membersinfo() {
		
	}
	public Membersinfo( String mname, String mgender, int mage,
			String maddress, String memail) {
		super();
		this.mname = mname;
		this.mgender = mgender;
		this.mage = mage;
		this.maddress = maddress;
		this.memail = memail;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMgender() {
		return mgender;
	}
	public void setMgender(String mgender) {
		this.mgender = mgender;
	}
	public int getMage() {
		return mage;
	}
	public void setMage(int mage) {
		this.mage = mage;
	}
	public String getMaddress() {
		return maddress;
	}
	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	@Override
	public String toString() {
		return "Membersinfo [maddress=" + maddress + ", mage=" + mage
				+ ", memail=" + memail + ", mgender=" + mgender + ", mid="
				+ mid + ", mname=" + mname + "]\n";
	}
	
	
}
