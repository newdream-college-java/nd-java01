package com.dy.entiy;

public class Fwjd {
	private int jdid;
	private String jd;
	private int qxid;
	@Override
	public String toString() {
		return "Fwjd [jd=" + jd + ", jdid=" + jdid + ", qxid=" + qxid + "]\n";
	}
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
	public Fwjd(int jdid, String jd, int qxid) {
		super();
		this.jdid = jdid;
		this.jd = jd;
		this.qxid = qxid;
	}
	public Fwjd() {

	}
}
