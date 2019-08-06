package com.dy.entiy;

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
		return "Fwlx [fwlx=" + fwlx + ", lxid=" + lxid + "]\n";
	}
	public Fwlx(int lxid, String fwlx) {
		super();
		this.lxid = lxid;
		this.fwlx = fwlx;
	}
	public Fwlx() {
	
	}
}
