package com.java.java17.Z1;


public class Engineer extends Programme implements Code,Business {

	public Engineer(){
		setName("小明");
		setZy("软件工程师");
	}
	public void Dm() {
		System.out.println("我会写代码");
		
	}

	@Override
	public void print() {
		System.out.println("我会讲业务");
		
	}

	@Override
	public void show() {
		System.out.println("我是一名"+getZy()+",我的名字叫"+getName());
		
	}
	
}
