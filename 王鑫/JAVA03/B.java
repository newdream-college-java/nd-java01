// 输入一个年份，如果是闰年，就输出这一年是闰年，否则输出这一年是平年。闰年：年份能被4整除并且不能被100整除，或者能被400整除

import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份:");
		int n = input.nextInt();
		if(n%4==0&&n%100!=0||n%400==0){
			System.out.print("是闰年");
		}else System.out.print("是平年");
	}
}