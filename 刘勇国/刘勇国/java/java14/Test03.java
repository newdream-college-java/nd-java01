package ��14�·�װ��ҵ;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ����������꣡");
		System.out.print("������Ҫ������������֣�");
		String petName=input.next();
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1.��������������Ȯ2.����ѩ����3.��");
		int petType = input.nextInt();
		if(petType==1){
			Dog03 dog=new Dog03();
			dog.setName(petName);
			System.out.println("������԰�:");
			dog.printMessage();
		}else if(petType==3){
			Pig03 pig = new Pig03(100,80);
			pig.setName(petName);
			System.out.println("������������ɫ(1.��2.��)");
			int color=input.nextInt();
			if(color==1){
				pig.setColor("��");
			}else{
				pig.setColor("��");
			}
			pig.show();
		}else{
			Penguin03 penguin = new Penguin03(petName,99,80);
			System.out.println("��ѡ�������Ա𣺣�1.Q��2.Q�ã�");
			int chioce=input.nextInt();
			if(chioce==1){
				penguin.setSex(penguin.sex_male);
			}else{
				penguin.setSex(penguin.sex_female);
			}
			//penguin.setName(petName);
			//penguin.set
			System.out.println("������԰�:");
			penguin.show();
		}
	}
}

