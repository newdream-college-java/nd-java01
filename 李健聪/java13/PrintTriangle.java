package ��ʮ������ҵ;

import java.util.Scanner;

public class PrintTriangle {
	public PrintTriangle(int row,String ch){
		Scanner input=new Scanner(System.in);
		
		System.out.println("�������иߣ�"+row);
		System.out.println("�������ӡ���ַ���"+ch);
	
		for(int i=1;i<=row;i++){
			for(int j=0;j<i;j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
