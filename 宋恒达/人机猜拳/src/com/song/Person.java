package com.song;

import java.util.Scanner;

/**
 * 
 * @author mo
 *
 */
public class Person {
	// 属性----名字、积分
	String name;
	int score;
	// 方法----出拳
	public int punch() {
		Scanner input = new Scanner(System.in);
		System.out.print("请出拳:1.石头，2.剪刀，3，布（请输入相应的数字）:");
		int choice=-1;
		if(input.hasNextInt()) {
			choice=input.nextInt();
		}
		switch (choice) {
			case 1:
				System.out.println("你出拳:石头");
				break;
			case 2:
				System.out.println("你出拳:剪刀");
				break;
			case 3:
				System.out.println("你出拳:布");
				break;
			default:
				System.out.println("您输入有误！！");
				break;
		}
		return choice;
	}
}
