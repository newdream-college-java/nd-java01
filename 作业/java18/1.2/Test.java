package 第18章异常作业1_2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String name;
		String sex;
		int age;
		Person p=new Person();
		System.out.println("请输入名字");
		name=input.next();
		System.out.println("请输入性别");
		sex=input.next();
		try{
			p.setSex(sex);
		}catch(Exception eSex){
			//System.out.println(e.getMessage());
			System.err.println(eSex.getMessage());
		}
		
		System.out.println("请输入年龄");
		age=input.nextInt();
		try{
			p.setAge(age);
		}catch(Exception eAge){
			System.err.println(eAge.getMessage());
		}
		p.setName(name);
		if(p.getAge()!=0&&p.getName()!=null&&p.getSex()!=null){
			p.showinfo();
		}
		
	}
}	
