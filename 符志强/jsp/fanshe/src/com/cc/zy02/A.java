package com.cc.zy02;

public class A {
	private String name;
	private int age;
	public A(){
		System.out.println("A���������");
	}
	static{
		System.out.println("���Ǿ�̬��");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
