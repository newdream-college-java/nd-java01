package com.nd.zuoye.yl;

public class Sample {
//	public int getSomething(int d){
//		return d;
//	}
	//private int getSomething(int i,String s){}
	//public void getSomething(int i){}
	//@SuppressWarnings("unused")
//	private int getSomething(int i,String s){
//		return 20;
//	}
	//public double getSomething(){
	//	return "abc";
	//}
	
	
	
	public double result(double d1,double d2){
		return d1<d2?d1:d2;
	}
	public double result(int d1,double d2){
		return d1>d2?d1:d2;
	}
	public int result(int d1,int d2){
		return d1-d2;
	}
	private int result(int i){
		return i;
	}
	
	
	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println(s.result(2, 3.0));
		System.out.println(s.result(4.0, 4.5));
		System.out.println(s.result(10, 9));
	}
}
