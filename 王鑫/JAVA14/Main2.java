package Test2019_3_8_z14;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		String name ;
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ��������꣡");
		System.out.print("��������Ҫ�����ĳ������֣�");
		name=input.next();		
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1.���� 2.��� 3.��");
		int n =input.nextInt();
		/*��ʽһ��
		
		if (n==1) {
			Dog_2 dog1 = new Dog_2();
			dog1.setName(name);
			System.out.print("�����빷����ëɫ����1.��ɫ 2.��ɫ��");
			n =input.nextInt();
			dog1.setColor(n==1?"��ɫ":"��ɫ");
			dog1.show();
		}else if (n==2) {
			Penguin_2 penguin = new Penguin_2();
			penguin.setName(name);
			System.out.print("����������ëɫ����1.��ɫ 2.��ɫ��");
			n =input.nextInt();
			penguin.setColor(n==1?"��ɫ":"��ɫ");
			penguin.show();
			
		}else{
			Pig_2 pig = new Pig_2();
			pig.setName(name);
			System.out.print("�����빷����ëɫ����1.��ɫ 2.��ɫ��");
			n =input.nextInt();
			pig.setColor(n==1?"��ɫ":"��ɫ");
			pig.show();
			
		}
		*/
		//��ʽ����
		if (n==1) {
			System.out.print("�����빷����ëɫ����1.��ɫ 2.��ɫ��");
			n =input.nextInt();
			Dog_2 dog = new Dog_2(name,(n==1?"��ɫ":"��ɫ"));
			dog.show();
		}else if (n==2) {

			System.out.print("����������ëɫ����1.��ɫ 2.��ɫ��");
			n =input.nextInt();
			Penguin_2 penguin = new Penguin_2(name,(n==1?"��ɫ":"��ɫ"));
			penguin.show();
			
		}else{
		
			System.out.print("����������ëɫ����1.��ɫ 2.��ɫ��");
			n =input.nextInt();
			Pig_2 pig = new Pig_2(name,(n==1?"��ɫ":"��ɫ"));
			pig.show();
			
		}
	}
}
