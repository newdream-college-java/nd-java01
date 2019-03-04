package Test2019_3_3_第十章;

import java.util.Scanner;

public class zhu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		manager man = new manager();
		manager2 man2 = new manager2();
		man.show();
		man2.show();
		System.out.print("账号：");
		String name = input.next();
		System.out.print("密码：");
		String password = input.next();
		do {
			if (name.equals(man.name)) {
				System.out.print("请输入新密码：");
				man.password = input.next();
				System.out.print("修改密码成功，新密码为："+man.password);
				break;
			}else{
				System.out.println("用户名和密码不匹配！您还没有管理员信息。");
			}
			System.out.print("账号：");
			name = input.next();
			System.out.print("密码：");
			password = input.next();
		} while (true);
		
		
	}
}
