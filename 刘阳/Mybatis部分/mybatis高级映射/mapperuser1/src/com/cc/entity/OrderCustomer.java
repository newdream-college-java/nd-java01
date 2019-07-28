package com.cc.entity;

public class OrderCustomer extends Orders{
	private String username;
	private String sex;
	public OrderCustomer(){}
	public OrderCustomer(String username, String sex) {
		super();
		this.username = username;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "OrderCustomer [sex=" + sex + ", username=" + username + "]";
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
