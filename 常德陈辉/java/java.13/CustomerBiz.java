package cn.zuoye;

import java.util.Scanner;

public class CustomerBiz {
	Scanner input=new Scanner(System.in);
	public void showXm(){
		String[] name=new String[10]; 
		String a;
		int i=0;
		do{
			System.out.print("������ͻ�������");
			String mz=input.next();
			name[i]=mz;
			System.out.print("���������𣿣�y/n����");
			a=input.next();
			i++;
		}while(a.equals("y"));
		System.out.println("******************************");
		System.out.println("\t�ͻ������б�");
		System.out.println("******************************");
		for (i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
	}
}
