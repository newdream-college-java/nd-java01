package Test2019_3_6_z13;

import java.util.Scanner;

public class Account {
	double  money = 0;
	public void ck(int n){
		money+=n;
		System.out.println("存款成功");
		System.out.println("\n***当前余额为:"+money+"元***");
	}
	public void qk(int n){
		while (true) {
			if (money-n>=0) {
				money-=n;
				System.out.println("取款成功");
				System.out.println("\n***当前余额为:"+money+"元***");
				break;
			}else{
				System.out.println("账户余额不足，取款失败！！！");
				Scanner input = new Scanner(System.in);
				System.out.print("请输入取款金额:");
				n=input.nextInt();
			}
		}
	}
}
