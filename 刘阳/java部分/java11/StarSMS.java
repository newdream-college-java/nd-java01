import java.util.Scanner;


public class StarSMS {
	String name;
	String code;
	//先设定好登录页面的显示
	public void showLoginMenu(){
		Scanner input=new Scanner(System.in);
		System.out.println("\t欢迎使用我行我素购物管理系统\n");
		System.out.println("\t\t1.登录系统"+"\n\t\t2.退出");
		System.out.println("******************************");
		//提示输入
		System.out.print("请选择，输入数字：");
		int choice=input.nextInt();
		switch(choice){
			case 1:
				showLogin();
				break;
			case 2:
				//提示退出
				System.out.println("已经退出，欢迎下次再来。");
				System.exit(-1);
			default:
				System.out.println("请选择已支持的功能，谢谢。");
				showLoginMenu();
		}
	}
	public void showLogin(){
		Scanner input=new Scanner(System.in);
		//输入用户名
		System.out.println("请输入用户名：");
		name=input.next();
		System.out.println("请输入密码：");
		code=input.next();
		if(name.equals(this.name)&&code.equals(this.code)){
			System.out.println("@@您没有权限进入系统，请重新登陆。@@");
		}
	}
}
