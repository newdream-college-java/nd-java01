package zuoye;

import java.util.Scanner;

public class TestMonthly {
	public static void main(String[] args) {
		Monthly monthly=new Monthly();
		Scanner input=new Scanner(System.in);
		System.out.println("��������Ҫ����Ľ�");
		int jine=input.nextInt();
		System.out.println("��������������ִ�е����ʣ�");
		double rate=input.nextDouble();
		System.out.println("���������Ĵ������ޣ�");
		int year=input.nextInt();
		monthly.zlx(jine, rate,year);
	}
}
