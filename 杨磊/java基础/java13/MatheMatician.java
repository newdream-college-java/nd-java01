package com.newderam.yl;

import java.util.Scanner;

public class MatheMatician {

	public void math(){//程序开启者
		Scanner input = new Scanner(System.in);
		System.out.print("a.求最大值 b.求个位是几的方法 c.求整数立方 d.求阶+ \n请选择功能：");
		String a = input.next();
		switch(a){
			case "a":
				System.out.println("请输入第一个整数");
				int l = input.nextInt();
				System.out.println("请输入第二个整数:");
				int m = input.nextInt();
				System.out.println(l+"和"+m+"的最大值为："+max(l,m));
				break;
			case "b":
				System.out.println("请输入一个整数：");
				int k = input.nextInt();
				System.out.println(k+"的个位数为："+ge(k));
				break;
			case "c":
				System.out.println("请输入一个整数：");
				int e = input.nextInt();
				System.out.println(e+"的立方为："+lifang(e));
				break;
			case "d":
				System.out.println("请输入一个数：");
				int r = input.nextInt();
				System.out.println(r+"的阶+为："+jie(r));
			default:
				System.out.println("输入错误，程序结束！");
				System.exit(0);
		}
	}
	
	public int max(int a,int b){//求最大值
		if(a<b){
			int temp = a;
			a = b;
			b = temp;
		}
		return a;
	}
	
	
	
	public int ge(int a){//求个位数
		int uu = a%10;
		return uu;
	}
	
	
	
	public int lifang(int a){//求立方
		int li = a*a*a;
		return li;
	}
	
	
	public int jie(int a){
		int jie=0;
		for( int j=1;j<=a;j++){
			jie+=j;
		}
		
		return jie;
	}
}
