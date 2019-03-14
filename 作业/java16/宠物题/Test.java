package 第16章多态作业;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		String name;
		Master m1= new Master();
		System.out.println("请输入你要领养宠物的名字");
		Pet pet = new Dog();
		name=input.next();
		pet.setName(name);
		m1.feed(pet);
		Pet penguin = new Penguin();
		System.out.println("请输入你要领养宠物的名字");
		name=input.next();
		penguin.setName(name);
		m1.feed(penguin);
		Pet cat = new Cat();
		System.out.println("请输入你要领养宠物的名字");
		name=input.next();
		cat.setName(name);
		m1.feed(cat);

	}
}
