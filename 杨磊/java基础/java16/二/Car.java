package com.nd.zuoye.yl.car;

public class Car extends MotoVehicle {
	private String type;

	public Car() {

	}

	public Car(String brand, String no, int money, String type) {
		super(brand, no, money);
		this.type = type;
	}

	// getset·½·¨
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return getBrand() + "\t" + type + "\t" + getNo();
	}

}
