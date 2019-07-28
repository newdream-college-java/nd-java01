package com.cc.entity;

public class Master {
	private String name;
	private String pass;
	private int money;
	public Master() {
		
	}
	public Master(String name) {
		super();
		this.name = name;
	}
	public Master(String name,String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	public Master(String name, String pass, int money) {
		super();
		this.name = name;
		this.pass = pass;
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "Master [name=" + name + ", pass=" + pass + ", money=" + money
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
