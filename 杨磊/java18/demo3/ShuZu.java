package com.nd.yl.demo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShuZu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("������һ������");
			int i = input.nextInt();
			int[] a = new int[i];
			for (int j = 0; j < a.length; j++) {
				System.out.println("�������" + (j + 1) + "����");
				int b = input.nextInt();
				if (a[j] == 0) {
					a[j] = b;
				}
			}
			System.out.println("�������Ϊ��");
			for (int j = 0; j < a.length + 1; j++) {
				if (a[j] != 0) {
					System.out.println(a[j]);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("ƥ�䲻��ȷ��");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ��");
		} catch (Exception e) {
			System.out.println("������");
		}
		input.close();

	}
}
