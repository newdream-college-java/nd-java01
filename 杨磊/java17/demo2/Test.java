package com.nd.yl.demo2;

public class Test {

	public static void main(String[] args) {
		OPhone o = new OPhone();
		o.print();
		o.phone();
		o.message();

		System.out.println();
		NPhone n = new NPhone();
		n.print();
		n.mp4();
		n.photo();
		n.music();
		n.message();
		n.phone();
		n.surf();

	}

}
