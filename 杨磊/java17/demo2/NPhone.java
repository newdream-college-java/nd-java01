package com.nd.yl.demo2;

public class NPhone extends Phone implements New {

	public NPhone() {
		super("С��", "����Note");
	}

	public void message() {
		System.out.println("���ڷ���������Ϣ������");

	}

	public void phone() {
		System.out.println("��������ͨ��������");

	}

	public void music() {
		System.out.println("���ڲ����������������������ǡ�����");

	}

	public void mp4() {
		System.out.println("���ڷ�ӳ��Ƶ����������9������");

	}

	public void photo() {
		System.out.println("����������գ�˫��˫�ģ��г���ĳ󡷡���");

	}

	public void surf() {
		System.out.println("�����������ˣ����С��Ƭ--���ǵ���ӡ�����");

	}

	public void print() {
		System.out.println("����һ���ͺ�Ϊ" + getType() + "��" + getBrand() + "�ֻ�");
		System.out.println("�������ƶ�����----��");

	}

}
