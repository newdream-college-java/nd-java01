package cn.zuoye;

import java.util.Scanner;

public class Student {
	Scanner input=new Scanner(System.in);
	public void showName(){
		String[] name=new String[5];
		int i;
		for (i = 0; i < name.length; i++) {
			System.out.print("请输入客户姓名：");
			String mz=input.next();
			name[i]=mz;
		}
	System.out.println("****************************");
	System.out.println("\t客户姓名列表：");
	System.out.println("****************************");
	for ( i = 0; i < name.length; i++) {
		System.out.print(name[i]+"\t");
	}
	System.out.print("\n请输入要修改的客户姓名：");
	String mz=input.next();
	boolean flag=false;
	for ( i = 0; i < name.length; i++) {
		if(name[i].equals(mz)){
			flag=true;
			System.out.print("请输入新客户姓名：");
			String xmz=input.next();
			name[i]=xmz;
			System.out.println("*****修改结果*****");
			System.out.println("找到并修改成功!");
			System.out.println("****************************");
			System.out.println("\t客户姓名列表：");
			System.out.println("****************************");
			for (int j = 0; j < name.length; j++) {
				System.out.print(name[j]+"\t");
			}	
		}
	}
	if(flag!=true)
	System.out.println("未找到此客户！");
	}
}
