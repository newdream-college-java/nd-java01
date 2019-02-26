// 简约计算器

import java.util.Scanner;

public class F{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		String str = input.next();
		double b = input.nextDouble();
		if(str.equals("+")){
			System.out.println(a+"+"+b+"="+(a+b));
		}else if(str.equals("-")){
			System.out.println(a+"-"+b+"="+(a-b));
		}else if(str.equals("*")){
			System.out.println(a+"*"+b+"="+(a*b));
		}else if(str.equals("/")){
			System.out.println(a+"/"+b+"="+(a/b));
		}else System.out.println("输入有误！！！");
	}
}