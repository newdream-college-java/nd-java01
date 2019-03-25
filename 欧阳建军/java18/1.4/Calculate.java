package 第18章异常作业1_4;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.log4j.*;

import 第18章异常作业1_3.检测log4j配置成功;
public class Calculate {	
	static Logger log =Logger.getLogger(Calculate.class);
	public static void main(String[] args) {
	
		Scanner input =new Scanner(System.in);
		int x=5;
		int y=5;
		long s=0;
		try{	
			System.out.println("请输入被除数");
			x=input.nextInt();
			System.out.println("请输入除数");
			y=input.nextInt();
			s=x/y;
		}catch(InputMismatchException e){
			log.error("被除数和除数都要为整数");
		}catch(ArithmeticException e){
			log.warn("除数不能为0");
		}catch(Exception e){
			log.warn(e.getMessage());
		}
		log.info("x/y="+x/y);
	}
}
