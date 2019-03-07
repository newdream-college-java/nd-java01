package zuoye;

import java.util.Scanner;

public class Zy5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zylei5 a=new Zylei5();
		Scanner input=new Scanner(System.in);
		System.out.print("请输入行高");
		int a1=input.nextInt();
		System.out.print("请输入符号");
		String a2=input.next();
		a.a(a1, a2);
	}

}
