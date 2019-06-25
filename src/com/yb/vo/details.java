package com.yb.vo;

public class details {
	private String  pcnpctthemename;
	private String pcnpctsite;
	private int  pcnpcttripmode;
	private String pcngsname;
	private int pcngsvvalue;
	private int pcnptquantity;
	private String  pcnptlinkmanname;
	private String  pcnptlinkmannumber;
	private String  pcnptremark;
	private int pcnptorderamount;
	public String getPcnpctthemename() {
		return pcnpctthemename;
	}
	public void setPcnpctthemename(String pcnpctthemename) {
		this.pcnpctthemename = pcnpctthemename;
	}
	public String getPcnpctsite() {
		return pcnpctsite;
	}
	public void setPcnpctsite(String pcnpctsite) {
		this.pcnpctsite = pcnpctsite;
	}
	public int getPcnpcttripmode() {
		return pcnpcttripmode;
	}
	public void setPcnpcttripmode(int pcnpcttripmode) {
		this.pcnpcttripmode = pcnpcttripmode;
	}
	public String getPcngsname() {
		return pcngsname;
	}
	public void setPcngsname(String pcngsname) {
		this.pcngsname = pcngsname;
	}
	public int getPcngsvvalue() {
		return pcngsvvalue;
	}
	public void setPcngsvvalue(int pcngsvvalue) {
		this.pcngsvvalue = pcngsvvalue;
	}
	public int getPcnptquantity() {
		return pcnptquantity;
	}
	public void setPcnptquantity(int pcnptquantity) {
		this.pcnptquantity = pcnptquantity;
	}
	public String getPcnptlinkmanname() {
		return pcnptlinkmanname;
	}
	public void setPcnptlinkmanname(String pcnptlinkmanname) {
		this.pcnptlinkmanname = pcnptlinkmanname;
	}
	public String getPcnptlinkmannumber() {
		return pcnptlinkmannumber;
	}
	public void setPcnptlinkmannumber(String pcnptlinkmannumber) {
		this.pcnptlinkmannumber = pcnptlinkmannumber;
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
		return "details [pcnpctthemename=" + pcnpctthemename + ", pcnpctsite="
				+ pcnpctsite + ", pcnpcttripmode=" + pcnpcttripmode
				+ ", pcngsname=" + pcngsname + ", pcngsvvalue=" + pcngsvvalue
				+ ", pcnptquantity=" + pcnptquantity + ", pcnptlinkmanname="
				+ pcnptlinkmanname + ", pcnptlinkmannumber="
				+ pcnptlinkmannumber + ", pcnptremark=" + pcnptremark
				+ ", pcnptorderamount=" + pcnptorderamount + "]\n";
	}
	public details(String pcnpctthemename, String pcnpctsite,
			int pcnpcttripmode, String pcngsname, int pcngsvvalue,
			int pcnptquantity, String pcnptlinkmanname,
			String pcnptlinkmannumber, String pcnptremark, int pcnptorderamount) {
		super();
		this.pcnpctthemename = pcnpctthemename;
		this.pcnpctsite = pcnpctsite;
		this.pcnpcttripmode = pcnpcttripmode;
		this.pcngsname = pcngsname;
		this.pcngsvvalue = pcngsvvalue;
		this.pcnptquantity = pcnptquantity;
		this.pcnptlinkmanname = pcnptlinkmanname;
		this.pcnptlinkmannumber = pcnptlinkmannumber;
		this.pcnptremark = pcnptremark;
		this.pcnptorderamount = pcnptorderamount;
	}
	public details(){
		super();
		
	}
	
}


