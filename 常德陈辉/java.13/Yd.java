package cn.zuoye;

import java.util.Scanner;

public class Yd {
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.print("����������ܽ�");
		double a=input.nextDouble();
		System.out.print("���������ʣ�");
		double e=input.nextDouble();
		System.out.print("���������������");
		double b=input.nextDouble();
		double c,d;//����Ϣ��ÿ�»�����
		c=a*e;
		d=(a+c)*b;
		System.out.println("����ϢΪ��"+c+"\t�»�����"+d);
	}
}
