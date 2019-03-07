package com.newderam.yl;

import java.util.Scanner;

public class Triangle {
	
	public void printTriangle(int row,String ch){
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	public void print(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入行高：");
		int a = input.nextInt();
		System.out.println("请输出打印的字符：");
		String b = input.next();
		printTriangle(a,b);
	}
}
