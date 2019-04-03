package com.song;

import java.util.Scanner;

/**
 * 写一个数学家的类，类中有带参数的方法如下： a)传入两个整数，进行比较，返回两个数中的最大值的方法 b)传入一个整数，返回这个整数的个位数是几的方法
 * c)传入一个整数，返回这个整数的立方的方法 d)传入一个正整数，计算从1加到此整数的和是多少的方法。
 * 比如输入一个5那么就计算1+2+3+4+5=15，最后返回15
 * 
 * @author mo
 *
 */
public class Mathematician {
	/**
	 * 操作流程
	 */
	public void operation() {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个整数:");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println("两个数"+a+"和"+b+"中最大值为"+getMax(a,b));
		System.out.print("请输入一个整数:");
		int c=input.nextInt();
		System.out.println(c+"的个位数为"+singleDegit(c));
		System.out.print("请输入一个整数:");
		int d=input.nextInt();
		System.out.println(d+"的立方等于"+getCube(d));
		System.out.println("1+2+3+...+"+d+"="+getSum(d));
	}
	/**
	 * 传入两个整数，进行比较，返回两个数中的最大值的方法
	 */
	public int getMax(int a, int b) {
		int max = a;
		if (b > a) {
			max = b;
		}
		return max;
	}

	/**
	 * 传入一个整数，返回这个整数的个位数是几的方法
	 */
	public int singleDegit(int a) {
		return a % 10;
	}

	/**
	 * 传入一个整数，返回这个整数的立方的方法
	 */
	public int getCube(int a) {
		return a * a * a;
	}

	/**
	 * 传入一个正整数，计算从1加到此整数的和是多少的方法。 比如输入一个5那么就计算1+2+3+4+5=15，最后返回15
	 */
	public int getSum(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
}
