package 第18章异常作业1_5;

import java.util.Scanner;

public class OutOfBounds {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int[] arr=new int[3];
		try{
			for(int i=0;i<=arr.length;i++){
				System.out.println("请输入第"+(i+1)+"个整数");
				arr[i]=input.nextInt();
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界异常");
			System.out.println(e.getStackTrace());
		}
	}
}
