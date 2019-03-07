package com.song;

import java.util.Scanner;
/**
 * 创建客户业务类CustomerBiz，实现客户姓名的添加和显示，如图
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
			System.out.println("不能再输入客户名字");
		}
		return flag;
	}
	public void inputName() {
		Scanner input=new Scanner(System.in);
		do {
			System.out.print("请输入客户名字:");
			String name=input.next();
			if(!addName(name)) {
				break;
			}
			System.out.print("继续输入吗?(y/n):");
			String answer=input.next();
			if(answer.equals("n")) {
				break;
			}
		}while(true);
		System.out.println("**************************");
		System.out.println("\t客户列表");
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
