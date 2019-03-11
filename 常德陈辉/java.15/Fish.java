package com.xiaoche;

public class Fish extends Animal{
	public void info(){
		setName("鱼");
		setAge(2);
		System.out.println("我是一只5斤的"+getName()+"!");
		System.out.println("今年"+getAge()+"岁了！");
		
	}
}
