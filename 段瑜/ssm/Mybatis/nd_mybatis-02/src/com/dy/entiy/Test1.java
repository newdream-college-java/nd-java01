package com.dy.entiy;

public class Test1 {
	private String orderid;
	private int number;
	public Test1(String orderid, int number) {
		super();
		this.orderid = orderid;
		this.number = number;
	}
	public Test1() {
		super();
		
	}
	@Override
	public String toString() {
		return "Test1 [orderid=" + orderid + ", number=" + number + "]";
	}
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
}
