package Test2;

import java.util.Scanner;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception{
		Scanner input=new Scanner(System.in);
		Person p=new Person();
		// TODO Auto-generated method stub
		System.out.print("请输入姓名：");
		String name=input.next();
			p.setName(name);
		System.out.print("请输入性别：");
		String sex=input.next();
			p.setSex(sex);
		System.out.print("请输入年龄：");
		int age=input.nextInt();
			p.setAge(age);
		p.print();

	}		
}
