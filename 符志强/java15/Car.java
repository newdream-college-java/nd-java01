package ��ҵ;

import java.util.Scanner;

public class Car extends MotoVehicle {
	private String type; /////�ͺ�

	public  Car(int no) {
		super(no);//   setNo(no);
		
		
	}
	public void calcRent(int days) {
		
		System.out.println("�������������Ʒ�ƣ���1.����  ����.��ˣ�");
		Scanner input=new Scanner(System.in);
		this.type=type;
		int a=input.nextInt();
		switch (a) {
		case 1:
				System.out.println("���ĳ��ƺ�Ϊ"+getNo()+"\n����Ϊ"+(days*500));
			break;
		default:
			System.out.println("�������������Ʒ�ƣ���1.�����GL8  ����.��������");
			int b=input.nextInt();
			if (b==1) {
				System.out.println("���ĳ��ƺ�Ϊ����"+getNo()+"\n����Ϊ"+(days*600));
			}else {
				System.out.println("���ĳ��ƺ�Ϊ����"+getNo()+"\n����Ϊ"+(days*300));
			}
			break;
		}
	}
}
