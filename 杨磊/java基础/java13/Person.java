package com.newderam.yl;

public class Person {
	String name;
	String sex;
	int age;
	public  Person(){
		
	}
	public Person(String name,String sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	public void display(){
		System.out.println("--------人员信息--------");
		System.out.println("姓名---》"+name);
		System.out.println("性别---》"+sex);
		System.out.println("年龄---》"+age);
	}
}
