package com.java.java16;

public abstract class Pet {
	private int heath;
	private String name;
	private int love;
	public abstract void Ser();
	public int getLove() {
		return love;
	}

	public void setLove(int lova) {
		this.love = lova;
	}

	public abstract void show();

	public int getHeath() {
		return heath;
	}

	public void setHeath(int heath) {
		this.heath = heath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
