package com.nd.zuoye.yl;

import java.util.Scanner;

public class PetTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ����������꣡");
		System.out.println("�������������֣�");
		String name = input.next();
		System.out.println("��ѡ����Ҫѡ��ĳ������ͣ�1.���� 2.��� 3.��");
		int number = input.nextInt();
		switch(number){
			case 1:
				System.out.println("��ѡ�񹷹���Ʒ�֣�1.��������������Ȯ 2.����ѩ����");
				int type = input.nextInt();
				String strain = "";
				switch(type){
					case 1:
						strain ="��������������Ȯ";
						break;
					case 2:
						strain ="����ѩ����";
						break;
				}
					Dog d = new Dog(name,strain);
					d.print();
					break;
			case 2:
				System.out.println("��ѡ�������Ա�1.Q�� 2.Q�ã�");
				int s = input.nextInt();
				String sex = null;
				switch(s){
					case 1:
						sex = Penguin.SEX_MALE;
						break;
					case 2:
						sex = Penguin.SEX_FEMALE;
						break;
				}
				Penguin p = new Penguin(name,sex);
				p.print();
			case 3:
				System.out.println("��ѡ�����ëƤ��ɫ����1.�� 2.�ڣ�");
				int m =input.nextInt();
				String maopi = null;
				switch(m){
					case 1:
						maopi = "��ɫ";
						break;
					case 2:
						maopi = "��ɫ";
						break;
				}
				Pig g = new Pig(name,maopi);
				g.print();
		}

	}

}
