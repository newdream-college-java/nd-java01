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
		System.out.println("--------��Ա��Ϣ--------");
		System.out.println("����---��"+name);
		System.out.println("�Ա�---��"+sex);
		System.out.println("����---��"+age);
	}
}
