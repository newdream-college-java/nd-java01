package com.nd.zuoye.yl.yi;

public class Dog extends Pet {

	public void eat() {
		System.out.println("����ŷŷ�Ա���������ֵ��3��");
		setHealth(getHealth()+3);
		
	}

	public void bPlay() {
		System.out.println("����ŷŷ���ڽӷ��̣�����ֵ����10�����ܶ�����5��");
		setHealth(getHealth()-10);
		setLove(getLove()+5);
		
	}

}
