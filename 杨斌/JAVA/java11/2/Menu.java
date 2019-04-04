import java.util.Scanner;
public class Menu {
	public void showLoingMenu(){
		StartSMS sms=new StartSMS();
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎使用我行我素购物管理系统");
		System.out.println("\t1.登录系统");
		System.out.println("\t2.退出");
		System.out.println("******************************");
		System.out.print("请选择，输入数字：");
		int login=input.nextInt();
		if(login==1){
			sms.show();
		}else{
			System.out.print("感谢您的使用");
		}
		
	}
	public void showMainMenu(){
		Scanner a=new Scanner(System.in);
		System.out.println("我行我素购物管理系统");
		System.out.println("\t1.客户管理系统");
		System.out.println("\t2.真情回馈");
		System.out.println("******************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int main=a.nextInt();
		if(main==0){
			showLoingMenu();
		}else if(main==1){
			showCustMenu();
		}else if(main==2){
			showSendMenu();
		}else{
			System.out.print("输入错误,请重新输入");
			showMainMenu();
		}
		
	}
	public void showCustMenu(){
		Scanner b=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>客户信息管理");
		System.out.println("\t1.查询客户信息");
		System.out.println("\t2.修改客户信息");
		System.out.println("\t3.添加客户信息");
		System.out.println("\t2.显示所有客户信息");
		System.out.println("******************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int cust=b.nextInt();
		if(cust==0){
			showMainMenu();
		
		}else{
			System.out.print("输入错误,请重新输入");
			showCustMenu();
		}
	}
	public void showSendMenu(){
		Scanner c=new Scanner(System.in);
		System.out.println("我行我素购物管理系统>真情回馈");
		System.out.println("\t1.幸运大放送");
		System.out.println("\t2.幸运抽奖");
		System.out.println("\t3.生日问候");
		System.out.println("******************************");
		System.out.print("请选择，输入数字或按0返回上一级菜单：");
		int send=c.nextInt();
		if(send==0){
			showMainMenu();
		
		}else{
			System.out.print("输入错误,请重新输入");
			showSendMenu();
		}
	}
}
