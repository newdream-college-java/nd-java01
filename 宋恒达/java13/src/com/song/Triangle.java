package com.song;

import java.util.Scanner;
/**
 * ����ָ����ͬ���к��ַ������ɲ�ͬ������
 * @author mo
 *
 */
public class Triangle {

	/**
	 * ��������
	 */
	public void operation() {
		Scanner input=new Scanner(System.in);
		System.out.print("�������и�:");
		int row=input.nextInt();
		System.out.print("�������ӡ���ַ�:");
		String ch=input.next();
		printTriangle(row, ch);
	}
	/**
	 * ����������
	 * @param row �и�
	 * @param ch	��������ε��ַ�
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
