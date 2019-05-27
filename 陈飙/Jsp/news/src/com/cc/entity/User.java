package com.cc.entity;

public class User {
	private int Uid;
	private String Uname;
	private String Upwd;
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getUpwd() {
		return Upwd;
	}
	public void setUpwd(String upwd) {
		Upwd = upwd;
	}
	@Override
	public String toString() {
		return "User [Uid=" + Uid + ", Uname=" + Uname + ", Upwd=" + Upwd + "]";
	}
	public User(int uid, String uname, String upwd) {
		super();
		Uid = uid;
		Uname = uname;
		Upwd = upwd;
	}
	public User(){
		
	}
}
