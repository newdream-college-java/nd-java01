package com.newderam.xin.yl;

public class Bird extends Animal {
	private String color;
	
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}




	public void info(int age) {
		// TODO Auto-generated method stub
		
	}
	public void info(int age,String color) {
		System.out.println("����һֻ"+color+"����");
		System.out.println("����"+age+"���ˣ�");
		
	}

}
