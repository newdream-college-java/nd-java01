package 第18章异常作业1_6;

import java.util.Scanner;

import org.apache.log4j.Logger;

import 第18章异常作业1_3.Test;
public class OutOfBounds {
	static Logger log =Logger.getLogger(OutOfBounds.class);
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int[] arr=new int[3];
		try{
			for(int i=0;i<=arr.length;i++){
				System.out.println("请输入第"+(i+1)+"个整数");
				arr[i]=input.nextInt();
		}
		}catch(ArrayIndexOutOfBoundsException e){
			log.warn("数组越界异常");
			log.warn(e.getStackTrace());
		}
	}
}
