package com.nd.zuoye.yl;

import java.util.Scanner;

public class TeacherTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Teacher a = new Teacher("eee",25);
		a.print();
		System.out.println("请选择你的技术方向：1.JAVA 2.TEST 3.ANDRIOD");
		String zhuan = null;
		switch(input.nextInt()){
			case 1:
				zhuan = Teacher.JAVA;
				break;
			case 2:
				zhuan = Teacher.Test;
				break;
			case 3:
				zhuan = Teacher.ANDROID;
				break;
		}
		
		Teacher b = new Teacher("ee","男",24,zhuan);
		b.print();

	}

}
