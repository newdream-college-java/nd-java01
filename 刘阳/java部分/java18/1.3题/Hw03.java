import java.util.Scanner;

import org.apache.log4j.Logger;


public class Hw03 {
	static Logger log=Logger.getLogger(Hw03.class);
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		//提示输入被除数和除数
		try{
			System.out.print("请输入被除数：");
			int a=input.nextInt();
			System.out.print("请输入除数：");
			int b=input.nextInt();
			System.out.println(a/b);
		}catch(Exception e){
			e.printStackTrace();
			log.error("出现异常");
		}finally{
			System.out.println("感谢使用本程序！");
		}
	}

}
