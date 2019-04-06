package zuoye;

import java.util.Scanner;

public class Menu {
	Scanner input=new Scanner(System.in);
	public void showLoginMenu(){
		StartSMS d =new StartSMS();
		System.out.println("欢迎使用我行我素购物管理系统\n\t1.登录系统\n\t2.退出");
		System.out.print("请选择，输入数字：");
		int a=input.nextInt();
		if(a==1){
			d.pan();
		}else{
			System.out.println("欢迎你的下一次使用，再见！");
			System.exit(0);
		}		
	}
	public void showMainMenu(){
		System.out.println("欢迎使用我行我素购物管理系统\n\t1.客户信息管理\n\t2.真情回馈");
		System.out.println("请选择，输入数字或按0返回上一层菜单:");
		int b=input.nextInt();
		if(b==1){
			showCustMenu();
		}else if(b==2){
			showSendMenu();
		}else if(b==0){
			showLoginMenu();
		}else{
			System.out.println("瞎了眼吗，输错了！");
		}
	}
	public void showCustMenu(){
		System.exit(0);
	}
	public void showSendMenu(){
		System.out.println("我行我素购物管理系统》真情回馈\n\t1.幸运大放送\n\t2.幸运抽奖\n\t3.生日问候");
		System.out.println("请选择，输入数字或按0返回上一层菜单:");
		int c=input.nextInt();
		if(c==0){
			showMainMenu();
		}
	}
	
}
