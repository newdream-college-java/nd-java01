package ��ҵ;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Sort a=new Sort();
		System.out.print("�������иߣ�");
		a.px=input.nextInt();
		System.out.print("��������Ҫ��ӡ���ַ���");
		a.c=input.next();
		for (int i = 1; i<=a.px ; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(a.c);
			}
			System.out.println();
		}
	}
}
