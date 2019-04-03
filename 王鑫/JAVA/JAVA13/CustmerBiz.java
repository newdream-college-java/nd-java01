package Test2019_3_6_z13;

import java.util.Scanner;

public class CustmerBiz {
	String[] name = new String[20];
	public void insert(){
		Scanner input = new Scanner(System.in);
		int n = 0 ;
		String s;
		do {
			System.out.print("请输入用户的姓名：");
			name[n++]=input.next();
			System.out.print("继续输入吗？(y/n):");
			s = input.next();
		} while (s.equals("y"));
	}	
	public void show() {
		System.out.println("**************************");
		System.out.println("\t客户姓名列表：");
		System.out.println("**************************");
		for (int i = 0; name[i]!=null; i++) {
			System.out.print(name[i]+"\t");
			if ((i+1)%5==0) {
				System.out.println();
			}
		}
	}
}
