package com.nd.zuoye.yl;
public class StaticVarLoadTest {
	
	public static void main(String[] args) {
		System.out.println("StaticVarLoadTest");
		printStaticVar();
	}
	
	private static void printStaticVar() {
		System.out.println(StaticVar.FIANL_VAR);
		System.out.println(StaticVar.VAR);
	}
	
}
