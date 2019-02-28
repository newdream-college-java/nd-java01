package Test2019_2_28;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = 0;
		for (int i = 0; i < 10; i++) {
			int n  = input.nextInt();
			if (n==1||n==2||n==3) {
				t++;
			}
		}
		System.out.println("合法值："+t+"\n非法数字"+(10-t));
	}
}
