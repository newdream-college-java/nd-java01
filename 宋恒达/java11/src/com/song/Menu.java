package com.song;
/**
 *  实现系统菜单、输入菜单编号，可以自由切换各个菜单
 */
import java.util.Scanner;

public class Menu {
		
	/**
	 * 实现显示主菜单
	 */
	public void showLoginMenu() {
		Scanner input=new Scanner(System.in);
		System.out.println("\t欢迎使用我行我素管理系统");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		System.out.println();
		System.out.print("请选择，输入数字:");
		int a=input.nextInt();
		switch(a) {
			case 1:
				showMainMenu();
				break;
			case 2:
				System.out.println("成功退出系统");
				System.exit(-1);
				break;
		}
	}
	/**
	 * 实现显示主菜单
	 */
	public void showMainMenu() {
		Scanner input=new Scanner(System.in);
		System.out.println("\t我行我素购物管理系统主菜单");
		System.out.println("\t\t1.客户信息管理");
		System.out.println("\t\t2.真情回馈");
		System.out.print("请选择，输入数字或按0返回上一级菜单:");
		int a=input.nextInt();
		switch(a) {
		case 0:
			showLoginMenu();
			break;
		case 1:
			showCustMenu();
			break;
		case 2:
			showSendGMenu();
			break;
		}
	}
	/**
	 * 实现显示真情回馈菜单
	 */
	public void showSendGMenu() {
		Scanner input=new Scanner(System.in);
		System.out.println("\t我行我素购物管理系统>真情回馈");
		System.out.println("\t\t1.幸运大放送");
		System.out.println("\t\t2.幸运抽奖");
		System.out.println("\t\t3.生日问候");
		System.out.print("请选择，输入数字或者按0返回上一级菜单:");
		int a=input.nextInt();
		switch(a) {
			case 0:
				showMainMenu();
				break;
			case 1:
				System.out.println("执行幸运大放送");
				showMainMenu();
				break;
			case 2:
				System.out.println("执行幸运抽奖");
				showMainMenu();
				break;
			case 3:
				System.out.println("执行生日问候");
				showMainMenu();
				break;		
		}
	}
	/**
	 * 实现显示客户信息管理菜单
	 */
	public void showCustMenu() {
		Scanner input=new Scanner(System.in);
		System.out.println("\t我行我素购物管理系统>客户信息管理");
		System.out.println("\t\t1.添加客户信息");
		System.out.println("\t\t2.修改客户信息");
		System.out.println("\t\t3.删除客户信息");
		System.out.println("\t\t4.显示所有客户信息");
		System.out.print("请选择，输入数字或者按0返回上一级菜单:");
		int a=input.nextInt();
		switch(a) {
		case 0:
			showMainMenu();
			break;
		case 1:
			System.out.println("执行添加客户信息");
			showMainMenu();
			break;
		case 2:
			System.out.println("执行添加客户信息");
			showMainMenu();
			break;
		case 3:
			System.out.println("执行添加客户信息");
			showMainMenu();
			break;
		case 4:
			System.out.println("执行添加客户信息");
			showMainMenu();
			break;
		}
	}
}
