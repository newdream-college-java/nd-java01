package cn.zuoye;

import java.util.Scanner;

public class Account {
	Scanner input=new Scanner(System.in);
	public void yhyw(){
		double sum=0,b=0;
		String c;
		do{
			System.out.println("1����� 2��ȡ�� 0���˳�");
			System.out.print("��ѡ������Ҫ�����ҵ��");
			int a=input.nextInt();
			switch(a){
				case 1:
					System.out.print("����������");
					b=input.nextDouble();
					sum+=b;
					System.out.println("���ɹ�\n");
					System.out.println("***"+"�����Ϊ��"+sum+"Ԫ***\n");
					break;
				case 2:
					System.out.print("������ȡ����");
					b=input.nextDouble();
					sum-=b;
					System.out.println("ȡ��ɹ�");
					System.out.println("***"+"�����Ϊ��"+sum+"Ԫ***\n");
					break;
				case 0:
					System.out.println("ллʹ�ã�");
					break;
			}
			System.out.print("�Ƿ��������ҵ��y/n��");
			c=input.next();
		}while(c.equals("y"));
	}
}
