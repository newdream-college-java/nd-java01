package Test2019_3_5;

import java.util.Scanner;

import javax.print.CancelablePrintJob;

public class Menu {
	Scanner input = new Scanner(System.in);

	// 登陆菜单
	public void showLoginMenu() {
		System.out.println("\t欢迎使用我行我素购物管理系统\t");
		System.out.println("\t\t1.登录系统");
		System.out.println("\t\t2.退出");
		System.out.println("***********************************");
		System.out.print("请选择，输入数字：");
	}

	// 主菜单
	public void showMainMenu() {		
		System.out.println("\t我行我素购物管理系统主菜单");
		System.out.println("***********************************");
		System.out.println("\t1.客戶信息管理");
		System.out.println("\t2.真情回馈");
		System.out.println("***********************************");
		System.out.print("请选择，输入数字：");
		int n  = input.nextInt();
		if (n==1) {
			showlCustMenu();
		}else if (n==2) {
			showSendMenu();
		}
			
	}

	// 信息管理菜单
	public void showlCustMenu() {
		System.out.println("***********************************");
		User use = new User();
		Scanner input = new Scanner(System.in);
		System.out.println("\t1.添加用戶");
		System.out.println("\t2.查看用戶");
		System.out.print("请输入您需要的对应选项（1/2）：");
		int n = input.nextInt();
		while (true) {
			if (n == 1) {
				for (int i = 0; i < use.name.length; i++) {
					if (use.name[i] == null) {
						System.out.print("请输入需添加的用户名：");
						use.name[i] = input.next();
						System.out.print("请输入需添加的密码：");
						use.password[i] = input.next();
						System.out.println("该用戶成功添加!!!\n");
						System.out.print("请问您是需要继续添加还是退出（y/n）：");
						String t = input.next();
						while (i < use.name.length) {
							if (t.equals("y")) {
								System.out.print("请输入需添加的用户名：");
								use.name[i] = input.next();
								System.out.print("请输入需添加的密码：");
								use.password[i] = input.next();
								System.out.println("该用戶成功添加");
								i++;
								System.out.print("请问您是需要继续添加还是退出（y/n）：");
								t = input.next();
							} else if (t.equals("n")) {
								System.out.println("已退出用户添加！！！");
								showlCustMenu();
							} else {
								System.out.println("输入信息有误请重新输入（y/n）：");
								t = input.next();
							}
						}
						break;
					}
				}
			} else if (n == 2) {
				for (int j = 0; j < use.name.length; j++) {

						System.out.println("用戶名：" + use.name[j] + "\t密码："
								+ use.password[j]);
				}
				showMainMenu();
			} else {
				System.out.print("请输入正确的选项（1/2）：");
				n = input.nextInt();
				if (n==0) {
					showMainMenu();
				}

			}
		}
	}

	// 真情回报菜单
	public void showSendMenu() {
		Scanner input = new Scanner(System.in);
		System.out.println("1.幸运大放送");
		System.out.println("2.幸运抽奖");
		System.out.println("3.生日询问");
		int n = input.nextInt();
		if (n!=0) {
			System.out.println("程序员小哥哥正在努力开发中！！！");
		}
	}

	public void entry() {

	}

	public int pk(String name, String password) {
		Manager man = new Manager();
		if (man.name2.equals(name) && man.password2.equals(password)) {
			return 1;
		} else {
			return 0;
		}
	}

	// 登录系统判断
	public void pd() {
		int n = input.nextInt();
		do {
			if (n == 1) {
				break;
			} else if (n == 2) {
				System.out.println("程序结束！！！");
				System.exit(-1);
			} else {
				System.out.print("输入信息有误，请重新输入(0返回主菜单) ：");
				n = input.nextInt();
				if (n==0) {
					showMainMenu();
				}
			}
		} while (n != 1);
	}

	public void shuru() {
		Manager man = new Manager();
		System.out.print("请输入用户名:");
		String name = input.next();
		System.out.print("请输入密码:");
		String password = input.next();
		while (true) {
			if (pk(name, password) == 1) {
				showMainMenu();
				break;
			} else {
				System.out.println("@@您没有权限进入系统，请重新登陆。@@");
				System.exit(-1);
				;
			}
		}
	}
}
