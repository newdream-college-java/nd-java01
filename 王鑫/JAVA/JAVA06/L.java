// 循环输入大于0的数字进行累加，知道输入0结束，并输出。

import java.util.Scanner;
public class L{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for(;;){
			int n = input.nextInt();
			if(n!=0){
				sum+=n;
			}else{
				break;
			}
		}
		System.out.println(sum);
	}
} 
