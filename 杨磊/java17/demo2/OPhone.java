package com.nd.yl.demo2;

public class OPhone extends Phone implements Old {
	public OPhone() {
		super("���ᰮ����", "G5O2c");
	}

	public void message() {
		System.out.println("���ڷ���������Ϣ������");

	}

	public void phone() {
		System.out.println("��������ͨ��������");

	}

	public void print() {
		System.out.println("����һ���ͺ�Ϊ" + getType() + "��" + getBrand() + "�ֻ�");

	}

}
