package java18;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

//import org.apache.log4j.Logger;
public class San {
	static Logger log =Logger.getAnonymousLogger();
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		try {
			System.out.println("请输入被除数");
			int a=input.nextInt();
			System.out.println("请输入除数");
			int b=input.nextInt();
			System.out.println(a/b);
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("出现异常");		

		

		}finally{
			System.out.println("感谢使用本程序");
		}

	}
}