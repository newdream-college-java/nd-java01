package ��13����ҵ;

import java.util.Scanner;

public class RateTest {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Rate r =new Rate();
		System.out.print("��������Ĵ����ܽ��");
		int money=input.nextInt();
		r.allRate(money);
		System.out.println(r.show());
	}
}
