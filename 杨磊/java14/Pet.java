package com.nd.zuoye.yl;

public abstract class Pet {
	private String name = "ÎÞÃûÊÏ";
	private int health = 100;
	private int love = 80;
	
	
	
	public Pet(){
		
	}
	public Pet(String name){
		this.name = name; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health>=1&&health<=100){
			this.health = health;		
		}
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	
	public abstract void print();
}
