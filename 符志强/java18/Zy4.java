package 作业;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Zy4 {
	public static void main(String[] args) {
		Logger log=Logger.getLogger(Zy4.class);
		Scanner input=new Scanner(System.in);
		
		try {
			System.out.println("请输入一个整数");
			int b=input.nextInt();
			System.out.println("请输入一个除数");
			int c=input.nextInt();
			System.out.println(String.format("%d / %d = %d", b, c, b / c));
		}catch(InputMismatchException e) {
        	log.error("输入不匹配题");
        } catch(ArithmeticException e) {
			log.warn("除数不能为0");         
        }catch(Exception e) {
        	log.error(" 其他类型的异常");
        }finally {
            System.out.println("感谢使用本程序");
        }
	}
}
