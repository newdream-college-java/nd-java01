//输入一个三位整数，判其是不是降序数如：531是降序数 百位>十位>个位

import java.util.Scanner;

public class A{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个3位数：");
		int n = input.nextInt();
		int a = n/100,b=n/10%10,c=n%10;
		if(a>b&&b>c){
			System.out.print("是降序数");
		}else{
			System.out.print("不是降序数");
		}
	}
}