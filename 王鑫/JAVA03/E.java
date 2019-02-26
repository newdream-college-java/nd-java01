/*
输出三个int型的数据，放到a,b，c三个变量中去，使用条件结构与交换逻辑将这三个变量中的值从小到大排列。
*/

import java.util.Scanner;

public class E{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入3个整数值：");
		int  a = input.nextInt();
		int  b = input.nextInt();
		int  c = input.nextInt();
		if(a<b){
			if(a<c){
			 	if(b<c){
					System.out.print(a+"<"+b+"<"+c);
				}else{
					System.out.print(a+"<"+c+"<"+b);
				}
			}else{
				System.out.print(c+"<"+a+"<"+b);
			}
		}else if(b<c){
			if(a<c){
				System.out.print(b+"<"+a+"<"+c);
			}else{
				System.out.print(b+"<"+c+"<"+a);
			}
		}else{
			System.out.print(c+"<"+b+"<"+a);
		}
	}
}