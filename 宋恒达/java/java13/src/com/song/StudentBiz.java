package com.song;

import java.util.Scanner;

/**
 * �޸�ѧ�������������¡��������������޸Ĳ���ʾ�Ƿ��޸ĳɹ�
 * @author mo
 *
 */
public class StudentBiz {
	String[] names=new String[4];
	public boolean addName(String name) {
		boolean flag=false;
		for(int i=0;i<name.length();i++) {
			if(names[i]==null) {
				names[i]=name;
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("����������ѧ������");
		}
		return flag;
	}
	public void inputName() {
		Scanner input=new Scanner(System.in);
		for(int i=0;i<names.length;i++) {
			System.out.print("������ѧ������:");
			String name=input.next();
			if(!addName(name)) {
				break;
			}
		}
//		show();
//		modifyName();
	}
	public void modifyName() {
		Scanner input =new Scanner(System.in);
		System.out.print("������Ҫ�޸ĵ�ѧ������:");
		String name=input.next();
		System.out.print("�������µ�ѧ������:");
		String newName=input.next();
		System.out.println("************�޸Ľ��********************");
		boolean flag=false;
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(name)) {
				names[i]=newName;
				flag=true;
				System.out.println("�ҵ����޸ĳɹ���");
				break;
			}
		}
		if(!flag) {
			System.out.println("�޴��ˣ��޸Ľ��ʧ��");
		}
//		show();
	}
	public void show() {
		System.out.println("**************************");
		System.out.println("\tѧ���б�");
		System.out.println("**************************");
		for(int i=0;i<names.length;i++) {
			if(names[i]!=null) {
				System.out.print(names[i]+"\t");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		StudentBiz studentBiz=new StudentBiz();
		studentBiz.inputName();
		studentBiz.show();
		studentBiz.modifyName();
		studentBiz.show();
	}
}
