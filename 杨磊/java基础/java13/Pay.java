package com.newderam.yl;

import java.util.Scanner;

public class Pay {
	public void suan(){
		Scanner input = new Scanner(System.in);
		System.out.print("你借了多少钱");
		int a = input.nextInt();
		System.out.print("你的利率是多少");
		double b = input.nextDouble();
		double li = lilv(a,b);
		System.out.println("你的总利息为"+li);
		System.out.println("你的贷款年限为多少");
		int c = input.nextInt();
		System.out.println("你的月供为"+yue(a,li,c));
		
		
	}
	public double lilv(int a,double b){
		double zong = a*b;
		return zong;
	}
	public double yue(int a,double b,int c){
		double yue = (a+b)/(12*c);
		return yue;
	}
}
