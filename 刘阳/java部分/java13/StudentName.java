package zuoye;

import java.util.Scanner;

public class StudentName {
	String[] names=new String[5];
	String name;
	public void addname(){
		Scanner input=new Scanner(System.in);
		for(int i=0;i<names.length;i++){
			System.out.println("请输入第"+(i+1)+"个学生的姓名：");
			names[i]=input.next();
		}
		System.out.println("************************************");
		System.out.println("\t\t客户姓名列表：\t\t");
		System.out.println("************************************\n");
		for(int i=0;i<names.length;i++){
			System.out.print(names[i]+"\t");
		}
		System.out.println();
	}
	public void change(){
		Scanner input=new Scanner(System.in);
		int jilu=0;
		//提示输入修改的名字
		System.out.println("请输入要修改的客户姓名：");
		name=input.next();
		for(int i=0;i<names.length;i++){
			if(name.equals(names[i])){
				jilu=i;
			}
		}
		//提示输入新的的名字
		System.out.println("请输入新的客户姓名：");
		String name01=input.next();
		names[jilu]=name01;
		System.out.println("************************************");
		System.out.println("\t\t客户姓名列表：\t\t");
		System.out.println("************************************\n");
		for(int i=0;i<names.length;i++){
			System.out.print(names[i]+"\t");
		}
	}
}
