package com.nd.zuoye.yl;

public class Penguin extends Pet{
	private String sex = "Q仔";
	
	
	public final static String SEX_MALE = "Q仔";
	public final static String SEX_FEMALE = "Q妹";
	public Penguin() {
		// TODO Auto-generated constructor stub
	}
	public Penguin(String name,String sex) {
		super(name);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public void print() {
		System.out.println("我的名字叫"+getName()+"，健康值是"+getHealth()+"，和主人的亲密度是"+getLove()+"，我是"+sex);		
	}
}
