package com.nd.zuoye.yl;

public abstract class MotoVehicle {
	private String brand;//Ʒ��
	private String no;//���ƺ�
	private int money;
	//����
	public MotoVehicle(){
		
	}
	public MotoVehicle(String brand,String no,int money) {
		this.brand = brand;
		this.no = no;
		this.money=money;
	}
	//getset����
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

	
	//���ݿͻ����õ�������������÷�����---���󷽷�
	public abstract void calcRent(int days,String brand);
}
