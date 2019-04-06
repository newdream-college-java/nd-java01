package com.nd.yl.demo3;

public class Test {

	public static void main(String[] args) {
		new Test().test();

	}

	private void test() {
		try {
			System.out.println("try");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch1");
		} catch (Exception e) {
			System.out.println("catch2");
		} finally {
			System.out.println("finally");
		}

	}

}
