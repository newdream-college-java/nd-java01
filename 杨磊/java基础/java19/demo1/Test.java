package com.nd.yl.demo1;

import java.util.ArrayList;

public abstract class Test {

	public static void main(String[] args) {

		ArrayList<Penguin> a = new ArrayList<Penguin>(4);
		a.add(new Penguin("ŷŷ", "Q��"));
		a.add(new Penguin("����", "Q��"));
		a.add(new Penguin("�Ʒ�", "Q��"));
		a.add(new Penguin("����", "Q��"));

		a.remove(2);
		a.remove(2);

		System.out.println(a.contains(new Penguin("����", "Q��")));
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

	}

}
