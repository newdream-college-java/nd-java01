package com.nd.zuoye.yl.car;

public class Lorry extends MotoVehicle {
	private int ton;

	public Lorry(String brand, String no, int money, int ton) {
		super(brand, no, money);
		this.ton = ton;
	}

	public int getTon() {
		return ton;
	}

	public void setTon(int ton) {
		this.ton = ton;
	}

	public String toString() {
		return getBrand() + "\t" + ton + "\t" + getNo();

	}
}
