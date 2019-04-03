package java10;

import java.util.Scanner;

/**
 * 编写管理员类，（属性：用户名，密码；方法：show()显示管理员信息）
 * 1.创建两个管理员类，输出他们的相关信息
 * 2.输入旧得用户名和密码，如果正确，才有权限更新，从键盘获得新的密码，进行更新
 * @author mo
 *
 */
public class Manager {
		String name;
		String password;
		//显示管理员信息
		public void show() {
			System.out.println("姓名:"+name+",密码:"+password);
		}
		//更新密码
		public void updatePassword() {
			Scanner input=new Scanner(System.in);
			System.out.print("请输入用户名:");
			String name1=input.next();
			System.out.print("请输入密码:");
			String password1=input.next();
			if(name1.equals(this.name)&&(password1.equals(this.password))) {
				System.out.print("请输入新密码:");
				String newPassword=input.next();
				System.out.println("修改密码成功，您得新密码是:"+newPassword);
			}else {
				System.out.println("用户名和密码不正确，你没有权限更新管理员信息");
			}
		}
		
}
