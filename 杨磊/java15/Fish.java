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
		System.out.println("����һֻ"+kg+"�ص��㣡");
		System.out.println("����"+age+"���ˣ�");
	}
	public void info(int age) {
		
	}



}
