package com.yb.entity;

public class Pcnuser {
	private int pcnuId;
	private String pcnuName;
	private String pcnuPassword;
	private String pcnuEmail;
	private String pcnuNumber;
	private String pcnuSite;
	private String qq;
	private int bbsex;
	private String bbname;
	public Pcnuser(int pcnuId, String pcnuName, String pcnuPassword,
			String pcnuEmail, String pcnuNumber, String pcnuSite, String qq,
			int bbsex, String bbname) {
		super();
		this.pcnuId = pcnuId;
		this.pcnuName = pcnuName;
		this.pcnuPassword = pcnuPassword;
		this.pcnuEmail = pcnuEmail;
		this.pcnuNumber = pcnuNumber;
		this.pcnuSite = pcnuSite;
		this.qq = qq;
		this.bbsex = bbsex;
		this.bbname = bbname;
	}
	public Pcnuser() {
		
	}
	@Override
	public String toString() {
		return "pcn_user [bbname=" + bbname + ", bbsex=" + bbsex
				+ ", pcnuEmail=" + pcnuEmail + ", pcnuId=" + pcnuId
				+ ", pcnuName=" + pcnuName + ", pcnuNumber=" + pcnuNumber
				+ ", pcnuPassword=" + pcnuPassword + ", pcnuSite=" + pcnuSite
				+ ", qq=" + qq + "]\n";
	}
	public int getPcnuId() {
		return pcnuId;
	}
	public void setPcnuId(int pcnuId) {
		this.pcnuId = pcnuId;
	}
	public String getPcnuName() {
		return pcnuName;
	}
	public void setPcnuName(String pcnuName) {
		this.pcnuName = pcnuName;
	}
	public String getPcnuPassword() {
		return pcnuPassword;
	}
	public void setPcnuPassword(String pcnuPassword) {
		this.pcnuPassword = pcnuPassword;
	}
	public String getPcnuEmail() {
		return pcnuEmail;
	}
	public void setPcnuEmail(String pcnuEmail) {
		this.pcnuEmail = pcnuEmail;
	}
	public String getPcnuNumber() {
		return pcnuNumber;
	}
	public void setPcnuNumber(String pcnuNumber) {
		this.pcnuNumber = pcnuNumber;
	}
	public String getPcnuSite() {
		return pcnuSite;
	}
	public void setPcnuSite(String pcnuSite) {
		this.pcnuSite = pcnuSite;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public int getBbsex() {
		return bbsex;
	}
	public void setBbsex(int bbsex) {
		this.bbsex = bbsex;
	}
	public String getBbname() {
		return bbname;
	}
	public void setBbname(String bbname) {
		this.bbname = bbname;
	}
}
