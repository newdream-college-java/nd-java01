package Test2019_3_6_z13;

import java.util.Scanner;

public class Students {
	String[] name = new String[5];
	public void insertStudents(){
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < name.length; i++) {
			System.out.print("请输入客户姓名：");
			name[i] = input.next();
		}
	}
	public void showStudents(){
		System.out.println("*********************");
		System.out.println("\t客户姓名列表：");
		System.out.println("*********************");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
	}
	public void reviseStudents(){
		Scanner input = new Scanner(System.in);
		System.out.print("\n请输入要修改的客户姓名：");
		String s = input.next();
		for (int i = 0; i < name.length; i++) {
			if (s.equals(name[i])) {
				System.out.print("请输入新的客户姓名：");
				name[i]=input.next()																																								;
				break;
			}
			if (i+1==name.length) {
				System.out.println("未找到"+s+"该用户！！！");
				System.out.println("请重新输入需要修改的客户姓名：");
				s = input.next();
				i=-1;
			}
		}
		System.out.println("*****修改结果*****");
		System.out.println("找到并修改成功");
		showStudents();
	}
}
