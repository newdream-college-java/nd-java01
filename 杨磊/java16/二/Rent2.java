package com.nd.zuoye.yl.car;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 汽车租赁管理
 * 
 * @author
 * 
 */
public class Rent2 {
	int money = 0;// 租金
	String answer = null;// 判断
	int sum = 0;// 租金
	String brand = null; // 品牌
	String type = null; // 型号
	String seat = null; // 座位数
	int ton = 0;
	Scanner input = new Scanner(System.in);
	Random rd = new Random();
	ArrayList al = new ArrayList();

	public void rent2() {
		System.out.println("********************欢迎光临汽车租赁公司*******************");
		// 客户租车的条件
		// 收集用户条件
		do {
			String no = "湘A" + (rd.nextInt(90000) + 10000);
			System.out.println("1、轿车   2、客车  3、货车");
			System.out.print("请选择你要租赁的汽车类型：");
			int chooseCar = input.nextInt();
			switch (chooseCar) {

			// 租赁轿车
			case 1:
				System.out.print("请选择你要租赁的轿车品牌：1、别克  2、宝马");
				int choose1 = input.nextInt();
				if (choose1 == 1) {
					brand = "别克";
					System.out.print("请选择你要租赁的轿车型号：1、林荫大道  2、GL8");
					int l = input.nextInt();
					if (l == 1) {
						type = "林荫大道";
						money = 300;
					} else if (l == 2) {
						type = "GL8";
						money = 600;
					}
				} else if (choose1 == 2) {
					brand = "宝马";
					System.out.print("请选择你要租赁的轿车型号：1、X6  2、550i");
					int l = input.nextInt();
					if (l == 1) {
						type = "X6";
						money = 400;
					} else if (l == 2) {
						type = "550i";
						money = 500;
					}
				}
				al.add(new Car(brand, no, money, type));
				break;

			// 租赁客车
			case 2:
				System.out.print("请选择你要租赁的客车品牌：1、金龙  2、金杯");
				int choose2 = input.nextInt();
				if (choose2 == 1) {
					brand = "金龙";
					System.out.print("请选择你要租赁的客车座位数：1、小于十七座  2、大于十六座");
					int l = input.nextInt();
					if (l == 1) {
						seat = "小于十七座";
						money = 800;
					} else if (l == 2) {
						seat = "大于十六座";
						money = 1500;
					}
				} else if (choose2 == 2) {
					brand = "金杯";
					System.out.print("请选择你要租赁的客车座位数：1、小于十七座  2、大于十六座");
					int l = input.nextInt();
					if (l == 1) {
						seat = "小于十七座";
						money = 800;
					} else if (l == 2) {
						seat = "大于十六座";
						money = 1500;
					}

				}
				al.add(new Bus(brand, no, money, seat));
				break;

			// 租赁货车
			case 3:
				System.out.println("请选择你要租赁的货车品牌：1、斯堪尼亚  2、沃尔沃");
				int choose3 = input.nextInt();
				if (choose3 == 1) {
					brand = "斯堪尼亚";
					System.out.print("请输入你要租赁的货车吨数：");
					ton = input.nextInt();
					money = ton * 50;

				} else if (choose3 == 2) {
					brand = "沃尔沃";
					System.out.print("请输入你要租赁的货车吨数：");
					ton = input.nextInt();
					money = ton * 50;

				}
				al.add(new Lorry(brand, no, money, ton));
				break;

			default:
				break;
			}
			// 总日租金
			sum += money;

			System.out.print("是否继续租赁？（y/n）");
			answer = input.next();
		} while (answer.equals("y"));

		System.out.print("请输入要租赁的天数：");
		int day = input.nextInt();
		System.out.println("租赁总费用是" + sum * day + "元");
		print();
		input.close();
	}

	public void print() {
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

		}
	}

}