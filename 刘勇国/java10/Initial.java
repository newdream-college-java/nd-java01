package 第十章作业;

import java.util.Scanner;

public class Initial {
	String adminName;
	String name;
	String passWord;
	String adminPassWord;
	public void show(){
		Scanner input =new Scanner(System.in);
		Admin admin1 =new Admin();
		admin1.name="admin1";
		admin1.passWord="111111";
		Admin admin2 =new Admin();
		admin2.name="admin2";
		admin2.passWord="222222";
		input();
		checkOut();
	}
	
	public void input(){
		Scanner input =new Scanner(System.in);
		System.out.print("请输入用户名：");
		adminName = input.next();
		System.out.print("\n\n请输入密码：");
		adminPassWord = input.next();
	}
	public void checkOut(){
		if(adminName.equals("admin1")&&adminPassWord.equals("111111")){
			xiugai();
		}else if(adminName.equals("admin2")&&adminPassWord.equals("222222")){
			xiugai();
		}else{
			System.out.println("用户名和密码不匹配！您没有权限更新管理员信息");
		}
	}
	public void xiugai(){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入新密码");
		adminPassWord = input.next();
		System.out.print("修改密码成功，您的新密码为："+adminPassWord);
	}
}
