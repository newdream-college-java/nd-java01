package 作业;

import java.util.Scanner;
import org.apache.log4j.Logger;


public class Test6 {
	static Logger log =Logger.getLogger(Test6.class);
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr=new int[5];
		int b;
		try{
			
			for(int i=0;i<=arr.length;i++){
				System.out.println("请输入第"+i);
				b=input.nextInt();
				arr[i]=b;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			log.debug("信息异常");
		}
	}	
}
