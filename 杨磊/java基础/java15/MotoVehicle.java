package com.nd.zuoye.yl;

public abstract class MotoVehicle {
	private String brand;//品牌
	private String no;//车牌号
	private int money;
	//构造
	public MotoVehicle(){
		
	}
	public MotoVehicle(String brand,String no,int money) {
		this.brand = brand;
		this.no = no;
		this.money=money;
	}
	//getset方法
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	//根据客户租用的天数来计算费用方法；---抽象方法
	public abstract void calcRent(int days,String brand);
}
