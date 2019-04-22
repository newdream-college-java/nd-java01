package com.xiaoche;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("欢迎您来到汽车租凭公司！");
		System.out.print("请输入要租凭的天数：");
		int ts=input.nextInt();
		System.out.print("请输入要租凭的汽车类型(1,轿车  2,客车):");
		int lx=input.nextInt();
		Bus bus=new Bus();
		Car car=new Car();
		if(lx==1){
			bus.showBus();
			System.out.println("\n顾客您好！您需要支付的租凭费用是"+bus.getFy()*ts);
		}else{
			car.showCar();
			System.out.println("\n顾客您好！您需要支付的租凭费用是"+car.getFy()*ts);
		}
		
	}

}
