package ��ʮ������ҵ;

import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ����������꣡");
		System.out.println("������Ҫ������������֣�");
		String name=input.next();
		System.out.println("��ѡ��Ҫ�����ĳ������ͣ���1������ 2����죩");
		int a=input.nextInt();
		if(a==1){
			System.out.println("��ѡ�񹷹���Ʒ��:(1/�������������� 2������ѩ����)");
			int b=input.nextInt();
			if(b==1){
				System.out.println("������԰ף�");
				Dog dog=new Dog(name,100,80,"��������������");
			}if(b==2){
				System.out.println("������԰ף�");
				Dog dog=new Dog(name,100,80,"����ѩ����");
			}
		}
		if(a==2){
			System.out.println("��ѡ�񹷹���Ʒ��:(1/qq��� 2��QQ���)");
			int b=input.nextInt();
			if(b==1){
				System.out.println("������԰ף�");
				Dog dog=new Dog(name,100,80,"qq���");
			}if(b==2){
				System.out.println("������԰ף�");
				Dog dog=new Dog(name,100,80,"QQ���");
			}
		}
	}

}
