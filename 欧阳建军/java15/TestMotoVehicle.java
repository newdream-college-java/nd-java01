package ��15�¼̳���ҵ;

import java.util.Scanner;


public class TestMotoVehicle {
	Scanner input =new Scanner(System.in);
	MotoVehicle m1 =new MotoVehicle();
	Car car1 = new Car();
	public void inputDays(){
		System.out.println("��ӭ�����������޹�˾");
		System.out.print("������Ҫ���޵�����");
		m1.setDays(input.nextInt());
		inputMotoVehicleType();
	}
	public void inputMotoVehicleType(){
		System.out.print("������Ҫ���޵��������ͣ�1.�γ�\t2.�ͳ���");
		m1.setType(input.nextInt());
		if(m1.getType()==1){
			inputCarBand();
		}else{
			System.out.print("��ѡ��ͳ�������(3.��(<=16��)4.����(>16��))");
			setBusType();
		}
	}
	public void setBusType(){
		int choice=input.nextInt();
		if(choice==3){
			m1.setNumber("��BJ1234\n\n");
			System.out.print("��������������ƺ��ǣ�"+m1.getNumber());
			m1.setPrice(800);
			showPay();
		}else{
			m1.setNumber("��BX2224\n\n");
			System.out.print("��������������ƺ��ǣ�"+m1.getNumber());
			m1.setPrice(1500);
			showPay();
		}
	}
	public void inputCarBand(){
		System.out.print("������Ҫ���޵�����Ʒ�ƣ�1.����\t2.��ˣ�");
		car1.setBrand(input.nextInt());
		if(car1.getBrand()==2){
			CarTypePrice();
		}else{
			m1.setNumber("��BS9999");
			System.out.print("��������������ƺ��ǣ�"+m1.getNumber());
			m1.setPrice(500);
			showPay();
		}
	}
	public void CarTypePrice(){
		System.out.print("������γ����ͺ�2.�����GL8\t3.������");
		car1.setCarType(input.nextInt());
		if(car1.getCarType()==3){
			m1.setPrice(300);
			m1.setNumber("��������������ƺ��ǣ���BK5543\n\n");
			System.out.print(m1.getNumber());
			showPay();
		}else if(car1.getCarType()==2){
			m1.setPrice(600);
		}
	}

	public void showPay(){
		m1.setPay(m1.getDays()*m1.getPrice());
		System.out.print("�˿����ã�����Ҫ֧�������޷�����"+m1.getPay()+"��");
	}
//	public void show(){
//		MotoVehicle m1 = new MotoVehicle();
//		System.out.println("��ӭ�����������޹�˾!");
//		System.out.print("������Ҫ���޵�����\n");
//		m1.setDays(input.nextInt());
//		System.out.print("������Ҫ�����������ͣ�1���γ�\t2.�ͳ���\n");
//		m1.setType(input.nextInt());
//		if(m1.getType()==1){
//			Car car1= new Car();
//			System.out.print("������Ҫ���޵�����Ʒ�ƣ�1.����\t2.��ˣ�");
//			int choice = input.nextInt();
//			if(choice==2){
//				System.out.print("������γ����ͺ�2.�����GL8\t3.������");
//				int choiceCarType=input.nextInt();
//				if(choiceCarType==3){
//					int pay = m1.getDays()*300;
//					car1.setPay(pay);
//					System.out.println("����Ҫ֧��"+car1.getPay());
//				}
//			}
//		}TestMotoVehicle
//		
//	}
	public static void main(String[] args) {
		TestMotoVehicle ini1=new TestMotoVehicle();
		ini1.inputDays();
	}


}
