package ��ҵ;

import java.util.Scanner;

public class Bus extends MotoVehicle {
	private int zuowei;
	public Bus(int no) {
		super(no);
		
		
	}
	
	public void calcRent(int days) {
		Scanner input=new Scanner(System.in);
		System.out.print("�������������Ʒ�ƣ���1.��  ����.������");
		this.zuowei=zuowei;
		this.brand=brand;
		int a=input.nextInt();
		if(a==1){
			brand="��";
			System.out.print("��������Ŀͳ�������������1.<=16  ����.>16��");
			int zuowei=input.nextInt();
			if (zuowei==1) {
				System.out.println("�����Ʒ��Ϊ��"+brand+" ����Ϊ����"+getNo()+"\t����Ϊ"+(days*800));
			}else {
				System.out.println("�����Ʒ��Ϊ��"+brand+"����Ϊ����"+getNo()+"\t����Ϊ"+(days*1500));
			}
		}else{
			brand="����";
			System.out.print("��������Ŀͳ�������������1.<=16  ����.>16��");
			zuowei=input.nextInt();
			if (zuowei==1) {
				System.out.println("�����Ʒ��Ϊ��"+brand+" ����Ϊ����"+getNo()+"/t����Ϊ"+(days*800));
			}else {
				System.out.println("�����Ʒ��Ϊ��"+brand+"����Ϊ����"+getNo()+"/t����Ϊ"+(days*1500));
			}
		}
	}
	
}
