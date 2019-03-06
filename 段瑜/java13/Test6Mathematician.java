package 作业;

import java.util.Scanner;

public class Test6Mathematician {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Mathematician a=new Mathematician();
		System.out.println("输出两个整数：");
		a.show(input.nextInt(), input.nextInt());
		System.out.println("输出一个整数：");
		a.show1(input.nextInt());
		System.out.println("输出一个整数：");
		a.show2(input.nextInt());
		System.out.println("输出一个整数：");
		a.show3(input.nextInt());
			
		
	}

}
