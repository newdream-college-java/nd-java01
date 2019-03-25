package 第18章异常作业1_3;
import java.util.Scanner;

import org.apache.log4j.Logger;
public class Test {
	static Logger log =Logger.getLogger(Test.class);
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("输入被除数");
		int x=input.nextInt();
		System.out.println("输入除数");
		int y=input.nextInt();
		long z;
		try{
			z=x/y;
		}catch(Exception e){
			System.err.println(e.getMessage());		//普通打印方式
			log.warn(e.getMessage());				//输出异常类型到log4j文件中去
			log.warn(e.getStackTrace());			//输出完整的堆栈信息到log4j日志文件中
		}finally{
			System.out.println("谢谢使用");
		}
	}
}
