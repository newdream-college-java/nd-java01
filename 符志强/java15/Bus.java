package ��ҵ;

import java.util.Scanner;

public class Bus extends MotoVehicle {
	private int zuowei;
	public Bus(int no) {
		super(no);
		
		
	}
	
	public void calcRent(int days) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������������Ʒ�ƣ���1.��  ����.������");
		this.zuowei=zuowei;
		int a=input.nextInt();
		if(a==1){
				System.out.println("��������Ŀͳ�������������1.<=16  ����.>16��");
				int zuowei=input.nextInt();
				if (zuowei==1) {
					System.out.println("���ĳ���Ϊ����"+getNo()+"\n����Ϊ"+(days*800));
				}else {
					System.out.println("���ĳ���Ϊ����"+getNo()+"\n����Ϊ"+(days*1500));
				}
		}else{
			System.out.println("��������Ŀͳ�������������1.<=16  ����.>16��");
			zuowei=input.nextInt();
			if (zuowei==1) {
				System.out.println("����ĳ�Ϊ������  ����Ϊ����"+getNo()+",16�����µĳ�������Ϊ"+days+"����Ϊ"+(days*800));
			}else {
				System.out.println("����ĳ�Ϊ������  ����Ϊ����"+getNo()+",16�����ϵĳ�������Ϊ"+days+"����Ϊ"+(days*1500));
			}
		}
	}
	
}
