package ��ҵ;

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
			System.out.println(name+"��"+sex+","+age+"�꣩");	
			
		
	}
	public void set(){		 
			 System.out.println("������������");
			 name=input.next();
			 try {
				 System.out.println("�������Ա�");
					sex=input.next();
					throw new InputMismatchException("�Ա����Ϊ �� �� Ů��");		
			} catch (Exception e) {
				System.out.println(e.getMessage()+"�������11");
				e.printStackTrace();
				return;
			}
	}
	public void set1(){
			try {
				 System.out.println("���������䣺");
				 age=input.nextInt();
				 if (age>=1&&age<=100) {
					 throw new InputMismatchException("���������1��100֮�䣡");	
				 }
			} catch (Exception e) {
				System.err.println(e.getMessage()+"�������");
				e.printStackTrace();
				return;
			}
	}
}
