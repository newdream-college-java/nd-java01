package ��17�½ӿڳ���1_6��1_7;

import java.util.Scanner;

public class Store2 {
	static Animal get(){
		Scanner input =new Scanner(System.in);
		System.out.println("��ѡ����Ҫ������������ͣ�1.��\t2.è\t3.��");
		int choice=input.nextInt();
		if(choice==1){
			return new Dog();
		}else if(choice==2){
			return new Cat();
		}else if(choice==3){
			return new Pig();
		}else{
			return null;
		}
	}
}
