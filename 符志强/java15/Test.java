package ��ҵ;

import java.util.Scanner;
import java.util.Random;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Random s=new Random();
		int sj=s.nextInt();
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ�����������޹�˾");
		System.out.print("��������Ҫ���޵�����");
		int a=input.nextInt();
		System.out.print("��������Ҫ�������������ͣ���1.�γ�  ����.�ͳ���");
		int b=input.nextInt();
		switch (b) {
		case 1:
			
			Car c1=new Car(sj);
			c1.calcRent(a);
			break;
		default:
			Bus	b1=new Bus(sj);
			b1.calcRent(a);
			break;
		}
		
	}

}
