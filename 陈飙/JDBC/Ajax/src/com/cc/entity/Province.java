package com.cc.entity;

public class Province {
	/* Ê¡·ÝµÄ±àºÅ */
	private int pid;
	private String pname;

	public Province(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public Province() {
		super();
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

}
