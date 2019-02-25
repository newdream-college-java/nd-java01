import java.util.Scanner;
public class D07{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入第一个数");
	double a = input.nextDouble();
	System.out.println("请输入+或者-或者*或者/中某一个运算符");
	String cal=input.next();
	System.out.println("请输入第二个数");
	double b = input.nextDouble();
	if(cal.equals("+")){
		System.out.println(a+"+"+b+"="+(a+b));
	}else if(cal.equals("-")){
		System.out.println(a+"-"+b+"="+(a-b));
	}else if(cal.equals("*")){
		System.out.println(a+"*"+b+"="+(a*b));
	}else if(cal.equals("/")){
		System.out.println(a+"/"+b+"="+(a/b));
	}
	}
}
