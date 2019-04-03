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
			System.out.println("机器出拳:石头");
			break;
		case 2:
			System.out.println("机器出拳:剪刀");
			break;
		case 3:
			System.out.println("机器出拳:布");
			break;
		default:
			break;
		}
		return choice;
	}
}
