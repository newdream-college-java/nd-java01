package 作业;

import java.util.Scanner;

public class Test5 {
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
			System.out.println(e);
		}
	}
}
