package com.cc.entity;

public class Fwjd {
	private int jdid;
	private String jd;
	private int qxid;
	public int getJdid() {
		return jdid;
	}
	public void setJdid(int jdid) {
		this.jdid = jdid;
	}
	public String getJd() {
		return jd;
	}
	public void setJd(String jd) {
		this.jd = jd;
	}
	public int getQxid() {
		return qxid;
	}
	public void setQxid(int qxid) {
		this.qxid = qxid;
	}
	@Override
	public String toString() {
		return "fwjd [jdid=" + jdid + ", jd=" + jd + ", qxid=" + qxid + "]";
	}
	
}
