package ��15�¼̳�2��������󷽷�;

import java.util.Scanner;

public final class Car extends MotoVehicle{
	private String carType;
	private String carBand;
	private int carPrice;
	private int carPay;
	
	public void CalcRent(int days,int carPrice){
		carPay= carPrice*days;
	}
	public void choiceBrand(){
		Scanner input =new Scanner(System.in);
		System.out.print("������Ҫ����������Ʒ�ƣ�1.����2.��ˣ�:");
		int choice=input.nextInt();
		if(choice==2){
			System.out.print("������γ����ͺţ�2.�����GL8"+"\t"+"3.��������:");
			choice=input.nextInt();
			if(choice==3){
				CalcRent(days,300);
				System.out.println("�������������Ʒ���ǣ�"+getNo()+"\n");
				showCarPay();
			}else{
				CalcRent(days,600);
				System.out.println("�������������Ʒ���ǣ�"+getNo()+"\n");
				showCarPay();
			}
		}else{
			CalcRent(days,500);
			System.out.println("�������������Ʒ���ǣ�"+getNo()+"\n");
			showCarPay();
		}
	}
	public void showCarPay(){
		System.out.println("�˿����ã�����Ҫ֧�������޷�����"+carPay+"��");
	}
}
