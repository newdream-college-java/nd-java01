import java.util.Scanner;
public class Zy1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎使用任我行我素购物管理系统");
		System.out.println("1.登录系统");
		System.out.println("2.退出\n");
		System.out.println("*******************************************************");	
		System.out.print("请选择，输入数字：");
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("1.客户信息管理\n2.购物结算\n3.真情回馈\n4.注销");
				System.out.print("请选择，输入数字：");
				int b=input.nextInt();
				switch(b){
					case 1:
						System.out.println("1.显示所有客户信息");
						System.out.println("2.添加客户信息");
						System.out.println("3.修改客户信息");
						System.out.println("4.查询客户信息");
						break;
					case 2:
						System.out.println("尽情期待");
						break;
					case 3:
						System.out.println("1.幸运大放送");
						System.out.println("2.幸运抽奖");
						System.out.println("3.生日问候");
						break;
					case 4:
						System.out.println("谢谢您的使用");
						break;
					default:
						System.out.println("输入错误");
						break;

				}
				break;
			case 2:
				System.out.println("谢谢您的使用");
				break;
			default:
				System.out.println("输入错误");
				break;
		}
	}

}