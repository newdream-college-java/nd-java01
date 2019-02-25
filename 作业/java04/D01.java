import java.util.Scanner;
public class D01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------------\n登录菜单（第一级）：\n1.登录系统\n2.退出\n请选择需要登录的菜单");
		//int a = input.nextInt();
		switch(input.nextInt()){
			case 1:
				System.out.println("-----------------------------------------\n登录菜单（第二级）：\n1.客户信息管理\n2.购物结算\n3.真情回馈\n4.注销\n");
				break;		
			case 2:
				System.out.println("-----------------------------------------\n谢谢使用");
				break;
			default:
				System.out.println("输入错误");
				break;
		}
		System.out.println("请选择需要登录的菜单");
		switch(input.nextInt()){
				case 1:
					System.out.println("-----------------------------------------\n购物管理系统>客户信息管理\n1.显示所有客户信息\n2.添加客户信息\n3.修改客户信息\n4.查询客户信息");
					break;
				case 3:
					System.out.println("-----------------------------------------\n购物管理系统>真情回馈\n1.幸运大放送\n2.幸运大抽奖\n3.生日问候");
					break;
				default :
					System.out.println("输入错误");
					break;
		}
	}
}
