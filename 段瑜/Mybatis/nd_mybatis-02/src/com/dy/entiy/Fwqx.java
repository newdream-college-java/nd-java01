package com.dy.entiy;

public class Fwqx {
	private int qxid;
	private String qx;
	@Override
	public String toString() {
		return "Fwqx [qx=" + qx + ", qxid=" + qxid + "]\n";
	}
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
	public Fwqx() {
		
	}
	public Fwqx(int qxid, String qx) {
		super();
		this.qxid = qxid;
		this.qx = qx;
	}
}
