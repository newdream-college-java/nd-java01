package java15;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ�������������޹�˾!");
		System.out.print("������Ҫ���޵�����:");
		int days=input.nextInt();
		System.out.print("������Ҫ���޵���������:(1.�γ� 2.�ͳ�)");
		int type=input.nextInt();
		if(type==1) {
			Car car=new Car();
			System.out.print("������Ҫ���޵�����Ʒ�ƣ�1.���� 2.��ˣ�");
			int brand=input.nextInt();
			if(brand==1) {
				car.setType("����");
			}else if(brand==2) {
				car.setBrand("���");
				System.out.print("������γ����ͺ�:(1.����GL8 2.������)");
				int type1=input.nextInt();
				if(type1==1) {
					car.setType("GL8");
				}else if(type==2) {
					car.setType("������");
				}
			}
			car.setNo("��BK554");
			System.out.println("�������������������:");
			System.out.println("�˿����ã�����Ҫ֧�������޷�����"+car.CalcRent(days));
		}else if(type==2) {
			Bus bus=new Bus();
			System.out.print("������Ҫ���޵Ŀͳ�Ʒ�ƣ�1.�� 2.������");
			int brand=input.nextInt();
			if(brand==1) {
				bus.setBrand("��");
			}else if(brand==2) {
				bus.setBrand("����");
			}
			System.out.print("������γ����ͺ�:(1.<=16 ��GL8 2.>16��)");
			int type1=input.nextInt();
			if(type1==1) {
				bus.setSeatCount(12);
			}else if(type==2) {
				bus.setSeatCount(30);
			}
			bus.setNo("��BK554");
			System.out.println("��������Ŀͳ�������:");
			System.out.println("�˿����ã�����Ҫ֧�������޷�����"+bus.CalcRent(days));
	
	}
}
}
