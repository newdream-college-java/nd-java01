import java.util.Scanner;


public class Zylei2 {
	Scanner input=new Scanner(System.in);
	String name;
	int mm;
	public void denglu(){
		System.out.println("欢迎使用我行我素管理系统");
		System.out.println();
		System.out.println("1.登陆系统");
		System.out.println();
		System.out.println("2.退出");
		System.out.println("*****************************************");
		System.out.print("请选择输入数字：");
		int a=input.nextInt();
		//boolean f=false;
		while(a!=123) {
			
			if (a==1) {
				System.out.print("请输入用户名：");
				int b=input.nextInt();
				System.out.print("请输入密码：");
				b=input.nextInt();
				zhu();
			}if (a==2) {
				break;
			}else{
				System.out.print("输入错误，请重新输入：");
				a=input.nextInt();
			}
		}
	}
	public void zhu() {
		System.out.println("我行我素管理系统主菜单");
		System.out.println();
		System.out.println("1.客户信息管理");
		System.out.println();
		System.out.println("2.真情回馈");
		System.out.println("*****************************************");
		System.out.print("请选择，输入数字或按0返回上一菜单：");
		int b=input.nextInt();
		while(b!=147) {
			
			if (b==1) {
				guanli();
			}if (b==2) {
				huikui();
			}if (b==0) {
				denglu();
			} else{
				System.out.print("输入错误，请重新输入：");
				b=input.nextInt();
			}
		}
	}
	public void guanli() {
		System.out.println("您没有权限进入客户管理系统");
		System.out.println("请重新选择");
		zhu();
	}
	public void huikui() {
		System.out.println("我行我素管理系统>真情回馈");
		System.out.println();
		System.out.println("1.幸运大放送");
		System.out.println();
		System.out.println("2.幸运抽奖");
		System.out.println();
		System.out.println("3.生日问候");
		System.out.println("*****************************************");
		System.out.print("请选择，输入数字或按0返回上一层：");
		int c=input.nextInt();
		while(c!=258) {
			if (c==1) {
				System.out.println("执行幸运大放送");
			}if (c==2) {
				System.out.println("执行幸运抽奖");
			}if (c==3) {
				System.out.println("执行生日问候");
			}if (c==0) {
				zhu();
			}else{
				System.out.print("输入错误，请重新输入：");
				c=input.nextInt();
			}
		}				
	}
}
