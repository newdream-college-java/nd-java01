package com.newderam.yl;

import java.util.Scanner;

public class Account {
	int money;//定义一个存款
	
	
	
	public void pan(int money){//业务层
		Scanner input = new Scanner(System.in);
		for(;;){
			System.out.println("1.存款 2.取款 0退出");
			System.out.println("请选择你需要办理的业务：");
			int a = input.nextInt();
			switch(a){
			case 1:
				//存款
				cunkuan(money);
				break;
			case 2:
				//取款
				qukuan(money);
				break;
			default:
				//退出
				System.out.println("程序结束！");
				System.exit(0);
			}
		}
		
	}
	
	
	//存款
	public void cunkuan(int sum){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入存款金额：");
		int l = input.nextInt();
		money +=l;
		System.out.println("你的余额为"+money);
	}
	
	
	//取款
	public void qukuan(int sum){
		Scanner input = new Scanner(System.in);
		if(money>0){
			System.out.println("请输入取款金额");
			int l = input.nextInt();
			money -=l;
			System.out.println("你的余额为"+money);
		}else{
			System.out.println("余额不足0元，请选择1.存款 2.退出");
			int a=input.nextInt();
			if(a==1){
				cunkuan(money);
			}else{
				System.out.println("程序结束！");
				System.exit(0);
			}
		}
	}
}
