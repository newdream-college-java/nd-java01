package com.song;
/**
 *  ʵ��ϵͳ�˵�������˵���ţ����������л������˵�
 */
import java.util.Scanner;

public class Menu {
		
	/**
	 * ʵ����ʾ���˵�
	 */
	public void showLoginMenu() {
		Scanner input=new Scanner(System.in);
		System.out.println("\t��ӭʹ���������ع���ϵͳ");
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println("\t\t2.�˳�");
		System.out.println();
		System.out.print("��ѡ����������:");
		int a=input.nextInt();
		switch(a) {
			case 1:
				showMainMenu();
				break;
			case 2:
				System.out.println("�ɹ��˳�ϵͳ");
				System.exit(-1);
				break;
		}
	}
	/**
	 * ʵ����ʾ���˵�
	 */
	public void showMainMenu() {
		Scanner input=new Scanner(System.in);
		System.out.println("\t�������ع������ϵͳ���˵�");
		System.out.println("\t\t1.�ͻ���Ϣ����");
		System.out.println("\t\t2.�������");
		System.out.print("��ѡ���������ֻ�0������һ���˵�:");
		int a=input.nextInt();
		switch(a) {
		case 0:
			showLoginMenu();
			break;
		case 1:
			showCustMenu();
			break;
		case 2:
			showSendGMenu();
			break;
		}
	}
	/**
	 * ʵ����ʾ��������˵�
	 */
	public void showSendGMenu() {
		Scanner input=new Scanner(System.in);
		System.out.println("\t�������ع������ϵͳ>�������");
		System.out.println("\t\t1.���˴����");
		System.out.println("\t\t2.���˳齱");
		System.out.println("\t\t3.�����ʺ�");
		System.out.print("��ѡ���������ֻ��߰�0������һ���˵�:");
		int a=input.nextInt();
		switch(a) {
			case 0:
				showMainMenu();
				break;
			case 1:
				System.out.println("ִ�����˴����");
				showMainMenu();
				break;
			case 2:
				System.out.println("ִ�����˳齱");
				showMainMenu();
				break;
			case 3:
				System.out.println("ִ�������ʺ�");
				showMainMenu();
				break;		
		}
	}
	/**
	 * ʵ����ʾ�ͻ���Ϣ����˵�
	 */
	public void showCustMenu() {
		Scanner input=new Scanner(System.in);
		System.out.println("\t�������ع������ϵͳ>�ͻ���Ϣ����");
		System.out.println("\t\t1.��ӿͻ���Ϣ");
		System.out.println("\t\t2.�޸Ŀͻ���Ϣ");
		System.out.println("\t\t3.ɾ���ͻ���Ϣ");
		System.out.println("\t\t4.��ʾ���пͻ���Ϣ");
		System.out.print("��ѡ���������ֻ��߰�0������һ���˵�:");
		int a=input.nextInt();
		switch(a) {
		case 0:
			showMainMenu();
			break;
		case 1:
			System.out.println("ִ����ӿͻ���Ϣ");
			showMainMenu();
			break;
		case 2:
			System.out.println("ִ����ӿͻ���Ϣ");
			showMainMenu();
			break;
		case 3:
			System.out.println("ִ����ӿͻ���Ϣ");
			showMainMenu();
			break;
		case 4:
			System.out.println("ִ����ӿͻ���Ϣ");
			showMainMenu();
			break;
		}
	}
}
