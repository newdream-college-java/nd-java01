package test6_7;

import java.util.Scanner;

public class Store {
	Scanner input=new Scanner(System.in);
	public void get(){
		System.out.print("������Ҫ��ʲô����Ľ���������è������");
		String zoo=input.next();
		if(zoo.equals("��")){
			Animal dog=new Dog();
			dog.shout();
		}else if(zoo.equals("è")){
			Animal cat=new Cat();
			cat.shout();
		}else if(zoo.equals("��")){
			Animal pig=new Pig();
			pig.shout();
		}else{
			System.out.println("��������");
		}
	}
}
