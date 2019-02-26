/*
输入一个int型的数据，判断这个数是否能被2整除，如果能被2整除，那么输出“这个数是偶数”，否则输出“这个数是奇数”。
	提示： 8%2==0  10%2==0
		9%2==1
*/

import java.util.Scanner;

public class F{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int n = input.nextInt();
		if(n%2==0){
			System.out.print("这个数是偶数");
		}else{
			System.out.print("这个数是奇数");
		}
	}
}