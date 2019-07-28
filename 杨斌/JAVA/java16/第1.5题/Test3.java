package com.java.java16;

public class Test3 {
	public static void main(String[] args) {
		Printer pt=new DotMatrixPrinter();
		pt.print();
		pt=new InkperPrinter();	
		pt.print();
		pt=new LaserPrinter();
		pt.print();
	}
	
}
