package com.song;

import java.util.Random;

public class Computer {
	String name;
	int score;

	public int punch() {
		Random rd = new Random();
		int choice = rd.nextInt(3) + 1;
		switch (choice) {
		case 1:
			System.out.println("������ȭ:ʯͷ");
			break;
		case 2:
			System.out.println("������ȭ:����");
			break;
		case 3:
			System.out.println("������ȭ:��");
			break;
		default:
			break;
		}
		return choice;
	}
}
