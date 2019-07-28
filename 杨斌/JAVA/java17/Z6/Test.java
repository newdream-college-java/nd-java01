package com.java.java17.Z6;

public class Test {
	public static void main(String[] args) {
		Animal an=new Dog();	
		Store.get(an);
		an=new Pig();
		Store.get(an);
	}
	
	
}
