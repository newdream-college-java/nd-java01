package zuoye;

import java.util.Scanner;

public class StartSMS {
	public void pan(){
		Scanner input = new Scanner(System.in);
		Menu l = new Menu();
		String mana="admin";
		int pW=123456;
		System.out.println("请输入用户名：");
		String g=input.next();
		if(g.equals(mana)){
			System.out.println("请输入密码：");
			int p=input.nextInt();
			if(p==pW){
				l.showMainMenu();
			}else{
				System.out.println("哦，宝贝密码错了快滚！");
				System.exit(0);
			}
		}else{
			System.out.println("哦，宝贝你不是管理员快滚！");
			System.exit(0);
		}
		
		
	}
}
