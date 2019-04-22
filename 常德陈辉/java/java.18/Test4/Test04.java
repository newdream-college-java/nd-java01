package Test4;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Test04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=Logger.getLogger(Test04.class);
		Scanner input=new Scanner(System.in);
		int a=1,b=2;
		try{
			System.out.print("请输入被除数：");
			a=input.nextInt();
			System.out.print("请输入除数：");
			b=input.nextInt();
			System.out.println(a/b);
			log.info("a/b="+a/b);
		}catch(InputMismatchException e){//如果不为输入整数
			
			log.error("被除数和除数必须是整数。");
		}catch(ArithmeticException e){//如果除数为0
			
			log.error("除数不能为零。");
		}
	}

}
