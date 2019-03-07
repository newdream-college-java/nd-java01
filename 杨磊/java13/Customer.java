//1客户类/学生类
package com.newderam.yl;

import java.util.Scanner;

public class Customer {
		String[] name = new String[999999];
		//添加
		public void add(){
			Scanner input = new Scanner(System.in);
			boolean flag = false;
			String b=" ";
			int l = 0;
			do{
				for(int i=0;i<name.length;i++){
					if(name[i]==null){
						System.out.println("请输入客户的名字：");
						String a = input.next();
						name[i] = a;
						flag = true;
						System.out.println("添加客户成功！");
						break;
					}
					if(!flag){
						System.out.println("添加客户失败！");
					}
				}
				System.out.println("继续输入吗？是请输入y！");
				b = input.next();
				l++;
			}while(b.equals("y")&&l<name.length);	
		}
		
		//显示
		public void display(){
			int l=0;
			System.out.println("\t\t客户名字列表\n\n");
			for(int i=0;i<name.length;i++){
				if(name[i]!=null){
					System.out.print(name[i]+"\t");
					l++;
				}
				if(l%4==0){
					System.out.println();
				}
			}
			System.out.println();
		}
		public void revise(){
			Scanner input = new Scanner(System.in);
			boolean flag = false;
			System.out.print("请输入要修改的客户名字:");
			String name1 = input.next();
			System.out.print("请输入修改后的客户名字:");
			String name2 = input.next();
			
			
			
			for(int i=0;i<name.length;i++){
				if(name[i]!=null&&name[i].equals(name1)){
					name[i]=name2;
					flag = true;
					System.out.println("找到并修改成功！");
					break;
					
				}
			}
				
			
			
			if(!flag){
				System.out.println("不好意思，没这个人改不了！");
			}
			
		}
		
}
