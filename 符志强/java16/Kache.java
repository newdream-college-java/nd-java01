package ��ҵ;

import java.util.Scanner;

public class Kache extends MotoVehicle {
	private int dun;
	public Kache(int no) {
		super(no);
		
		
	}
	
	public void calcRent(int days) {
		Scanner input=new Scanner(System.in);
		System.out.print("�������������Ʒ�ƣ���1.����  ����.�ؿ���");
		this.dun=dun;
		this.brand=brand;
		int a=input.nextInt();
		if(a==1){
			brand="����";
			System.out.print("��������Ŀ����Ķ�����");
			int dun=input.nextInt();
			System.out.println("�����Ʒ��Ϊ��"+brand+" ����Ϊ����"+getNo()+"\t����Ϊ"+(days*50*dun));
			
		}else{
			brand="�ؿ�";
			System.out.print("��������Ŀ����Ķ�����");
			dun=input.nextInt();
			System.out.println("�����Ʒ��Ϊ��"+brand+"����Ϊ����"+getNo()+"/t����Ϊ"+(days*50*dun));			
		}
	}
	
}
