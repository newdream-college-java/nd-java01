import java.util.Scanner;
public class Calculator {
	double num1,num2;
	String s;
	public void show(){
		Scanner input=new Scanner(System.in);
		System.out.print("输入数字");
		num1=input.nextInt();
		System.out.print("输入运算符");
		s=input.next();
		System.out.print("输入数字");
		num2=input.nextInt();
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
		System.out.print(num1+num2);
	}
	public void minus(){
		System.out.print(num1-num2);
	}
	public void multiple(){
		System.out.print(num1*num2);
	}
	public void divide(){
		 System.out.print(num1*1.0/num2);
	}
}
