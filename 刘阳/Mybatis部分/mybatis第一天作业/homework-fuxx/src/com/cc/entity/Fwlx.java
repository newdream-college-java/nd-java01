package com.cc.entity;

public class Fwlx {
	private int lxid;
	private String fwlx;
	public int getLxid() {
		return lxid;
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
	@Override
	public String toString() {
		return "Fwlx [lxid=" + lxid + ", fwlx=" + fwlx + "]";
	}
	
}
