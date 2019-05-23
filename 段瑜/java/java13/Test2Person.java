package 作业;

import java.util.Scanner;

public class Test2Person {
	String names;
	String sexs;
	int ages;
	public void show1(String name,String sex,int age){
		names=name;
		sexs=sex;
		ages=age;
	}
	
	public void show(){
		System.out.println("————————人员信息————————————");
		System.out.println("姓名："+names+"\n性别："+sexs+"\n年龄："+ages);
	}
}
