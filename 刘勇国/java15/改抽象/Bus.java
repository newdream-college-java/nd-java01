package ��15�¼̳�2��������󷽷�;

import java.util.Scanner;

public final class Bus extends MotoVehicle {
	private int busPay;
	private int busPrice;
	
//	public void CalcRent(int days,int carPrice){
//		busPay= busPrice*days;
//	}
	public void showBusPay(){
		System.out.println("�˿����ã�����Ҫ֧�������޷�����"+busPay+"��");
	}
	public void choiceBusType(){
		Scanner input =new Scanner(System.in);
		System.out.print("��ѡ��ͳ����ͣ�1.��<=16��\t2.����>=16����");
		int choice=input.nextInt();
		if(choice==1){
			CalcRent(days,800);
			System.out.println("�������������Ʒ���ǣ�"+getNo()+"\n");
			showBusPay();
		}else{
			CalcRent(days,1500);
			System.out.println("�������������Ʒ���ǣ�"+getNo()+"\n");
			showBusPay();
		}
	}
	@Override
	public void CalcRent(int days, int price) {
		// TODO Auto-generated method stub
		busPay = days*price;
		
	}
}
