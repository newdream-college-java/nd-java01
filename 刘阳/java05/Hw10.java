import java.util.Scanner;
public class Hw10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("\t欢迎使用MyShopping管理系统"+"\n"+"*******************************"+"\n\t\t"+"1.客户信息管理"+"\n\t\t"+"2.购物结算"+"\n\t\t"+"3.真情回馈"+"\n\t\t"+"4.注销");
		//提示进入相应模块
		System.out.println("请输入您所需要的服务的数字号码（输入整数哦！）：");
		int num=input.nextInt();
		while(num!=1&&num!=2&&num!=3&&num!=4){
			System.out.println("输入错误，请重新输入数字：");
			num=input.nextInt();
		}
		switch(num){
			case 1:
				System.out.print("已进入客户信息管理页面");
				break;
			case 2:
				System.out.print("执行购物结算");
				break;
			case 3:
				System.out.print("欢迎来到真情回馈");
				break;
			case 4:
				System.out.print("已注销");
				
			default:
		}
	}
}