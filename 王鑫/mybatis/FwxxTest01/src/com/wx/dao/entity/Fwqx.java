package com.wx.dao.entity;

public class Fwqx {
	private int qxid;
	private String qx;
	public int getQxid() {
		return qxid;
	}
	public void setQxid(int qxid) {
		this.qxid = qxid;
	}
	public String getQx() {
		return qx;
	}
	public void setQx(String qx) {
		this.qx = qx;
	}
	@Override
	public String toString() {
		return "Fwqx [qxid=" + qxid + ", qx=" + qx + "]";
	}
	
}
