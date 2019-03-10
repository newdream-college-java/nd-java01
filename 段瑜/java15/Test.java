package 汽车租借系统;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Car qc=new Car();
		Bus kc=new Bus();
		int a;
		System.out.print("请输入需要租赁多少天：");
		int day=input.nextInt();
		System.out.print("请输入要租赁的汽车类型（1.轿车 2.客车）：");
		int type=input.nextInt();
		switch(type){
			case 1:
				System.out.print("请输入要租赁的汽车类型（1.宝马 2.别克）：");
				a=input.nextInt();
				switch(a){
					case 1:
						qc.getCar1();
						qc.setType("宝马550i");
						System.out.println("顾客您好，您租赁的车型是："+qc.getType()+"，你需要支付的租赁费用是"+(qc.getMoney()*day));
						break;
					case 2:
						System.out.print("请输入轿车的型号2、商务舱GL8 3、林荫大道:");
						switch(a=input.nextInt()){
							case 2:
								qc.getCar2();
								qc.setType("商务舱GL8");
								System.out.println("顾客您好，您租赁的车型是："+qc.getType()+"，你需要支付的租赁费用是"+(qc.getMoney()*day));
								break;
							case 3:
								qc.getCar3();
								qc.setType("林荫大道");
								System.out.println("顾客您好，您租赁的车型是："+qc.getType()+"，你需要支付的租赁费用是"+(qc.getMoney()*day));
								break;
							default:
								break;
						}
						break;
					default:
						break;		
				}
				break;
			case 2:
				System.out.print("请输入要租赁的汽车类型（1.金杯 2.金龙）：");
				a=input.nextInt();
				switch(a){
					case 1:
						kc.getBus1();
						kc.setSeatCount("小于16座的金龙");
						System.out.println("顾客您好，您租赁的车型是："+kc.getSeatCount()+"，你需要支付的租赁费用是"+(kc.getMoney()*day));
						break;
					case 2:
						kc.getBus2();
						kc.setSeatCount("大于16座的金杯");
						System.out.println("顾客您好，您租赁的车型是："+kc.getSeatCount()+"，你需要支付的租赁费用是"+(kc.getMoney()*day));
						break;
					default:
						break;
				}
			default:
				break;
				
		}
	}
}

