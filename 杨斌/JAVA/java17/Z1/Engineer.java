package com.java.java17.Z1;


public class Engineer extends Programme implements Code,Business {

	public Engineer(){
		setName("С��");
		setZy("�������ʦ");
	}
	public void Dm() {
		System.out.println("�һ�д����");
		
	}

	@Override
	public void print() {
		System.out.println("�һὲҵ��");
		
	}

	@Override
	public void show() {
		System.out.println("����һ��"+getZy()+",�ҵ����ֽ�"+getName());
		
	}
	
}
