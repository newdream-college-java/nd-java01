package zuoye;

import java.util.Scanner;

public class Student1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入姓名：");
		String name=input.next();
		System.out.print("请输入年龄：");
		int age=input.nextInt();
		System.out.println("\n自我介绍");
		if(age<15){
			age=18;
		}
		Student1 student=new Student1();
		student.setName(name);
		student.setAge(age);
		student.show();
	}

}
