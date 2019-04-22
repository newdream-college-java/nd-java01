package 第15章继承作业____2车辆租赁;

import java.util.Random;

public abstract class MotoVehicle {
	Random rand = new Random();
	private int type;//车的类型，轿车，客车
	private String brand;//车的品牌
	private String number;//车牌号
	private int days;//租赁的天数
	private int money;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public 	int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getNumber() {
		//在MotoVehicle父类中直接设定车牌号
		return "京A"+(rand.nextInt(9000)+1000);
	}
//	public void setNumber(String number) {
//		this.number = number;
//	}
	//计算租金的方法
	public abstract void calculateRent();
}
