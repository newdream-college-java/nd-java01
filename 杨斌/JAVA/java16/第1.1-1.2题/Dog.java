package com.java.java16;

public class Dog extends Pet {
	public Dog(){
		setName("ŷŷ");
		setHeath(60);
		setLove(80);
	}

	public void show() {		
		System.out.println("����"+getName()+"�Ա��ˣ�"+"����ֵ����3��");
		setHeath(getHeath()+3);
	}
	public void Ser(){
		System.out.println("����"+getName()+"���ڽӷ��̡�����ֵ����10��"+"���ܶȼ�5��");
		setLove(getLove()+5);
	}

}
