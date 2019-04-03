package java15;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎您来到汽车租赁公司!");
		System.out.print("请输入要租赁的天数:");
		int days=input.nextInt();
		System.out.print("请输入要租赁的汽车类型:(1.轿车 2.客车)");
		int type=input.nextInt();
		if(type==1) {
			Car car=new Car();
			System.out.print("请输入要租赁的汽车品牌（1.宝马 2.别克）");
			int brand=input.nextInt();
			if(brand==1) {
				car.setType("宝马");
			}else if(brand==2) {
				car.setBrand("别克");
				System.out.print("请输入轿车的型号:(1.商务车GL8 2.林荫大道)");
				int type1=input.nextInt();
				if(type1==1) {
					car.setType("GL8");
				}else if(type==2) {
					car.setType("林荫大道");
				}
			}
			car.setNo("京BK554");
			System.out.println("分配给您的汽车牌照是:");
			System.out.println("顾客您好！您需要支付的租赁费用是"+car.CalcRent(days));
		}else if(type==2) {
			Bus bus=new Bus();
			System.out.print("请输入要租赁的客车品牌（1.金杯 2.金龙）");
			int brand=input.nextInt();
			if(brand==1) {
				bus.setBrand("金杯");
			}else if(brand==2) {
				bus.setBrand("金龙");
			}
			System.out.print("请输入轿车的型号:(1.<=16 座GL8 2.>16座)");
			int type1=input.nextInt();
			if(type1==1) {
				bus.setSeatCount(12);
			}else if(type==2) {
				bus.setSeatCount(30);
			}
			bus.setNo("京BK554");
			System.out.println("分配给您的客车牌照是:");
			System.out.println("顾客您好！您需要支付的租赁费用是"+bus.CalcRent(days));
	
	}
}
}
