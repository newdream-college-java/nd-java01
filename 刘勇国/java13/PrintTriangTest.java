package 第13章作业;

import java.util.Scanner;

public class PrintTriangTest {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		PrintTriang p1 = new PrintTriang();
		System.out.print("请输入要打印的行高：");
		int row =input.nextInt();
		System.out.print("请输入要打印的字符：");
		String ch=input.next();
		if(row>0){
			p1.printTriangke(row,ch);
		}else{
			System.out.println("输入行高有误退出程序");
		}
	}
}
