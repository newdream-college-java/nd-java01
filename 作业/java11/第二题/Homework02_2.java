package ��11����ҵ;

import java.util.Scanner;

public class Homework02_2 {
	Scanner input = new Scanner(System.in);
	int choice;
	public void showLoginMenu(){
		System.out.println("��ӭʹ���������ع������ϵͳ\n\t1.��¼ϵͳ\n\t2.�˳�");
		System.out.print("��ѡ�����������");
		choice = input.nextInt();
		if(choice==1){
			showMainMenu();
		}else if(choice==2){
			System.out.println("�˳�ϵͳ");
			System.exit(-1);
		}
	}
	public void showMainMenu(){
			System.out.println("�������ع������ϵͳ���˵�\n\n\t1.�ͻ���Ϣ����\n\t2.����ع�");
			System.out.print("��ѡ���������ֻ�0������һ���˵�");
			choice =input.nextInt();
			if(choice==2){
				showSendGMenu();
			}else if(choice==1){
				System.out.println("��ʾ�ͻ���Ϣ");
			}else if(choice==0){
				showLoginMenu();
			}
	}
	public void showSendGMenu(){
		System.out.println("�������ع������ϵͳ>����ع�\n\n\t1.���˴����\n\t2.���˳齱\n\t3.�����ʺ�");
		System.out.print("��ѡ���������ֻ�0������һ���˵�");
		choice = input.nextInt();
		if(choice==0){
			showMainMenu();
		}else if(choice==1){
			System.out.println("ִ�����˴����");
		}else if (choice==2) {
			System.out.println("ִ�����˳齱");
		}else if (choice==3) {
			System.out.println("ִ�������ʺ�");
		}
	}

	
}
