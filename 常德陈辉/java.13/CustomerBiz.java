package cn.zuoye;

import java.util.Scanner;

public class CustomerBiz {
	Scanner input=new Scanner(System.in);
	public void showXm(){
		String[] name=new String[10]; 
		String a;
		int i=0;
		do{
			System.out.print("请输入客户姓名：");
			String mz=input.next();
			name[i]=mz;
			System.out.print("继续输入吗？（y/n）：");
			a=input.next();
			i++;
		}while(a.equals("y"));
		System.out.println("******************************");
		System.out.println("\t客户姓名列表：");
		System.out.println("******************************");
		for (i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
	}
}
