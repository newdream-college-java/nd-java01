package com.java.java17.Z2;

public class Sn extends Phone implements Audio,Flash,Call{
	public Sn(String brand,String xh){
		setBrand(brand);
		setXh(xh);	
		System.out.println("����һ���ͺ�Ϊ"+getXh()+"��"+getBrand()+"�ֻ�");
	}
	@Override
	public void show() {
		System.out.println("��ʼ�������֡���ѩ����������������");
		
	}
	@Override
	public void show1() {
		System.out.println("����������Ϣ��������������");
		
	}
	@Override
	public void show2() {
		System.out.println("��ʼ����ͨ����������������\n\n");
		
	}
	
}
