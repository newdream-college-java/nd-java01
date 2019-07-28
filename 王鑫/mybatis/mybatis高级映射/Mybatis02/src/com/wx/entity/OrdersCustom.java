package com.wx.entity;

public class OrdersCustom extends Orders {
	private String username;
	private String sex;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "OrdersCustom [sex=" + sex + ", username=" + username
				+ ", getCreatetime()=" + getCreatetime() + ", getId()="
				+ getId() + ", getNote()=" + getNote() + ", getNumber()="
				+ getNumber() + ", getUser()=" + getUser() + ", getUserId()="
				+ getUserId() + "]\n";
	}
}
