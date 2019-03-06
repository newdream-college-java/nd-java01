
public class Denrucaidan {
	public void showLoginMenu(){
		System.out.println("\t欢迎使用我行我素购物管理系统");
		System.out.println("\t\t1.登入系统");
		System.out.println("\t\t2.退出");
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择，输入数字：");
	}
	public void showMainMenu(){
		System.out.println("\t欢迎使用我行我素购物管理系统");
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.println("\t\t1，客户信息管理");
		System.out.println("\t\t2，真情回馈");
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择，输入数字或者按0返回上一级菜单：");
	}
	public void showCustMenu(){
		System.out.println("\t我行我素购物管理系统> 客户信息管理");
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.println("\t\t1，添加用户");
		System.out.println("\t\t2，查看用户");
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择，输入数字或者按0返回上一级菜单：");
	}
	public void showSendGMenu(){
		System.out.println("\t我行我素购物管理系统> 真情回馈");
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.println("\t\t1，幸运大放送");
		System.out.println("\t\t2，幸运抽奖");
		System.out.println("\t\t3，生日问候");
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.print("请选择，输入数字或者按0返回上一级菜单：");
	}
}
