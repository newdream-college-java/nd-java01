package com.song;

import java.util.Scanner;
/**
 * �����ͻ�ҵ����CustomerBiz��ʵ�ֿͻ���������Ӻ���ʾ����ͼ
 * @author mo
 *
 */
public class CostomerBiz {
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
			System.out.println("����������ͻ�����");
		}
		return flag;
	}
	public void inputName() {
		Scanner input=new Scanner(System.in);
		do {
			System.out.print("������ͻ�����:");
			String name=input.next();
			if(!addName(name)) {
				break;
			}
			System.out.print("����������?(y/n):");
			String answer=input.next();
			if(answer.equals("n")) {
				break;
			}
		}while(true);
		System.out.println("**************************");
		System.out.println("\t�ͻ��б�");
		System.out.println("**************************");
		for(int i=0;i<names.length;i++) {
			if(names[i]!=null) {
				System.out.print(names[i]+"\t");
			}
		}
	}
	public static void main(String[] args) {
		CostomerBiz costomerBiz=new CostomerBiz();
		costomerBiz.inputName();
	}
}
