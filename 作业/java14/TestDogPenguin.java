package ��14�·�װ��ҵ;

import java.util.Scanner;

public class TestDogPenguin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ����������꣡");
		System.out.print("������Ҫ������������֣�");
		String petName=input.next();
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1.��������������Ȯ2.����ѩ����");
		int petType = input.nextInt();
		if(petType==1){
			Dog01 dog=new Dog01();
			dog.setName(petName);
			System.out.println("������԰�:");
			dog.printMessage();
		}else{
			Penguin01 penguin = new Penguin01();
			penguin.setName(petName);
			System.out.println("������԰�:");
			penguin.printMessage();
		}
	}
}
