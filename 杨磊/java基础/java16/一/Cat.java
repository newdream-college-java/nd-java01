package com.nd.zuoye.yl.yi;

public class Cat extends Pet {
	public void eat() {
		System.out.println("è����ķ�Ա���������ֵ��4��");
		setHealth(getHealth()+4);
		
	}

	public void bPlay() {
		System.out.println("è����ķ������ë�ߣ�����ֵ����8�����ܶ�����4��");
		setHealth(getHealth()-8);
		setLove(getLove()+4);
		
	}
}
