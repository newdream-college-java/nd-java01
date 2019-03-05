package 第11章作业;

import java.util.Scanner;

public class Homework02_2 {
	Scanner input = new Scanner(System.in);
	int choice;
	public void showLoginMenu(){
		System.out.println("欢迎使用我行我素购物管理系统\n\t1.登录系统\n\t2.退出");
		System.out.print("请选择，输入的数字");
		choice = input.nextInt();
		if(choice==1){
			showMainMenu();
		}else if(choice==2){
			System.out.println("退出系统");
			System.exit(-1);
		}
	}
	public void showMainMenu(){
			System.out.println("我行我素购物管理系统主菜单\n\n\t1.客户信息管理\n\t2.真情回顾");
			System.out.print("请选择，输入数字或按0返回上一级菜单");
			choice =input.nextInt();
			if(choice==2){
				showSendGMenu();
			}else if(choice==1){
				System.out.println("显示客户信息");
			}else if(choice==0){
				showLoginMenu();
			}
	}
	public void showSendGMenu(){
		System.out.println("我行我素购物管理系统>真情回顾\n\n\t1.幸运大放送\n\t2.幸运抽奖\n\t3.生日问候");
		System.out.print("请选择，输入数字或按0返回上一级菜单");
		choice = input.nextInt();
		if(choice==0){
			showMainMenu();
		}else if(choice==1){
			System.out.println("执行幸运大放送");
		}else if (choice==2) {
			System.out.println("执行幸运抽奖");
		}else if (choice==3) {
			System.out.println("执行生日问候");
		}
	}

	
}
