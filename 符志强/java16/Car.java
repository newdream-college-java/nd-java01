package ��ҵ;

import java.util.Scanner;

public class Car extends MotoVehicle {
	private String type; /////�ͺ�

	public  Car(int no) {
		super(no);//   setNo(no);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;	
	}
	public void calcRent(int days) {
		
		System.out.print("�������������Ʒ�ƣ���1.����  ����.��ˣ�");
		Scanner input=new Scanner(System.in);
		this.type=type;
		this.brand=brand;
		int a=input.nextInt();
		switch (a) {
		case 1:
				brand="����";
				System.out.println("����Ʒ��Ϊ��"+brand+"���ƺ�Ϊ:��"+getNo()+"\t����Ϊ"+(days*500));
			break;
		default:
			System.out.println("�������������Ʒ�ƣ���1.��������GL8  ����.�����������");
			int b=input.nextInt();
			if (b==1) {
				brand="��������GL8";
				System.out.println("����Ʒ��Ϊ��"+brand+"���ƺ�Ϊ����"+getNo()+"\t����Ϊ"+(days*600));
			}else {
				brand="���������";
				System.out.println("����Ʒ��Ϊ��"+brand+"���ƺ�Ϊ����"+getNo()+"\t����Ϊ"+(days*300));
			}
			break;
		}
	}
}
