package ��11����ҵ;

import java.util.Scanner;

public class StartSMS03 {
	Use03 u1= new Use03();
	String name;
	String passWord;
	int choice;
	public void show(){
		Scanner input = new Scanner(System.in);
		System.out.println("\t��ӭʹ���������ع������ϵͳ\n\t1.��¼ϵͳ\n\t2.�˳�");
		System.out.println("********************************");
	}
	public void show2(){
		Scanner input = new Scanner(System.in);
		System.out.print("��ѡ���������֣�");
		choice = input.nextInt();
		System.out.print("�������û�����");
		
		name=input.next();
		System.out.print("���룺");
		passWord=input.next();
	}
	public void panduan(){
		if(!name.equals(u1.useName)||!passWord.equals(u1.usePassword)){
			System.out.println("@@������Ȩ�޽���ϵͳ�������µ�¼��@@");
		}
	}
}
