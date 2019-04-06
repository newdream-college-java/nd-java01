package com.nd.yl.demo4;

public class QueueTest {

	public static void main(String[] args) {
		Queue a = new Queue();
		a.add("aa");
		a.add("bb");
		a.add("cc");
		for (int i = 0; i < 3; i++) {
			System.out.println(a.get());
		}

	}
}
