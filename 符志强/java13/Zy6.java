package zuoye;

import java.util.Scanner;

public class Zy6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Zylei6 aa=new Zylei6();
		System.out.println("������һ����");
		int a=input.nextInt();
		System.out.println("������һ����");
		int b=input.nextInt();
		aa.max(a, b);
		Zylei6 bb=new Zylei6();
		System.out.println("������һ����");
		int s=input.nextInt();
		bb.gewei(s);
		Zylei6 cc=new Zylei6();
		cc.lifang();
		Zylei6 dd=new Zylei6();
		dd.he();
	}

}
