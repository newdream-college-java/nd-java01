package 第11章作业;

import java.util.Scanner;

public class StartSMS03 {
	Use03 u1= new Use03();
	String name;
	String passWord;
	int choice;
	public void show(){
		Scanner input = new Scanner(System.in);
		System.out.println("\t欢迎使用我行我素购物管理系统\n\t1.登录系统\n\t2.退出");
		System.out.println("********************************");
	}
	public void show2(){
		Scanner input = new Scanner(System.in);
		System.out.print("请选择，输入数字：");
		choice = input.nextInt();
		System.out.print("请输入用户名：");
		
		name=input.next();
		System.out.print("密码：");
		passWord=input.next();
	}
	public void panduan(){
		if(!name.equals(u1.useName)||!passWord.equals(u1.usePassword)){
			System.out.println("@@您灭有权限进入系统，请重新登录。@@");
		}
	}
}
