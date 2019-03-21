package 第18章异常作业1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
	public static void choice()throws Exception{
		Scanner input =new Scanner(System.in);
		System.out.println("请输入1-3中的一个数字");
		int choice=input.nextInt();
		if(choice>3||choice<1){
			throw new Exception("输入范围有误");//括号里写自定义异常的名称，在被调用的时候使用e.getMessage()获得自义定异常的名称
		}
		if(choice==1){
			System.out.println("C#编程");
		}else if(choice==2){
			System.out.println("SQL基础");
		}else if(choice==3){
			System.out.println("JAVA编程");
		}
	}
	public static void main(String[] args) {
		try{
			choice();	//捕获了自定义异常
		}catch(InputMismatchException e){
			System.out.println("输入类型不匹配");
		}catch(Exception e){	
			System.out.println(e.getMessage());	//调用者拿到自定义的异常信息
		}
	finally{
			System.out.println("欢迎提出建议");
		}
		
	}
}



