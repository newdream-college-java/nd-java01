package com.newderam.xin.yl;

public class Fish extends Animal {
	private int kg;
	
	
	

	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}



	public void info(int age,int kg){
		System.out.println("我是一只"+kg+"重的鱼！");
		System.out.println("今年"+age+"岁了！");
	}
	public void info(int age) {
		
	}



}
