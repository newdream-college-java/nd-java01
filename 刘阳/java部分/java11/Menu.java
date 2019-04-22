import java.util.Scanner;

import javax.sound.midi.SysexMessage;
public class Menu {
	//展示登录菜单页面
	public void showLoginMenu(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t1. 登录系统"+"\n"+"\t\t2. 退出\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择，输入数字：");
		int choice=input.nextInt();
		switch(choice){
			case 1:
				showMainMenu();
				break;
			case 2:
				//提示退出此程序
				System.out.println("您已退出系统");
				break;
		}
	}
	//展开编辑主菜单页面
	public void showMainMenu(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t我行我素购物管理系统主菜单\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t1. 客户信息管理"+"\n"+"\t\t2. 真情回馈\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int choice=input.nextInt();
		switch(choice){
			case 1:
				showCustMenu();
				break;
			case 2:
				showSendMenu();
				break;
			case 0:
				showLoginMenu();
				break;
		}
	}
	//展开编辑客户信息管理页面
	public void showCustMenu(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t我行我素购物管理系统主菜单\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t1. 查询客户信息"+"\n"+"\t\t2. 修改客户信息\n"+"\t\t3. 添加客户信息\n"+"\t\t4. 显示所有客户信息\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int choice=input.nextInt();
		switch(choice){
			case 1:
				System.out.println("欢迎进入查询客户信息");
				break;
			case 2:
				System.out.println("欢迎进入修改客户信息");
				break;
			case 3:
				System.out.println("欢迎进入添加客户信息");
				break;
			case 4:
				System.out.println("欢迎进入显示所有客户信息");
				break;
			case 0:
				showMainMenu();
				break;
		}
	}
	//展开编辑真情回馈页面
	public void showSendMenu(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t我行我素购物管理系统> 真情回馈\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("\t\t1. 幸运大放送"+"\n"+"\t\t2. 幸运抽奖\n"+"\t\t2. 生日问候\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int choice=input.nextInt();
		switch(choice){
			case 1:
				System.out.println("执行幸运大放送");
				break;
			case 2:
				System.out.println("执行幸运抽奖");
				break;
			case 3:
				System.out.println("执行生日问候");
				break;
			case 0:
				showMainMenu();
				break;
		}
	}
}
