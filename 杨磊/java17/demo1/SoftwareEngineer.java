package com.nd.yl.demo1;

public class SoftwareEngineer implements Bima, JJie {
	private String name;
	private String work;

	public SoftwareEngineer() {
		this.name = "小明";
		this.work = "软件工程师";
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
		System.out.println("我会写代码！");

	}

	public void jiangjie() {
		System.out.println("我会讲业务！");

	}

	public void print() {
		System.out.println("我是一名" + work + "， 我的名字叫" + name);
	}
}
