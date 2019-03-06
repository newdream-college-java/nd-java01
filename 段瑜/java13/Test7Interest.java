package 作业;

import java.util.Scanner;

public class Test7Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Interest a=new Interest();
		System.out.println("请输入贷款金额：");
		a.show(input.nextInt());
		System.out.println("请输入分期月份：");
		a.show1(input.nextInt());
		System.out.println("您总共需要还款："+a.interest);
		System.out.println("您每月需要还款金额为："+a.Moon);
	}

}
