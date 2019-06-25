package com.yb.entity;

public class Pcnindent {
	private int pcniid;
	private int pcnuid;
	private String pcniordernumber;
	private int pcniactualpayment;
	private int pcnitransactionstatus;
	private String pcnitime;
	@Override
	public String toString() {
		return "Pcnindent [pcniid=" + pcniid + ", pcnuid=" + pcnuid
				+ ", pcniorder_number=" + pcniordernumber
				+ ", pcniactualpayment=" + pcniactualpayment
				+ ", pcnitransactionstatus=" + pcnitransactionstatus
				+ ", pcnitime=" + pcnitime + "]";
	}
	public int getPcniid() {
		return pcniid;
	}
	public void setPcniid(int pcniid) {
		this.pcniid = pcniid;
	}
	public int getPcnuid() {
		return pcnuid;
	}
	public void setPcnuid(int pcnuid) {
		this.pcnuid = pcnuid;
	}
	public String getPcniordernumber() {
		return pcniordernumber;
	}
	public void setPcniorder_number(String pcniordernumber) {
		this.pcniordernumber = pcniordernumber;
	}
	public int getPcniactualpayment() {
		return pcniactualpayment;
	}
	public void setPcniactualpayment(int pcniactualpayment) {
		this.pcniactualpayment = pcniactualpayment;
	}
	public int getPcnitransactionstatus() {
		return pcnitransactionstatus;
	}
	public void setPcnitransactionstatus(int pcnitransactionstatus) {
		this.pcnitransactionstatus = pcnitransactionstatus;
	}
	public String getPcnitime() {
		return pcnitime;
	}
	public void setPcnitime(String pcnitime) {
		this.pcnitime = pcnitime;
	}
	public Pcnindent(int pcniid, int pcnuid, String pcniordernumber,
			int pcniactualpayment, int pcnitransactionstatus, String pcnitime) {
		super();
		this.pcniid = pcniid;
		this.pcnuid = pcnuid;
		this.pcniordernumber = pcniordernumber;
		this.pcniactualpayment = pcniactualpayment;
		this.pcnitransactionstatus = pcnitransactionstatus;
		this.pcnitime = pcnitime;
	}
	public Pcnindent() {
		super();
	}
	
}
