package com.song;

import java.util.Scanner;

/**
 * 
 * @author mo
 *
 */
public class Person {
	// ����----���֡�����
	String name;
	int score;
	// ����----��ȭ
	public int punch() {
		Scanner input = new Scanner(System.in);
		System.out.print("���ȭ:1.ʯͷ��2.������3��������������Ӧ�����֣�:");
		int choice=-1;
		if(input.hasNextInt()) {
			choice=input.nextInt();
		}
		switch (choice) {
			case 1:
				System.out.println("���ȭ:ʯͷ");
				break;
			case 2:
				System.out.println("���ȭ:����");
				break;
			case 3:
				System.out.println("���ȭ:��");
				break;
			default:
				System.out.println("���������󣡣�");
				break;
		}
		return choice;
	}
}
