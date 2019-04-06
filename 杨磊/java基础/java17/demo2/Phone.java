package com.nd.yl.demo2;

public abstract class Phone {
	private String brand;
	private String type;

	public Phone() {

	}

	public Phone(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract void print();
}
