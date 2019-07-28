package com.cb.entity;

public class FwLx {
private int lxid;
private String fwlx;
public int getLxid() {
	return lxid;
}
@Override
public String toString() {
	return "FwLx [fwlx=" + fwlx + ", lxid=" + lxid + "]\n";
}
public void setLxid(int lxid) {
	this.lxid = lxid;
}
public String getFwlx() {
	return fwlx;
}
public void setFwlx(String fwlx) {
	this.fwlx = fwlx;
}
}
