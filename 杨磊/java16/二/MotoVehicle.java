package com.nd.zuoye.yl.car;

public abstract class MotoVehicle {
	private String brand;
	private String no;
	private int days;
	private int money;

	public MotoVehicle() {

	}

	public MotoVehicle(String brand, String no, int money) {
		this.brand = brand;
		this.no = no;
		this.money = money;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {

		this.money = money;
	}

	public String toString() {
		return brand + no;
	}

}
