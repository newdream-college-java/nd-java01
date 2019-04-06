package com.nd.zuoye.yl.yi;

public class PetTest {

	public static void main(String[] args) {
		Master a= new Master();
		
		Pet pet = new Dog();
		a.feed(pet);
		a.play(pet);
		
		
		pet = new Penguin();
		a.feed(pet);
		a.play(pet);
		
		pet = new Cat();
		a.feed(pet);
		a.play(pet);
}

}
