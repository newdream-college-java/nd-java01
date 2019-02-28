package Test2019_2_28;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("请输入第本月的消费记录");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0; 
		for (int i = 0; i < arr.length; i++) {
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			sum+=arr[i]=input.nextInt();
		}
		System.out.println("\n\n序号\t\t金额");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(1+i+"\t\t"+arr[i]);
		}
		System.out.println("总金额\t\t"+sum);
	}
}
