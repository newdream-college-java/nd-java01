package com.xiaoche;

import java.util.Scanner;

public class Car extends MotoVehicle {
	Scanner input=new Scanner(System.in);
	public void showCar(){
		System.out.print("������Ҫ��ƾ�Ŀͳ�Ʒ��(1,�� 2����������");
		int a=input.nextInt();
		if(a==1){
			System.out.print("������ͳ���λ��1��<=16�� 2��>16��");
			int b=input.nextInt();
			if(b==1){
				setFy(800);
				setNo("��BK5533");
				System.out.println("��������Ŀͳ��ƺ��ǣ�"+getNo());
			}else{
				setFy(1500);
				setNo("��BK5522");
				System.out.println("��������Ŀͳ��ƺ��ǣ�"+getNo());
			}	
		}else{
			System.out.print("������ͳ���λ��1��<=16�� 2��>16��");
			int b=input.nextInt();
			if(b==1){
				setFy(800);
				setNo("��BK5511");
				System.out.println("��������Ŀͳ��ƺ��ǣ�"+getNo());
			}else{
				setFy(1500);
				setNo("��BK5588");
				System.out.println("��������Ŀͳ��ƺ��ǣ�"+getNo());
			}
		}
	}
}
