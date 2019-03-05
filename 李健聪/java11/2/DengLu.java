package shiyizhang;

import java.util.Scanner;

public class DengLu {
	
	/**
	 * @param args
	 */
	
		Scanner input=new Scanner(System.in);
		public void showLoginMenu(){
			System.out.println("欢迎使用我行我素购物管理系统\n");
			System.out.println("\t1.登录系统\n");
			System.out.println("\t2.退出");
			System.out.println("*************************");
			System.out.println("请选择,输入数字:");
			int a=input.nextInt();
			if(a==1){
				showMainMenu();
			}
			else{
				System.exit(-1);
			}
		}
		public void showMainMenu(){
			System.out.println("我行我素购物管理系统主界面\n");
			System.out.println("\t1.客户信息管理\n");
			System.out.println("\t2.真情回馈");
			System.out.println("*************************");
			System.out.println("请选择,输入数字或按0返回上一级菜单");
			int a=input.nextInt();
			if(a==1){
				StartSmS();
			}
			else{
				if(a==2){
					showSendGMenu();
				}
			}
		}
	
		public void StartSmS(){
			System.out.println("欢迎来到用户登陆系统");
			System.out.print("请输入用户名：");
			String a=input.next();
			System.out.print("请输入密码：");
			int b=input.nextInt();
			if(a.equals("abcde")&&b==123456){
				System.out.println("@@你成功进入登陆界面@@");
				System.out.println("您的用户名为:"+a);
				System.out.println("您的密码为："+b);
				showSendGMenu();
			}else{
				System.out.println("@@您没有权限进入系统，请重新登录。@@");
				StartSmS();
			}
			
		}
		public void showSendGMenu(){
			System.out.println("我行我素购物管理系统>真情回馈\n");
			System.out.println("*************************");
			System.out.println("1.幸运大放送\n");
			System.out.println("2.幸运抽奖\n");
			System.out.println("3.生日问候\n");
			System.out.println("*************************");
			System.out.println("请选择,输入数字或按0返回上一级菜单");
			int a=input.nextInt();
			if(a==1||a==2||a==3){
				System.out.println("这个东西我暂时还搞不出来,请重新输入");
				showSendGMenu();
			}
			else if(a==0){
				showMainMenu();
			}
		}
	
}