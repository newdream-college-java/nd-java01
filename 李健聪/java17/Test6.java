package ��ҵ;

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
		System.out.print("�������������֣�");
		String name = input.next();
		if (name.equals("����")) {
			Dog dog = new Dog();
			dog.setJiao("������");
			a.shout(dog.getJiao());
		}else if (name.equals("è��")) {
			Cat cat = new Cat();
			cat.setJiao("������");
			a.shout(cat.getJiao());
		}
	}

}
