package com.xiaoche;

import java.util.Scanner;

public class Bus extends MotoVehicle{
	Scanner input=new Scanner(System.in);
	public void showBus(){
		System.out.print("������Ҫ��ƾ������Ʒ��(1,���� 2����ˣ���");
		int a=input.nextInt();
		if(a==1){
			setFy(500);
			setNo("��BK5543");
			System.out.println("��������������ƺ��ǣ�"+getNo());
		}else{
			System.out.print("������γ����ͺ�1�������GL8 2��������");
			int b=input.nextInt();
			if(b==1){
				setFy(600);
				setNo("��BK5544");
				System.out.println("��������������ƺ��ǣ�"+getNo());
			}else{
				setFy(300);
				setNo("��BK5545");
				System.out.println("��������������ƺ��ǣ�"+getNo());
			}
		}
	}
}
