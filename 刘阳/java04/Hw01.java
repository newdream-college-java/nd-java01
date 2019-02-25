import java.util.Scanner;
public class Hw01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("登录菜单（第一级）："+"\n\n"+"1.登录系统"+"\n"+"2.退出");
		System.out.print("请选择：");
		int a =input.nextInt();
		switch(a){
			case 1:
			System.out.print("\n\n"+"主菜单（第二级）："+"\n\n"+"1.客户信息管理"+"\n"+"2.购物结算"+"\n"+"3.真情回馈"+"\n"+"4.注销");
			break;
			case 2:
			System.out.print("谢谢您的使用");
			break;
			default:
			
		}
		System.exit(-1);
	}
}