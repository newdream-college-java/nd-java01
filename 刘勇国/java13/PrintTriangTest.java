package ��13����ҵ;

import java.util.Scanner;

public class PrintTriangTest {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		PrintTriang p1 = new PrintTriang();
		System.out.print("������Ҫ��ӡ���иߣ�");
		int row =input.nextInt();
		System.out.print("������Ҫ��ӡ���ַ���");
		String ch=input.next();
		if(row>0){
			p1.printTriangke(row,ch);
		}else{
			System.out.println("�����и������˳�����");
		}
	}
}
