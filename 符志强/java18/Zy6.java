package 作业;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Zy6 {
	public static void main(String[] args) {
		Logger log=Logger.getLogger(Zy6.class);
		Scanner input=new Scanner(System.in);
		String[] a=new String[5];
		try {			
			for (int i = 0; i <=a.length; i++) {
				System.out.println("请输入数组里的值");
				a[i]=input.next();
			}				
		}catch(ArrayIndexOutOfBoundsException e) {
			log.error("数组越界");
        }catch(Exception e) {
        	log.error(" 其他类型的异常");
        }
	}
}
