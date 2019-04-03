package com.song;

import java.util.Scanner;
/**
 * 根据指定不同的行和字符，生成不同三角形
 * @author mo
 *
 */
public class Triangle {

	/**
	 * 操作流程
	 */
	public void operation() {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入行高:");
		int row=input.nextInt();
		System.out.print("请输入打印的字符:");
		String ch=input.next();
		printTriangle(row, ch);
	}
	/**
	 * 生成三角形
	 * @param row 行高
	 * @param ch	组成三角形的字符
	 */
	public void printTriangle(int row,String ch) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
