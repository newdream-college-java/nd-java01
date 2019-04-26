package 作业;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Person {
	private String name;
	private int age;
	private String sex;
	Scanner input=new Scanner(System.in);
	
	 void print() {
		// TODO Auto-generated method stub
		 set();
		 set1();
			System.out.println(name+"（"+sex+","+age+"岁）");	
			
		
	}
	public void set(){		 
			 System.out.println("请输入姓名：");
			 name=input.next();
			 try {
				 System.out.println("请输入性别：");
					sex=input.next();
					throw new InputMismatchException("性别必须为 男 或 女！");		
			} catch (Exception e) {
				System.out.println(e.getMessage()+"输入错误11");
				e.printStackTrace();
				return;
			}
	}
	public void set1(){
			try {
				 System.out.println("请输入年龄：");
				 age=input.nextInt();
				 if (age>=1&&age<=100) {
					 throw new InputMismatchException("年龄必须在1到100之间！");	
				 }
			} catch (Exception e) {
				System.err.println(e.getMessage()+"输入错误");
				e.printStackTrace();
				return;
			}
	}
}
