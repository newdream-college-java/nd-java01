package com.cb.entity;

public class FwUser {
	private int uid;
	private String uname;
	private String upass;

	@Override
	public String toString() {
		return "FwUser [uid=" + uid + ", uname=" + uname + ", upass=" + upass
				+ "]\n";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}
}
