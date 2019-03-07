package com.song;

import java.util.Scanner;

/**
 * 修改学生姓名，输入新、旧姓名，进行修改并提示是否修改成功
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
			System.out.println("不能再输入学生名字");
		}
		return flag;
	}
	public void inputName() {
		Scanner input=new Scanner(System.in);
		for(int i=0;i<names.length;i++) {
			System.out.print("请输入学生名字:");
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
		System.out.print("请输入要修改的学生姓名:");
		String name=input.next();
		System.out.print("请输入新的学生姓名:");
		String newName=input.next();
		System.out.println("************修改结果********************");
		boolean flag=false;
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(name)) {
				names[i]=newName;
				flag=true;
				System.out.println("找到并修改成功！");
				break;
			}
		}
		if(!flag) {
			System.out.println("无此人，修改结果失败");
		}
//		show();
	}
	public void show() {
		System.out.println("**************************");
		System.out.println("\t学生列表");
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
