package com.java.java17.Z2;

public class Xm extends Phone implements Internet,Video,Photograph,Flash,Call{
	public Xm(String brand,String xh){
		setBrand(brand);
		setXh(xh);	
		System.out.println("����һ���ͺ�Ϊ"+getXh()+"��"+getBrand()+"�ֻ�");
	}
	@Override
	public void show3() {
		System.out.println("�Ѿ������ƶ�����.........");
		
	}

	@Override
	public void show4() {
		System.out.println("��ʼ������Ƶ��Сʱ����.........");
		
	}

	@Override
	public void show5() {
		System.out.println("����.........���ճɹ�");
		
	}

	@Override
	public void show1() {
		System.out.println("���ʹ�ͼƬ�����ֵ���Ϣ.........");
		
	}

	@Override
	public void show2() {
		System.out.println("��ʼ��Ƶͨ��.........");
		
	}

}
