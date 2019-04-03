package exercise3;

import java.util.Scanner;

import org.apache.log4j.Logger;
/**
 * 使用try-catch-finally完成log4j输出日志到控制台，需求说明按照
 * 控制台提示输入被除数和除数，如果除数为0，在控制台输出错误信息，包括完成的异常堆栈信息
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Logger logger=Logger.getLogger(Test.class);
		System.out.print("请输入被除数:");
		int a=input.nextInt();
		System.out.print("请输入除数:");
		int b=input.nextInt();
		try {
			int c=a/b;
		}catch(ArithmeticException e) {
			logger.error("系统出错",e);
		}catch(Exception e) {
			
		}finally {
			System.out.println("感谢使用此程序");
		}
	}
}
