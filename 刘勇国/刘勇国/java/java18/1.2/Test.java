package ��18���쳣��ҵ1_2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String name;
		String sex;
		int age;
		Person p=new Person();
		System.out.println("����������");
		name=input.next();
		System.out.println("�������Ա�");
		sex=input.next();
		try{
			p.setSex(sex);
		}catch(Exception eSex){
			//System.out.println(e.getMessage());
			System.err.println(eSex.getMessage());
		}
		
		System.out.println("����������");
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
