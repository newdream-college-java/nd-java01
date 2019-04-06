package com.nd.yl.demo4;

//¾À´íÌâ1
//public interface Utility {
//
//}
//
//class Phone implements Utility {
//	void use() {
//		System.out.println("using phone");
//	}
//}
//
//public class Test {
//
//	public static void main(String[] args) {
//		Utility util = new Phone();
//		util.use();
//
//	}
//
// }

//¾À´íÌâ2
public class Test implements Constans {
	public static void main(String[] args) {
		Constans con = new Test();
		System.out.println(con.MAX);
		int i = 50;
		if (i > Constans.MAX) {
			System.out.println(Constans.MAX);
		}

	}
}
