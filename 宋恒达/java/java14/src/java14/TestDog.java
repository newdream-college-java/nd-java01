package java14;

import java.util.Scanner;
/**
 * ���ݿ���̨����ʾ��Ϣ������������ǳ�
 * Ʒ�ֵ���Ϣ��Ȼ���ӡ������Ϣ��ʾ�����ɹ�
 * @author mo
 *
 */
public class TestDog {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ�����������!");
		System.out.print("������Ҫ�������������:");
		String name=input.next();
		System.out.print("��ѡ��Ҫ�����ĳ������ͣ���1������ 2����� 3����");
		int type=input.nextInt();
		if(type==1) {
			Dog dog=new Dog();
			dog.setName(name);
			System.out.print("��ѡ�񹷹���Ʒ�֣���1����������������Ȯ 2������ѩ���ȣ�");
			int strain=input.nextInt();
			if(strain==1) {
				dog.setStrain("��������������Ȯ");
			}else if(strain==2) {
				dog.setStrain("����ѩ����");
			}
			dog.print();
		}else if(type==2) {
			Penguin penguin=new Penguin();
			penguin.setName(name);
			System.out.print("��ѡ�����Ա𣺣�1���� 2��ĸ��");
			int strain=input.nextInt();
			if(strain==1) {
				penguin.setSex("��");
			}else if(strain==2) {
				penguin.setSex("ĸ");
			}
			penguin.print();
		}else if(type==3) {
			Pig pig=new Pig();
			pig.setName(name);
			System.out.print("��ѡ���ë����ɫ����1���� 2���ڣ�");
			int color=input.nextInt();
			if(color==1) {
				pig.setColor("��");
			}else if(color==2) {
				pig.setColor("��");
			}
			pig.print();
		}
		
	}
}
