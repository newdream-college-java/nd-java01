package java11;

import java.util.Scanner;
public class Y4 {
	double a,b;
	String s;
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.println("��������");
		a=input.nextInt();
		System.out.println("�������������");
		s=input.next();
		System.out.println("��������");
		b=input.nextInt();
		if(s.equals("+")){
			add();
		}else if(s.equals("-")){
			minus();
		}else if(s.equals("*")){
			multiple();
		}else {
			divide();
		}
	}
	public void add(){
		System.out.print(a+b);
	}
	public void minus(){
		System.out.print(a-b);
	}
	public void multiple(){
		System.out.print(a*b);
	}
	public void divide(){
		 System.out.print(a*1.0/b);
	}
}
