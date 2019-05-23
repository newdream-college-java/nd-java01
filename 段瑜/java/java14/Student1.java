package 作业;

import java.util.Scanner;

public class Student1 {
	Scanner input=new Scanner(System.in);
	private String name;
	private int age;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		if(age<15){
			age=18;
			this.age=age;
		}else{
			this.age=age;
		}
	}
	public int getAge(){
		return age;
	}
	public void show(){
		System.out.println("姓名：");
		setName(input.next());
		System.out.println("年龄：");
		setAge(input.nextInt());
		System.out.println("自我介绍");
		System.out.println("我叫："+name+"，年龄是："+age);
	}
}
