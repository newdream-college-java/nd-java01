package cn.zuoye;

import java.util.Scanner;

public class Yd {
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入贷款总金额：");
		double a=input.nextDouble();
		System.out.print("请输入利率：");
		double e=input.nextDouble();
		System.out.print("请输入贷款年数：");
		double b=input.nextDouble();
		double c,d;//总利息，每月还款金额
		c=a*e;
		d=(a+c)*b;
		System.out.println("总利息为："+c+"\t月还款金额"+d);
	}
}
