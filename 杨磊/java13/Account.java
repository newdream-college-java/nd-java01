package com.newderam.yl;

import java.util.Scanner;

public class Account {
	int money;//����һ�����
	
	
	
	public void pan(int money){//ҵ���
		Scanner input = new Scanner(System.in);
		for(;;){
			System.out.println("1.��� 2.ȡ�� 0�˳�");
			System.out.println("��ѡ������Ҫ�����ҵ��");
			int a = input.nextInt();
			switch(a){
			case 1:
				//���
				cunkuan(money);
				break;
			case 2:
				//ȡ��
				qukuan(money);
				break;
			default:
				//�˳�
				System.out.println("���������");
				System.exit(0);
			}
		}
		
	}
	
	
	//���
	public void cunkuan(int sum){
		Scanner input = new Scanner(System.in);
		System.out.println("���������");
		int l = input.nextInt();
		money +=l;
		System.out.println("������Ϊ"+money);
	}
	
	
	//ȡ��
	public void qukuan(int sum){
		Scanner input = new Scanner(System.in);
		if(money>0){
			System.out.println("������ȡ����");
			int l = input.nextInt();
			money -=l;
			System.out.println("������Ϊ"+money);
		}else{
			System.out.println("����0Ԫ����ѡ��1.��� 2.�˳�");
			int a=input.nextInt();
			if(a==1){
				cunkuan(money);
			}else{
				System.out.println("���������");
				System.exit(0);
			}
		}
	}
}
