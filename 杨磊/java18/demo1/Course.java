package com.nd.yl.demo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Course {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("������γ̴��� ��1~3֮������֣���");
			int i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("C#�γ�");
				break;
			case 2:
				System.out.println("JAVA�γ�");
				break;
			case 3:
				System.out.println("SQL����");
				break;
			default:
				System.out.println("û������γ̣�");
				break;
			}
		} catch (InputMismatchException e) {
			// if (e instanceof InputMismatchException) {
			// InputMismatchException l = e;
			// System.out.println(l.getStackTrace());
			// }
			System.out.println("�������Ͳ�ƥ�䣡");

		} catch (Exception e) {
			System.out.println("������");
		} finally {
			System.out.println("��ӭ������飡");
		}
		// catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("����Խ��");
		// }

	}
}
