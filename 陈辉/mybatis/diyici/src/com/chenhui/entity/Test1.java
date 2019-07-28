package com.yb.entity;

public class Test1 {
	private String orderid;
	private int number;
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Test1 [orderid=" + orderid + ", number=" + number + "]";
	}
	
}
