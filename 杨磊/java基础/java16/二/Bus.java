package com.nd.zuoye.yl.car;

public class Bus extends MotoVehicle {
	private String seatCount;

	public Bus() {

	}

	public Bus(String brand, String no, int money, String seatCount) {
		super(brand, no, money);
		this.setSeatCount(seatCount);
	}

	// getset·½·¨

	public String getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}

	public String toString() {
		return getBrand() + "\t" + seatCount + "\t" + getNo();
	}

}
