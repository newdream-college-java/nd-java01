package com.xiaoche;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("��ӭ������������ƾ��˾��");
		System.out.print("������Ҫ��ƾ��������");
		int ts=input.nextInt();
		System.out.print("������Ҫ��ƾ����������(1,�γ�  2,�ͳ�):");
		int lx=input.nextInt();
		Bus bus=new Bus();
		Car car=new Car();
		if(lx==1){
			bus.showBus();
			System.out.println("\n�˿����ã�����Ҫ֧������ƾ������"+bus.getFy()*ts);
		}else{
			car.showCar();
			System.out.println("\n�˿����ã�����Ҫ֧������ƾ������"+car.getFy()*ts);
		}
		
	}

}
