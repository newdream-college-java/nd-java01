package com.song;

import java.util.Scanner;

public class StartSMS {
		public void showMenu() {
			Scanner input=new Scanner(System.in);
			System.out.println("\t��ӭʹ���������ع���ϵͳ");
			System.out.println("\t\t1.��¼ϵͳ");
			System.out.println("\t\t2.�˳�");
			System.out.print("��ѡ����������:");
			int a=input.nextInt();
			switch(a) {
			case 1:
				System.out.print("�������û���:");
				String name=input.next();
				System.out.print("����������:");
				String password=input.next();
				if(name.equals("songhengda")&&(password.equals("123456"))) {
					System.out.println("�ɹ�����ϵͳ");
				}else {
					System.out.println(name+"��û��Ȩ�޽���ϵͳ�������µ�¼");
				}
				break;
			case 2:
				System.out.println("�˳�ϵͳ");
				System.exit(-1);
				break;
			}
			
		}
}
