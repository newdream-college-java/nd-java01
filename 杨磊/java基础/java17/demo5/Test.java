package com.nd.yl.demo5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Store a = new Store();
		System.out.println("���������Ҫ�ĳ������� 1 Dog 2 Cat 3 Pig");
		int i = input.nextInt();
		Animal w = a.get(i);
		w.shout();
	}
}
