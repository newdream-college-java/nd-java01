package ��14�·�װ��ҵ;

import java.util.Scanner;

public class TestPenguin02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ����������꣡");
		//System.out.print("������Ҫ������������֣�");
		//String petName=input.next();
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1.��������������Ȯ2.����ѩ����");
		int petType = input.nextInt();
		if(petType==1){
			Dog01 dog=new Dog01();
			//dog.setName(petName);
			System.out.println("������԰�:");
			dog.printMessage();
		}else{
			Penguin02 penguin = new Penguin02();
			System.out.print("��ѡ�������Ա�(1.Q��2.Q��)");
			int choiceSex = input.nextInt();
			if(choiceSex==1){
				penguin.setSex(penguin.sex_male);
			}else{
				penguin.setSex(penguin.sex_female);
			}
			System.out.println("������԰�:");
			penguin.show();
		}
	}
}
