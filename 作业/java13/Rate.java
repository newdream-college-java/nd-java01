package 第13章作业;

import java.util.Scanner;

public class Rate {
	double rate=0.06;
	double allrate ;
	double monthPayMoney;
	Scanner input =new Scanner(System.in);
	public void allRate(int money){
		allrate = money*rate;
		System.out.print("请输入你的贷款年限");
		int year=input.nextInt();
		monthPayMoney=(allrate+money)/(year*12);
	}
	public String show(){
		return "总利息为："+allrate+"\t月还款金额为："+monthPayMoney;
	}
}
