package com.nd.zuoye.yl;

public class Dog extends Pet{
	private String strain = "聪明的拉布拉多";
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(String name,String strain){
		super(name);
		this.strain = strain;
	}



	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}


	public void print() {
		System.out.println("我的名字叫"+getName()+"，健康值是"+getHealth()+"，和主人的亲密度是"+getLove()+"，我是"+strain);
		
	}

}
