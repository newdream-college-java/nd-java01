package com.nd.zuoye.yl;

public class Student1 {
	private String name;
	private int age;
	
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
		if(age>=15){
		this.age = age;
		}else{
			this.age=18;
		}
	}
	public void print(){
		System.out.println("学员的姓名是："+name+",年龄是："+age);
	}
	
}
