package com.newderam.yl;

import java.util.Scanner;

public class MatheMatician {

	public void math(){//��������
		Scanner input = new Scanner(System.in);
		System.out.print("a.�����ֵ b.���λ�Ǽ��ķ��� c.���������� d.���+ \n��ѡ���ܣ�");
		String a = input.next();
		switch(a){
			case "a":
				System.out.println("�������һ������");
				int l = input.nextInt();
				System.out.println("������ڶ�������:");
				int m = input.nextInt();
				System.out.println(l+"��"+m+"�����ֵΪ��"+max(l,m));
				break;
			case "b":
				System.out.println("������һ��������");
				int k = input.nextInt();
				System.out.println(k+"�ĸ�λ��Ϊ��"+ge(k));
				break;
			case "c":
				System.out.println("������һ��������");
				int e = input.nextInt();
				System.out.println(e+"������Ϊ��"+lifang(e));
				break;
			case "d":
				System.out.println("������һ������");
				int r = input.nextInt();
				System.out.println(r+"�Ľ�+Ϊ��"+jie(r));
			default:
				System.out.println("������󣬳��������");
				System.exit(0);
		}
	}
	
	public int max(int a,int b){//�����ֵ
		if(a<b){
			int temp = a;
			a = b;
			b = temp;
		}
		return a;
	}
	
	
	
	public int ge(int a){//���λ��
		int uu = a%10;
		return uu;
	}
	
	
	
	public int lifang(int a){//������
		int li = a*a*a;
		return li;
	}
	
	
	public int jie(int a){
		int jie=0;
		for( int j=1;j<=a;j++){
			jie+=j;
		}
		
		return jie;
	}
}
