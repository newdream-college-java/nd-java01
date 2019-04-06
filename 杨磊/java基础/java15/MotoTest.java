package com.nd.zuoye.yl;

import java.util.Scanner;

public class MotoTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Car a = new Car();
		Bus b = new Bus();
		System.out.println("欢迎来到汽车租赁公司！");
		String k = null;
		do{
			System.out.println("请选择你要租赁的汽车类型:(1.轿车 2.客车)");
			switch(input.nextInt()){
				case 1:
					System.out.println("请输入你要租赁的轿车品牌：（1.宝马 2.别克）");
					switch(input.nextInt()){
						case 1:
							String brand1 = Car.宝;
							System.out.println("请选择你要租赁的轿车品牌：（1.七系 2.550i）");
							int l = input.nextInt();
							switch(l){
								case 1:
									String type1 = Car.七;
									System.out.println("请输入你要租赁的天数：");
									int days1 = input.nextInt();
									a.calcRent(days1,brand1,type1);
									break;
								case 2:
									String type2 = Car.i;
									System.out.println("请输入你要租赁的天数：");
									int days2 = input.nextInt();
									a.calcRent(days2,brand1,type2);
									break;
								default:
									System.out.println("没有这个选项请重新开始选择！");
									continue;
									
							}
							break;
						case 2:
							String brand2 = Car.别;
							System.out.println("请选择你要租赁的轿车品牌：（1.GL8 2.林荫大道）");
							int m = input.nextInt();
							switch(m){
								case 1:
									String type1 = Car.G;
									System.out.println("请输入你要租赁的天数：");
									int days1 = input.nextInt();
									a.calcRent(days1,brand2,type1);
									break;
								case 2:
									String type2 = Car.林;
									System.out.println("请输入你要租赁的天数：");
									int days2 = input.nextInt();
									a.calcRent(days2,brand2,type2);
									break;
								default:
									System.out.println("没有这个选项请重新开始选择！");
									continue;
									
							}
							break;
						default:
							System.out.println("没有这个选项请重新开始选择！");
							continue;
							
					}
					break;
				case 2:
					System.out.println("请输入你要租赁的客车品牌：（1.金杯 2.金龙）");
					switch(input.nextInt()){
						case 1:
							String brand1 = Bus.杯;
							System.out.println("请选择你要租赁的客车座位数：（1.<=16 2.>16）");
							int l = input.nextInt();
							switch(l){
							case 1:
								String seatCount1 = Bus.小于16;
								System.out.println("请输入你要租赁的天数：");
								int days1 = input.nextInt();
								b.calcRent(days1,brand1,seatCount1);
								break;
							case 2:
								String seatCount2 = Bus.大于16;
								System.out.println("请输入你要租赁的天数：");
								int days2 = input.nextInt();
								b.calcRent(days2,brand1,seatCount2);
								break;
							default:
								System.out.println("没有这个选项请重新开始选择！");
								continue;
								
						}
							break;
						case 2:
							String brand2 = Bus.龙;
							System.out.println("请选择你要租赁的客车座位数：（1.<=16 2.>16）");
							int m = input.nextInt();
							switch(m){
							case 1:
								String seatCount1 = Bus.小于16;
								System.out.println("请输入你要租赁的天数：");
								int days1 = input.nextInt();
								b.calcRent(days1,brand2,seatCount1);
								break;
							case 2:
								String seatCount2 = Bus.大于16;
								System.out.println("请输入你要租赁的天数：");
								int days2 = input.nextInt();
								b.calcRent(days2,brand2,seatCount2);
								break;
							default:
								System.out.println("没有这个选项请重新开始选择！");
								continue;
								
						}
							break;
						default:
							System.out.println("没有这个选项请重新开始选择！");
							continue;
					}
					break;
				default:
					System.out.println("没有这个选项请重新开始选择！");
					continue;

					
			}
			System.out.println("还想继续租车吗？y/n");
			k = input.next();
		}while(k.equals("y"));

		System.out.println("谢谢你的使用！");

	}

}
