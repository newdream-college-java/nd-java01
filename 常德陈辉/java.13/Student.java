package cn.zuoye;

import java.util.Scanner;

public class Student {
	Scanner input=new Scanner(System.in);
	public void showName(){
		String[] name=new String[5];
		int i;
		for (i = 0; i < name.length; i++) {
			System.out.print("������ͻ�������");
			String mz=input.next();
			name[i]=mz;
		}
	System.out.println("****************************");
	System.out.println("\t�ͻ������б�");
	System.out.println("****************************");
	for ( i = 0; i < name.length; i++) {
		System.out.print(name[i]+"\t");
	}
	System.out.print("\n������Ҫ�޸ĵĿͻ�������");
	String mz=input.next();
	boolean flag=false;
	for ( i = 0; i < name.length; i++) {
		if(name[i].equals(mz)){
			flag=true;
			System.out.print("�������¿ͻ�������");
			String xmz=input.next();
			name[i]=xmz;
			System.out.println("*****�޸Ľ��*****");
			System.out.println("�ҵ����޸ĳɹ�!");
			System.out.println("****************************");
			System.out.println("\t�ͻ������б�");
			System.out.println("****************************");
			for (int j = 0; j < name.length; j++) {
				System.out.print(name[j]+"\t");
			}	
		}
	}
	if(flag!=true)
	System.out.println("δ�ҵ��˿ͻ���");
	}
}
