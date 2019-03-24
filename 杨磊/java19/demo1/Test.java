package com.nd.yl.demo1;

import java.util.ArrayList;

public abstract class Test {

	public static void main(String[] args) {

		ArrayList<Penguin> a = new ArrayList<Penguin>(4);
		a.add(new Penguin("欧欧", "Q仔"));
		a.add(new Penguin("亚亚", "Q妹"));
		a.add(new Penguin("菲菲", "Q妹"));
		a.add(new Penguin("美美", "Q妹"));

		a.remove(2);
		a.remove(2);

		System.out.println(a.contains(new Penguin("美美", "Q妹")));
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

	}

}
