package com.java.java18;
public class Z8 {
	public static void foo (int i) {
		try {
			if(i==1){
				throw new Exception();
			}
			System.out.println("1");
		} catch (Exception e) {
			System.out.println("2");
		}finally{
			System.out.println("3");
		}
		System.out.println("4");
		
	}
	public static void main(String[] args) {
		foo(1);
	}
}
