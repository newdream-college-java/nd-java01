package ��15�¼̳���ҵ____2��������;

import java.util.Random;

public abstract class MotoVehicle {
	Random rand = new Random();
	private int type;//�������ͣ��γ����ͳ�
	private String brand;//����Ʒ��
	private String number;//���ƺ�
	private int days;//���޵�����
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
		//��MotoVehicle������ֱ���趨���ƺ�
		return "��A"+(rand.nextInt(9000)+1000);
	}
//	public void setNumber(String number) {
//		this.number = number;
//	}
	//�������ķ���
	public abstract void calculateRent();
}
