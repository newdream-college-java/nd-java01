package com.song;

import java.util.Scanner;

public class LeapYear {
		public void isLeapYear() {
			Scanner input=new Scanner(System.in);
			System.out.print("������һ�����:");
			int year=input.nextInt();
			if((year%4==0&&year%100!=0)||year%400==0) {
				System.out.println(year+"������");
			}else {
				System.out.println(year+"��������");
			}
		}
}
