package ��ҵ.Test2;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Person p=new Person();
		System.out.print("������������");
		p.setName(input.next());
		System.out.println("�������Ա�");
		String sex=input.next();
		try{
			
			p.setSex(sex);
		}catch(Exception eSex){
			System.out.println(eSex.getMessage());
		}
	
		try{
			System.out.print("���������䣺");
			int age=input.nextInt();
			
			p.setAge(age);
		}catch(Exception eage){
			System.out.println(eage.getMessage());
		}finally{
			p.print();
		}
	}
}
