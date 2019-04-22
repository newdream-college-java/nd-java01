import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;


public class Testlog2 {

	static Logger log=Logger.getLogger(Testlog2.class);
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		//提示输入被除数和除数
		try{
			System.out.print("请输入被除数（整数）：");
			int a=input.nextInt();
			System.out.print("请输入除数（整数）：");
			int b=input.nextInt();
			System.out.println(a/b);
			log.info("a/b="+(a/b));
		}catch(ArithmeticException e){
			e.printStackTrace();
			log.warn("除数不能为0");
		}catch(InputMismatchException e){
			e.printStackTrace();
			log.error("被除数和除数必须是整数！");
		}catch(Exception e){
			e.printStackTrace();
			log.error("出现了异常");
		}finally{
			System.out.println("感谢使用本程序！");
		}
	}

}
