package com.newderam.yl;

import java.util.Scanner;

public class Pay {
	public void suan(){
		Scanner input = new Scanner(System.in);
		System.out.print("����˶���Ǯ");
		int a = input.nextInt();
		System.out.print("��������Ƕ���");
		double b = input.nextDouble();
		double li = lilv(a,b);
		System.out.println("�������ϢΪ"+li);
		System.out.println("��Ĵ�������Ϊ����");
		int c = input.nextInt();
		System.out.println("����¹�Ϊ"+yue(a,li,c));
		
		
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
