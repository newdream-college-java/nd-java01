package Zy;

import java.util.Scanner;

public class Zytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Zy a=new Zy();
		for(int i=1;i<=3;i++){
			a.showLoginmenu();
			a.score=input.nextInt();
			switch(a.score){
			case 1:
				System.out.println("请输入用户名：");
				String name=input.next();
				System.out.println("请输入密码");
				a.score=input.nextInt();
				if(name.equals(a.names)||a.score==a.sum){
					a.showMainMenu();
					a.score=input.nextInt();
					switch(a.score){
					case 0:
						System.out.println("返回上一级页面");
						continue;
					case 1:
						
							a.showCustMenu();
							a.score=input.nextInt();
							switch(a.score){
								case 0:
									System.out.println("返回上一级页面");
									System.exit(-1);
								case 1:
									System.out.println("执行查询客户信息");
									System.exit(-1);
								case 2:
									System.out.println("执行修改客户信息");
									System.exit(-1);
								case 3:
									System.out.println("执行添加客户信息");
									System.exit(-1);
								case 4:
									System.out.println("执行显示所有客户信息");
									System.exit(-1);
								default:
									System.out.println("输入错误，请重新输入");
									continue;
								}
							
						case 2:
							a.showCustMenu();
							a.score=input.nextInt();
							switch(a.score){
								case 0:
									System.out.println("返回上一级页面");
									continue;
								case 1:
									System.out.println("执行幸运大转盘");
									System.exit(-1);
								case 2:
									System.out.println("执行幸运抽奖");
									System.exit(-1);
								case 3:
									System.out.println("执行生日问候");
									System.exit(-1);
								default:
									System.out.println("输入错误，请重新输入");
									continue;
							}
						default:
							System.out.println("输入错误，请重新输入");
							continue;
							}
						}
					else{
						System.out.println("@@您没有权限进入系统，请重新登陆。@@");
						break;
					
					}
					case 2:
						System.out.println("退出我行我素管理系统");
						System.exit(-1);
					default:
						System.out.println("输入错误，请重新输入：");
						continue;
			}
		}
	}
}
