package com.song;

import java.util.Scanner;
/**
 * 模拟银行账户业务：编写Account类，添加带参方法
 * 实现存款和取款业务，存款初始0元，取款时需要判断余额是否充足
 * @author mo
 *
 */
public class Account {
	double sum;
	public Account() {
		sum=0;
	}
	/**
	 * 业务办理操作流程
	 */
	public void operation() {
		Scanner input=new Scanner(System.in);
		boolean flag=true;  //标记是否需要继续办理业务
		do {
			System.out.println("1.存款 2.取款 0.退出");
			System.out.print("请选择你需要办理的业务:");
			int op=input.nextInt();
			switch(op) {
				case 0:
					flag=false;
					System.out.println("谢谢使用！");
					break;
				case 1:
					System.out.print("请输入存款金额:");
					double money=input.nextDouble();
					deposit(money);
					break;
				case 2:
					System.out.print("请输入取款金额:");
					double money1=input.nextDouble();
					withdrawal(money1);
					break;
			}
		}while(flag);
	}	
	/**
	 * 存款
	 */
	public void deposit(double money) {
		sum+=money;
		System.out.println("存款成功");
		System.out.println();
		System.out.println("***当前余额为:"+sum+"元***");
		System.out.println();
	}
	/**
	 * 取款
	 */
	public void withdrawal(double money) {
		if(money>sum) {
			System.out.println("余额不足，取款失败");
		}else {
			sum-=money;
			System.out.println("取款成功");
		}
		System.out.println();
		System.out.println("***当前余额为:"+sum+"元***");
		System.out.println();
	}
}
