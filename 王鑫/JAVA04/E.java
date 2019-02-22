/*
循环要求用户输入一个到之间的整数，如果输入的0是就输出“你出的是石头”，如果输入的1是就输出“你出的是剪刀”，
如果输入的2是就输出“你出的是布”，如果是其他数就结束程序。
*/

import java.util.Scanner;

public class E{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入：");
		int n = input.nextInt();
		while(n==0||n==1||n==2){
			if(n==0){
				System.out.print("你输出的是石头\n请再次输入：");
			}else if(n==1){
				System.out.print("你输出的是剪刀\n请再次输入：");
			}else {
				System.out.print("你输出的是布\n请再次输入：");
			}
			n = input.nextInt();
		}
	}
}