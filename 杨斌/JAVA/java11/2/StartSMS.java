import java.util.Scanner;
public class StartSMS {
	String user,password;
	public void show(){
		Menu mu=new Menu();
		Scanner input=new Scanner(System.in);
		System.out.print("请输入用户名：");
		user=input.next();
		System.out.print("请输入密码：");
		password=input.next();
		if(user.equals("newdream")&&password.equals("0000")){
			mu.showMainMenu();
		}else{
			System.out.print("@@您没有权限进入系统，请重新登录.@@");
			
		}
	}
	
}
