package zuoye;


import java.util.Scanner;

public class Zylei6 {
Scanner input=new Scanner(System.in);
	public void max(int a,int b) {
		
		if (a>b) {
			System.out.println(a+"Ϊ���ֵ");
		}
		if (b>a) {
			System.out.println(b+"Ϊ���ֵ");
		}
		if(a==b){
			System.out.println(a+"��"+b+"���");
		}
	}
	public void gewei(int s) {
		int g;
		g=s%10;
		System.out.println("��λΪ��"+g);
	}
	public void lifang() {
		System.out.println("������һ������");
		int z=input.nextInt();
		z=z*z*z;
		System.out.println("����Ϊ��"+z);
	}
	public void he() {
		System.out.println("������һ������");
		int h=input.nextInt();
		int zh=0;
		for (int i = 1; i <= h; i++) {
			zh+=i;
		}
		
		System.out.println("��Ϊ��"+zh);
	}
}
