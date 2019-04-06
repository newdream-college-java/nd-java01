package com.nd.yl.demo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Course {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("请输入课程代号 （1~3之间的数字）：");
			int i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("C#课程");
				break;
			case 2:
				System.out.println("JAVA课程");
				break;
			case 3:
				System.out.println("SQL基础");
				break;
			default:
				System.out.println("没有这个课程！");
				break;
			}
		} catch (InputMismatchException e) {
			// if (e instanceof InputMismatchException) {
			// InputMismatchException l = e;
			// System.out.println(l.getStackTrace());
			// }
			System.out.println("输入类型不匹配！");

		} catch (Exception e) {
			System.out.println("玩死了");
		} finally {
			System.out.println("欢迎提出建议！");
		}
		// catch (ArrayIndexOutOfBoundsException e) {
		// System.out.println("数组越界");
		// }

	}
}
