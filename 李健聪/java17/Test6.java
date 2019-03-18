package ×÷Òµ;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Animal a=new Animal() {
			
			@Override
			public void shout(String Jiao) {
				// TODO Auto-generated method stub
				
			}
		};
		Scanner input=new Scanner(System.in);
		System.out.print("ÇëÊäÈë³èÎïµÄÃû×Ö£º");
		String name = input.next();
		if (name.equals("¹·¹·")) {
			Dog dog = new Dog();
			dog.setJiao("ÍôÍôÍô");
			a.shout(dog.getJiao());
		}else if (name.equals("Ã¨ßä")) {
			Cat cat = new Cat();
			cat.setJiao("ß÷ß÷ß÷");
			a.shout(cat.getJiao());
		}
	}

}
