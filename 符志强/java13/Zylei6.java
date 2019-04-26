package zuoye;


import java.util.Scanner;

public class Zylei6 {
Scanner input=new Scanner(System.in);
	public void max(int a,int b) {
		
		if (a>b) {
			System.out.println(a+"为最大值");
		}
		if (b>a) {
			System.out.println(b+"为最大值");
		}
		if(a==b){
			System.out.println(a+"和"+b+"相等");
		}
	}
	public void gewei(int s) {
		int g;
		g=s%10;
		System.out.println("个位为："+g);
	}
	public void lifang() {
		System.out.println("请输入一个整数");
		int z=input.nextInt();
		z=z*z*z;
		System.out.println("立方为："+z);
	}
	public void he() {
		System.out.println("请输入一个整数");
		int h=input.nextInt();
		int zh=0;
		for (int i = 1; i <= h; i++) {
			zh+=i;
		}
		
		System.out.println("和为："+zh);
	}
}
