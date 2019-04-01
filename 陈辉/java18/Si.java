package java18;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Si {
	static Logger log =Logger.getLogger(Si.class);
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a;
		int b;
		try {
			System.out.println("请输入被除数");
			a=input.nextInt();
			System.out.println("请输入除数");
			b=input.nextInt();
			System.out.println(a/b);
		} catch (InputMismatchException e) {
			log.error("被除数和除数必须是整数");		

		}catch (ArithmeticException e) {
			log.debug("除数不能为零");	
		}catch (Exception e) {
			log.debug("其他异常");	
		}finally{
			System.out.println("感谢使用本程序");
		}

	}
}
