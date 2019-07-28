package com.cb.entity;

public class FwQx {
private int qxid;
private String qx;
public int getQxid() {
	return qxid;
}
public void setQxid(int qxid) {
	this.qxid = qxid;
}
@Override
public String toString() {
	return "FwQx [qx=" + qx + ", qxid=" + qxid + "]\n";
}
public String getQx() {
	return qx;
}
public void setQx(String qx) {
	this.qx = qx;
}
}
