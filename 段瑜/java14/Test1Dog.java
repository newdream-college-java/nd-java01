package ��ҵ;

import java.util.Random;
import java.util.Scanner;

public class Test1Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		Penguin penguin=new Penguin();
		Random rd=new Random();
		int love=rd.nextInt(41)+60;
		int health=rd.nextInt(41)+60;
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ��������꣡��");
		System.out.print("��������Ҫ�����ĳ�������֣�");
		String name=input.next();
		System.out.print("��������Ҫ�����������ͣ�1������ 2����죩��");
		int a=input.nextInt();
		switch(a){
			case 1:	
				dog.setNames(name);
				dog.setHealth(health);
				dog.setLove(love);
				dog.show();
				break;
			case 2:
				penguin.setNames(name);
				penguin.setHealth(health);
				penguin.setLove(love);
				penguin.show();
				break;
			default:
				break;
				
		}
	}

}
