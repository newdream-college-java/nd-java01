package com.nd.zuoye.yl.san;

public class Test {

	public static void main(String[] args) {
		Printer p = new DotMatrixPrinter();
		p.print();
		p = new InkperPrinter();
		p.print();
		p = new LaserPrinter();
		p.print();
	}

}
