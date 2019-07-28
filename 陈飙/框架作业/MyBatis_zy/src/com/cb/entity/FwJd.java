package com.cb.entity;

public class FwJd {
private int jdid;
private String jd;
private int qxid;
public int getJdid() {
	return jdid;
}
@Override
public String toString() {
	return "FwJd [jd=" + jd + ", jdid=" + jdid + ", qxid=" + qxid + "]\n";
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
}
