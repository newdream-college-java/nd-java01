package ��ҵ;

import java.util.Scanner;

public class Store  {
	static void get(){
		Scanner input=new Scanner(System.in);
		System.out.println("����������Ҫ�ĳ���ģ�1.����  2.èè ����.����");
		int a=input.nextInt();
		if(a==1){
			Dog b=new Dog();
			b.shout();
		}else if(a==2){
			Cat c=new Cat();
			c.shout();
		}else{
			Pig p=new Pig();
			p.shout();
		}
	}
}
