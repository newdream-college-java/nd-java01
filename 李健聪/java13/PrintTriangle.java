package 第十三章作业;

import java.util.Scanner;

public class PrintTriangle {
	public PrintTriangle(int row,String ch){
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入行高："+row);
		System.out.println("请输入打印的字符："+ch);
	
		for(int i=1;i<=row;i++){
			for(int j=0;j<i;j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
