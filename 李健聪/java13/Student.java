package 第十三章作业;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	Scanner input=new Scanner(System.in);
	public Student(){
		String[] student=new String[5];
		for(int i=0;i<5;i++){
			System.out.print("请输入客户姓名:");
			student[i]=input.next();
		}
		System.out.println("***********************");
		System.out.println("\t客户姓名列表：");
		System.out.println("***********************");
		System.out.println(Arrays.toString(student)+"\n");
		System.out.println("请输入要修改的客户姓名：");
		String b=input.next();
		for(int i=0;i<student.length;i++){
			if(b.equals(student[i])){
				System.out.println("请输入新的客户的姓名：");
				String c=input.next();
				student[i]=c;
				System.out.println("找到并修改成功");
			}
		}
		System.out.println("***********************");
		System.out.println("\t客户姓名列表：");
		System.out.println("***********************");
		System.out.println(Arrays.toString(student)+"\n");
	}
}
