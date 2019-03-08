package 第13章作业;

import java.util.Scanner;

public class RateTest {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Rate r =new Rate();
		System.out.print("请输入你的贷款总金额");
		int money=input.nextInt();
		r.allRate(money);
		System.out.println(r.show());
	}
}
