/**
**使用switch选择结构实现从登录菜单切换到主菜单功能：
**输入数字1：进入主菜单
**输入数字2：推出并显示“谢谢您的使用”
**输入其它数字，显示“输入错误”
**/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("\t登录菜单（第一级）");
		System.out.println("\t1.登录系统");
		System.out.println("\t2.退出");
		System.out.println();
		System.out.print("\t请选择菜单:");
		int a=input.nextInt();
		switch(a){
			case 1:
				System.out.println("\t主菜单（第二级）");
				System.out.println("\t1.客户信息管理");
				System.out.println("\t2.购物结算");
				System.out.println("\t3.真情回馈");
				System.out.println("\t4.注销");
				break;
			case 2:
				System.out.println("\t谢谢您的使用！");
				break;
			default:
				System.out.println("\t输入错误");
		}
	}
}