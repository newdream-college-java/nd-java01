package com.xiaoche;

import java.util.Scanner;

public class Bus extends MotoVehicle{
	Scanner input=new Scanner(System.in);
	public void showBus(){
		System.out.print("请输入要租凭的汽车品牌(1,宝马 2，别克）：");
		int a=input.nextInt();
		if(a==1){
			setFy(500);
			setNo("京BK5543");
			System.out.println("分配给您的汽车牌号是："+getNo());
		}else{
			System.out.print("请输入轿车的型号1，商务舱GL8 2，林荫大道");
			int b=input.nextInt();
			if(b==1){
				setFy(600);
				setNo("京BK5544");
				System.out.println("分配给您的汽车牌号是："+getNo());
			}else{
				setFy(300);
				setNo("京BK5545");
				System.out.println("分配给您的汽车牌号是："+getNo());
			}
		}
	}
}
