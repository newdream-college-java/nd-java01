package Test2019_3_12_z16;

import java.util.*;

public class Test02 {
	public static void main(String[] args) {
		Car car = new Car();
		Bus bus = new Bus();
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到汽车租赁公司！");
		System.out.print("请输入您的真实姓名：");
		String name = input.next();
		System.out.print("请输入要租赁的天数：");
		int day = input.nextInt();
		int money = 0;
		while (true) {
			System.out.print("请输入要租赁的汽车类型（1,轿车 2,客车 3,东风）:");
			int n = input.nextInt();
			if (n==1) {//轿车
				System.out.print("请输入要租赁的汽车品牌（1,宝马 2,别克）:");
				n = input.nextInt();
				if (n==1) {
					//宝马
					car.setLx("宝马");
				}else {
					//别克
					car.setPp("别克");
				}
				System.out.print("请输入要租赁的汽车型号（1,别克商务舱GL8 2,宝马 3,林荫大道）:");
				if (n==1) {
					//别克商务舱GL8
					money+=600;
					car.setXh("别克商务舱GL8");
				}else if (n==2) {
					//宝马
					money+=500;
					car.setXh("宝马");
				}else{
					//林荫大道
					money+=300;
					car.setXh("林荫大道");
				}
				n=input.nextInt();
				Random rd = new Random();
				System.out.println("顾客您好！您需要支付的租赁费用是："+money*day);
				System.out.println("分配给你您的车牌号是:京BK"+rd.nextInt((1000)+1000));
			}else if(n==2){//客车
				System.out.print("请输入要租赁的客车品牌（1,金杯 2,金龙）:");
				n = input.nextInt();
				if (n==1) {
					//金杯
					bus.setPp("金杯");
				}else{
					//金龙
					bus.setPp("金龙");
				}
				System.out.print("请输入要租赁的汽车型号（1,<=16座 2,>16座）:");
				n=input.nextInt();
				if (n==1) {
					//<=16座
					money+=800;
					bus.setPp("<=16座");
				}else {
					//>16座
					money+=1500;
					bus.setPp(">16座");
				}
				Random rd = new Random();
				System.out.println("分配给你您的车牌号是:京BK"+rd.nextInt((1000)+1000));
			}else{
				System.out.print("请输入要租赁的卡车吨位:");
				n=input.nextInt();
				money += 50*n;
				Random rd = new Random();
				System.out.println("分配给你您的车牌号是:京BK"+rd.nextInt((1000)+1000));
			}
			System.out.print("请问是否还需要继续租赁车辆（y/n）:");
			String s = input.next();
			if (s.equals("y")) {
				continue;
			}else break;
		}
		System.out.println("客户姓名："+name+",租赁天数:"+day+",租赁总费用："+day*money);
	}
}
