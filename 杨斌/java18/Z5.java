package com.java.java18.Z5;

public class Z5 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组下标越界");
		}

	}

}
