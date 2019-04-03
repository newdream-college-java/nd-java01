package com.song;

import java.util.Scanner;

public class StartSMS {
		public void showMenu() {
			Scanner input=new Scanner(System.in);
			System.out.println("\t欢迎使用我行我素管理系统");
			System.out.println("\t\t1.登录系统");
			System.out.println("\t\t2.退出");
			System.out.print("请选择，输入数字:");
			int a=input.nextInt();
			switch(a) {
			case 1:
				System.out.print("请输入用户名:");
				String name=input.next();
				System.out.print("请输入密码:");
				String password=input.next();
				if(name.equals("songhengda")&&(password.equals("123456"))) {
					System.out.println("成功进入系统");
				}else {
					System.out.println(name+"您没有权限进入系统，请重新登录");
				}
				break;
			case 2:
				System.out.println("退出系统");
				System.exit(-1);
				break;
			}
			
		}
}
