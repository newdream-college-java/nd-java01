package com.java.java17.Z5;

public class Test implements Utility {
	public static void main(String[] args) {
		Constans con=new Constans();
		System.out.println(con.MAX);
		int i=50;
		if(i>con.MAX){
			con.MAX-=i;
		}
		
	}
}
