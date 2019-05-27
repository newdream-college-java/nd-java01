package com.cc.entity;

import java.util.Date;

public class New {
	private int nid;
	private int  ntid;
	private String ntitle;
	private String nauthor;
	private Date ncreatedate;
	private String npicpath;
	private String ncontent;
	private Date nmodifydate;
	private String nsummary;
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public int getNtid() {
		return ntid;
	}
	public void setNtid(int ntid) {
		this.ntid = ntid;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNauthor() {
		return nauthor;
	}
	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}
	public Date getNcreatedate() {
		return ncreatedate;
	}
	public void setNcreatedate(Date ncreatedate) {
		this.ncreatedate = ncreatedate;
	}
	public String getNpicpath() {
		return npicpath;
	}
	public void setNpicpath(String npicpath) {
		this.npicpath = npicpath;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	public Date getNmodifydate() {
		return nmodifydate;
	}
	public void setNmodifydate(Date nmodifydate) {
		this.nmodifydate = nmodifydate;
	}
	public String getNsummary() {
		return nsummary;
	}
	public void setNsummary(String nsummary) {
		this.nsummary = nsummary;
	}
	@Override
	public String toString() {
		return "New [nid=" + nid + ", ntid=" + ntid + ", ntitle=" + ntitle
				+ ", nauthor=" + nauthor + ", ncreatedate=" + ncreatedate
				+ ", npicpath=" + npicpath + ", ncontent=" + ncontent
				+ ", nmodifydate=" + nmodifydate + ", nsummary=" + nsummary
				+ "]\n";
	}
	public New(int nid, int ntid, String ntitle, String nauthor,
			Date ncreatedate, String npicpath, String ncontent,
			Date nmodifydate, String nsummary) {
		super();
		this.nid = nid;
		this.ntid = ntid;
		this.ntitle = ntitle;
		this.nauthor = nauthor;
		this.ncreatedate = ncreatedate;
		this.npicpath = npicpath;
		this.ncontent = ncontent;
		this.nmodifydate = nmodifydate;
		this.nsummary = nsummary;
	}
	public New(){
		
	}
}
