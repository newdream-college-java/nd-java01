package Test2019_3_5_z12;

import java.util.Scanner;

public class Game {
	//��ӭ����
	static int count = 0;
	static int count2 = 0;
	static int count3 = 0;
	public static void hy(){
		System.out.println("------------��ӭ������Ϸ����------------\n\n");
		System.out.println("\t******************");
		System.out.println("\t**\t��ȭ��ʼ\t**");
		System.out.println("\t******************");
		System.out.println("��ȭ����1.����2.ʯͷ3.��");
		System.out.print("��ѡ��Է���ɫ����1������ 2����Ȩ 3���ܲ٣���");
	}
	//ѡ����Խ�ɫ
	public static String js(){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (n>3&&n<1) {
			System.out.print("������ѡ��Է���ɫ����1������ 2����Ȩ 3���ܲ٣���");			
			n = input.nextInt();
		}
		if (n==1) {
			return "����";
		}else if (n==2) {
			return "��Ȩ";
		}else {
			return "�ܲ�";
		}
	}
	//�Ƿ�ʼ��ȭ
	public static void ks(){
		Scanner input = new Scanner(System.in);
		String k ;
		User use = new  User();
		Computer com = new  Computer();
		com.name=js();
		do {
			System.out.print("\nҪ��ʼ�𣿣�y/n��");
			k = input.next();
			while (!k.equals("y")&&!k.equals("n")) {
			System.out.print("Ҫ��ʼ�𣿣�y/n��");
			k = input.next();
			}
			if (!k.equals("n")) {
				int n = use.showFist();
				int m = com.showFist();
				startGame(n,m);
			}else {
				break;
			}
		count++;
		} while (true);
		
		//�����ȭ���
		
		use.jf=count2;
		com.jf=count3;
		jg(use.name,use.jf,com.name,com.jf);
	}
	//˫����ʼ��ȭ
	public static void startGame(int n ,int m){
		if (n==m) {
			System.out.println("���˵��ƽ��");
		}else if (n-m==-2||n-m==1) {
			System.out.println("���˵�����ʤ");
			count2+=1;
		}else {
			System.out.println("���˵������ʤ");
			count3+=1;
		}
	}
	public static void jg(String name,int n,String name2,int m){
		System.out.println(name+"\tVS\t"+name2);
		System.out.println("��ս������"+count);
		System.out.println();
		System.out.println("����\t\t�÷�");
		System.out.println(name+"\t\t"+n);
		System.out.println(name2+"\t\t"+m);
		if (n>m) {
			System.out.println("�������ϲ��ϲ����սʤ�˵��ԣ�����");
		}else if (n==m) {
			System.out.println("�������͵��Դ����ƽ�֣�����Ŷ������");
		}else {
			System.out.println("�����������˼������˵��ԣ��ٽ�����Ŷ������");
		}
		
	}
	public static void main(String[] args) {
		//��ӭ����		
		hy();
		//ѯ���Ƿ�ʼ
		ks();
	} 
}



















