package com.nd.yl.demo1;

public class SoftwareEngineer implements Bima, JJie {
	private String name;
	private String work;

	public SoftwareEngineer() {
		this.name = "С��";
		this.work = "�������ʦ";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public void bima() {
		System.out.println("�һ�д���룡");

	}

	public void jiangjie() {
		System.out.println("�һὲҵ��");

	}

	public void print() {
		System.out.println("����һ��" + work + "�� �ҵ����ֽ�" + name);
	}
}
