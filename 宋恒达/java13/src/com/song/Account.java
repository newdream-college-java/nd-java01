package com.song;

import java.util.Scanner;
/**
 * ģ�������˻�ҵ�񣺱�дAccount�࣬��Ӵ��η���
 * ʵ�ִ���ȡ��ҵ�񣬴���ʼ0Ԫ��ȡ��ʱ��Ҫ�ж�����Ƿ����
 * @author mo
 *
 */
public class Account {
	double sum;
	public Account() {
		sum=0;
	}
	/**
	 * ҵ������������
	 */
	public void operation() {
		Scanner input=new Scanner(System.in);
		boolean flag=true;  //����Ƿ���Ҫ��������ҵ��
		do {
			System.out.println("1.��� 2.ȡ�� 0.�˳�");
			System.out.print("��ѡ������Ҫ�����ҵ��:");
			int op=input.nextInt();
			switch(op) {
				case 0:
					flag=false;
					System.out.println("ллʹ�ã�");
					break;
				case 1:
					System.out.print("����������:");
					double money=input.nextDouble();
					deposit(money);
					break;
				case 2:
					System.out.print("������ȡ����:");
					double money1=input.nextDouble();
					withdrawal(money1);
					break;
			}
		}while(flag);
	}	
	/**
	 * ���
	 */
	public void deposit(double money) {
		sum+=money;
		System.out.println("���ɹ�");
		System.out.println();
		System.out.println("***��ǰ���Ϊ:"+sum+"Ԫ***");
		System.out.println();
	}
	/**
	 * ȡ��
	 */
	public void withdrawal(double money) {
		if(money>sum) {
			System.out.println("���㣬ȡ��ʧ��");
		}else {
			sum-=money;
			System.out.println("ȡ��ɹ�");
		}
		System.out.println();
		System.out.println("***��ǰ���Ϊ:"+sum+"Ԫ***");
		System.out.println();
	}
}
