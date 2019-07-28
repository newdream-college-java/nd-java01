package com.java.java16;

public class Test {
	public static void main(String[] args) {
		Marster ms=new Marster();
		Pet pet=new Dog();
		ms.show(pet);
		ms.ser(pet);
		pet=new QiE();
		ms.show(pet);
		ms.ser(pet);
		pet=new MaoMi();
		ms.show(pet);
		ms.ser(pet);

		
	}
	
}
