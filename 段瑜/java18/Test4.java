package 作业;


import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;



public class Test4 {
	static Logger log =Logger.getLogger(Test4.class);
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		try{
			System.out.println("请输入被除数");
			int a=input.nextInt();
			System.out.println("请输入除数");
			int b=input.nextInt();
			System.out.println(a/b);
		}catch(InputMismatchException e){
			System.out.println("请输入整数");
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");	
		}catch (Exception e) {
			e.printStackTrace();
			log.debug("出现异常");
		}finally{
			System.out.println("感谢使用本程序");
		}
	}
}
