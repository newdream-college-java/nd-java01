package Zy;


public class Zy {
	int score;
	public void showLoginmenu(){
		System.out.println("欢迎使用我行我素购物管理系统：\n\t\t1.登录系统\n\t\t2.退出");
		System.out.println("*****************************");
		System.out.println("请选择，输入数字：");
	}
	
		String names="suifeng";
		int sum=1234;
	
	public void showMainMenu(){
		System.out.println("我行我素购物管理系统主菜单：\n\t\t1.客户信息管理\n\t\t2.真情回馈");
		System.out.println("*****************************");
		System.out.println("请选择，输入数字或按0返回上级菜单：");
	}
	public void showCustMenu(){
		System.out.println("我行我素管理系统>客户信息：\n\t\t1.查询客户信息\n\t\t2.修改客户信息\n\t\t3.添加客户信息\n\t\t4.显示所有客户信息");
		System.out.println("*****************************");
		System.out.println("请选择，输入数字或按0返回上级菜单：");
	}
	public void showSendGmenu(){
		System.out.println("我行我素管理系统>真情回馈：\n\t\t1.幸运大放送\n\t\t2.幸运抽奖\n\t\t3.生日问候");
		System.out.println("*****************************");
		System.out.println("请选择，输入数字或按0返回上级菜单：");
	}
}
