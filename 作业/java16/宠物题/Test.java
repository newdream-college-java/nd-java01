package ��16�¶�̬��ҵ;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		String name;
		Master m1= new Master();
		System.out.println("��������Ҫ�������������");
		Pet pet = new Dog();
		name=input.next();
		pet.setName(name);
		m1.feed(pet);
		Pet penguin = new Penguin();
		System.out.println("��������Ҫ�������������");
		name=input.next();
		penguin.setName(name);
		m1.feed(penguin);
		Pet cat = new Cat();
		System.out.println("��������Ҫ�������������");
		name=input.next();
		cat.setName(name);
		m1.feed(cat);

	}
}
