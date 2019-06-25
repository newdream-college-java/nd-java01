package com.yb.entity;

public class Pcnparticulars {
	private int pcnptid;
	private int pcniid;
	private int pcngsid;
	private int pcnpctid;
	private int pcnptquantity;
	private String pcnptlinkmanName;
	private String pcnptlinkmanNumber;
	private String pcnptremark;
	private int pcnptorderamount;
	public int getPcnptid() {
		return pcnptid;
	}
	public void setPcnptid(int pcnptid) {
		this.pcnptid = pcnptid;
	}
	public int getPcniid() {
		return pcniid;
	}
	public void setPcniid(int pcniid) {
		this.pcniid = pcniid;
	}
	public int getPcngsid() {
		return pcngsid;
	}
	public void setPcngsid(int pcngsid) {
		this.pcngsid = pcngsid;
	}
	public int getPcnpctid() {
		return pcnpctid;
	}
	public void setPcnpctid(int pcnpctid) {
		this.pcnpctid = pcnpctid;
	}
	public int getPcnptquantity() {
		return pcnptquantity;
	}
	public void setPcnptquantity(int pcnptquantity) {
		this.pcnptquantity = pcnptquantity;
	}
	public String getPcnptlinkmanName() {
		return pcnptlinkmanName;
	}
	public void setPcnptlinkmanName(String pcnptlinkman_name) {
		this.pcnptlinkmanName = pcnptlinkman_name;
	}
	public String getPcnptlinkmanNumber() {
		return pcnptlinkmanNumber;
	}
	public void setPcnptlinkman_number(String pcnptlinkman_number) {
		this.pcnptlinkmanNumber = pcnptlinkman_number;
	}
	public String getPcnptremark() {
		return pcnptremark;
	}
	public void setPcnptremark(String pcnptremark) {
		this.pcnptremark = pcnptremark;
	}
	public int getPcnptorderamount() {
		return pcnptorderamount;
	}
	public void setPcnptorderamount(int pcnptorderamount) {
		this.pcnptorderamount = pcnptorderamount;
	}
	@Override
	public String toString() {
		return "Pcnparticulars [pcnptid=" + pcnptid + ", pcniid=" + pcniid
				+ ", pcngsid=" + pcngsid + ", pcnpctid=" + pcnpctid
				+ ", pcnptquantity=" + pcnptquantity + ", pcnptlinkman_name="
				+ pcnptlinkmanName + ", pcnptlinkman_number="
				+ pcnptlinkmanNumber + ", pcnptremark=" + pcnptremark
				+ ", pcnptorderamount=" + pcnptorderamount + "]\n";
	}
	public Pcnparticulars(int pcnptid, int pcniid, int pcngsid, int pcnpctid,
			int pcnptquantity, String pcnptlinkman_name,
			String pcnptlinkman_number, String pcnptremark, int pcnptorderamount) {
		super();
		this.pcnptid = pcnptid;
		this.pcniid = pcniid;
		this.pcngsid = pcngsid;
		this.pcnpctid = pcnpctid;
		this.pcnptquantity = pcnptquantity;
		this.pcnptlinkmanName = pcnptlinkman_name;
		this.pcnptlinkmanNumber = pcnptlinkman_number;
		this.pcnptremark = pcnptremark;
		this.pcnptorderamount = pcnptorderamount;
	}
	public Pcnparticulars() {
		super();
	}
	
}
