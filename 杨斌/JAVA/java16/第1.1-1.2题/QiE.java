package com.java.java16;

public class QiE extends Pet {
	public void show() {
		setName("��");
		System.out.println("���"+getName()+"�Ա��ˣ�"+"����ֵ����5��");
		setHeath(getHeath()+5);
		
	}

	@Override
	public void Ser() {
		System.out.println("���"+getName()+"������Ӿ������ֵ����10��"+"���ܶȼ�5��");
		setLove(getLove()+5);
		
	}

}
