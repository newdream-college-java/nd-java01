package com.xiaoche;

public class Bird extends Animal{
	public void info(){
		setColor("红色");
		setName("鸟");
		setAge(4);
		System.out.println("我是一只"+getColor()+"的"+getName()+"!");
		System.out.println("今年"+getAge()+"岁了！");
		
	}
}
