package ��ҵ;

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
		System.out.println("������");
		setName(input.next());
		System.out.println("���䣺");
		setAge(input.nextInt());
		System.out.println("���ҽ���");
		System.out.println("�ҽУ�"+name+"�������ǣ�"+age);
	}
}
