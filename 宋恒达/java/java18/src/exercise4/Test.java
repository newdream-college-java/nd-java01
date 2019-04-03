package exercise4;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(Test.class);
		Scanner input=new Scanner(System.in);
		try {
			System.out.print("请输入被除数:");
			int a=input.nextInt();
			System.out.print("请输入除数:");
			int b=input.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(InputMismatchException e) {
			logger.error("被除数和除数必须是整数");
		}catch(ArithmeticException e) {	
			logger.warn("除数不能为0");
		}catch(Exception e) {
			logger.error("其它异常");
		}finally {
			System.out.println("欢迎使用本系统");
		}
	}
}
