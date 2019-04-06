package com.nd.yl.demo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShuZu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("请输入一个整数");
			int i = input.nextInt();
			int[] a = new int[i];
			for (int j = 0; j < a.length; j++) {
				System.out.println("请输入第" + (j + 1) + "个数");
				int b = input.nextInt();
				if (a[j] == 0) {
					a[j] = b;
				}
			}
			System.out.println("这个数组为：");
			for (int j = 0; j < a.length + 1; j++) {
				if (a[j] != 0) {
					System.out.println(a[j]);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("匹配不正确！");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界");
		} catch (Exception e) {
			System.out.println("玩死了");
		}
		input.close();

	}
}
