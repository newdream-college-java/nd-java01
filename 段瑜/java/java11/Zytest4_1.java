package Zy;

import java.util.Scanner;

public class Zytest4_1 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Zytest4 a=new Zytest4();
		System.out.println("请输入一个值");
		a.num1=input.nextInt();
		a.m=input.next();
		System.out.println("请输入一个值");
		a.num2=input.nextInt();
		if(a.m.equals("+")){
			a.add();
		}else if(a.m.equals("-")){
			a.minus();
		}else if(a.m.equals("*")){
			a.multiple();
		}else if(a.m.equals("/")){
			a.divide();
		}
	}
}
