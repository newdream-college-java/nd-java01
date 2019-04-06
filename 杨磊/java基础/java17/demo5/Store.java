package com.nd.yl.demo5;

public class Store {
	public static Animal get(int i) {
		if (i == 1) {
			return new Dog();
		} else if (i == 2) {
			return new Cat();
		} else if (i == 3) {
			return new Pig();
		} else {
			return null;
		}

	}
}
