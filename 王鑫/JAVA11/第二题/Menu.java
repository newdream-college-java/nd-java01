package Test2019_3_5;

import java.util.Scanner;

import javax.print.CancelablePrintJob;

public class Menu {
	Scanner input = new Scanner(System.in);

	// ��½�˵�
	public void showLoginMenu() {
		System.out.println("\t��ӭʹ���������ع������ϵͳ\t");
		System.out.println("\t\t1.��¼ϵͳ");
		System.out.println("\t\t2.�˳�");
		System.out.println("***********************************");
		System.out.print("��ѡ���������֣�");
	}

	// ���˵�
	public void showMainMenu() {		
		System.out.println("\t�������ع������ϵͳ���˵�");
		System.out.println("***********************************");
		System.out.println("\t1.�͑���Ϣ����");
		System.out.println("\t2.�������");
		System.out.println("***********************************");
		System.out.print("��ѡ���������֣�");
		int n  = input.nextInt();
		if (n==1) {
			showlCustMenu();
		}else if (n==2) {
			showSendMenu();
		}
			
	}

	// ��Ϣ����˵�
	public void showlCustMenu() {
		System.out.println("***********************************");
		User use = new User();
		Scanner input = new Scanner(System.in);
		System.out.println("\t1.����Ñ�");
		System.out.println("\t2.�鿴�Ñ�");
		System.out.print("����������Ҫ�Ķ�Ӧѡ�1/2����");
		int n = input.nextInt();
		while (true) {
			if (n == 1) {
				for (int i = 0; i < use.name.length; i++) {
					if (use.name[i] == null) {
						System.out.print("����������ӵ��û�����");
						use.name[i] = input.next();
						System.out.print("����������ӵ����룺");
						use.password[i] = input.next();
						System.out.println("���Ñ��ɹ����!!!\n");
						System.out.print("����������Ҫ������ӻ����˳���y/n����");
						String t = input.next();
						while (i < use.name.length) {
							if (t.equals("y")) {
								System.out.print("����������ӵ��û�����");
								use.name[i] = input.next();
								System.out.print("����������ӵ����룺");
								use.password[i] = input.next();
								System.out.println("���Ñ��ɹ����");
								i++;
								System.out.print("����������Ҫ������ӻ����˳���y/n����");
								t = input.next();
							} else if (t.equals("n")) {
								System.out.println("���˳��û���ӣ�����");
								showlCustMenu();
							} else {
								System.out.println("������Ϣ�������������루y/n����");
								t = input.next();
							}
						}
						break;
					}
				}
			} else if (n == 2) {
				for (int j = 0; j < use.name.length; j++) {

						System.out.println("�Ñ�����" + use.name[j] + "\t���룺"
								+ use.password[j]);
				}
				showMainMenu();
			} else {
				System.out.print("��������ȷ��ѡ�1/2����");
				n = input.nextInt();
				if (n==0) {
					showMainMenu();
				}

			}
		}
	}

	// ����ر��˵�
	public void showSendMenu() {
		Scanner input = new Scanner(System.in);
		System.out.println("1.���˴����");
		System.out.println("2.���˳齱");
		System.out.println("3.����ѯ��");
		int n = input.nextInt();
		if (n!=0) {
			System.out.println("����ԱС�������Ŭ�������У�����");
		}
	}

	public void entry() {

	}

	public int pk(String name, String password) {
		Manager man = new Manager();
		if (man.name2.equals(name) && man.password2.equals(password)) {
			return 1;
		} else {
			return 0;
		}
	}

	// ��¼ϵͳ�ж�
	public void pd() {
		int n = input.nextInt();
		do {
			if (n == 1) {
				break;
			} else if (n == 2) {
				System.out.println("�������������");
				System.exit(-1);
			} else {
				System.out.print("������Ϣ��������������(0�������˵�) ��");
				n = input.nextInt();
				if (n==0) {
					showMainMenu();
				}
			}
		} while (n != 1);
	}

	public void shuru() {
		Manager man = new Manager();
		System.out.print("�������û���:");
		String name = input.next();
		System.out.print("����������:");
		String password = input.next();
		while (true) {
			if (pk(name, password) == 1) {
				showMainMenu();
				break;
			} else {
				System.out.println("@@��û��Ȩ�޽���ϵͳ�������µ�½��@@");
				System.exit(-1);
				;
			}
		}
	}
}
