package com.song;

import java.util.Scanner;

/**
 * дһ����ѧ�ҵ��࣬�����д������ķ������£� a)�����������������бȽϣ������������е����ֵ�ķ��� b)����һ��������������������ĸ�λ���Ǽ��ķ���
 * c)����һ��������������������������ķ��� d)����һ���������������1�ӵ��������ĺ��Ƕ��ٵķ�����
 * ��������һ��5��ô�ͼ���1+2+3+4+5=15����󷵻�15
 * 
 * @author mo
 *
 */
public class Mathematician {
	/**
	 * ��������
	 */
	public void operation() {
		Scanner input=new Scanner(System.in);
		System.out.println("��������������:");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println("������"+a+"��"+b+"�����ֵΪ"+getMax(a,b));
		System.out.print("������һ������:");
		int c=input.nextInt();
		System.out.println(c+"�ĸ�λ��Ϊ"+singleDegit(c));
		System.out.print("������һ������:");
		int d=input.nextInt();
		System.out.println(d+"����������"+getCube(d));
		System.out.println("1+2+3+...+"+d+"="+getSum(d));
	}
	/**
	 * �����������������бȽϣ������������е����ֵ�ķ���
	 */
	public int getMax(int a, int b) {
		int max = a;
		if (b > a) {
			max = b;
		}
		return max;
	}

	/**
	 * ����һ��������������������ĸ�λ���Ǽ��ķ���
	 */
	public int singleDegit(int a) {
		return a % 10;
	}

	/**
	 * ����һ��������������������������ķ���
	 */
	public int getCube(int a) {
		return a * a * a;
	}

	/**
	 * ����һ���������������1�ӵ��������ĺ��Ƕ��ٵķ����� ��������һ��5��ô�ͼ���1+2+3+4+5=15����󷵻�15
	 */
	public int getSum(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
}
