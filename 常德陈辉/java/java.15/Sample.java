package com.xiaoche;

public class Sample {
	public static void main(String[] args) {
		Child c=new Child();
	}
}
/**输出结果为：
*Base
*Child
*因为在运行Sample类时，new Child类的对象时，调用了Child的构造方法，而Child构造方法的第一行
*有默认super();的方法，而Child的父类有无参方法，所以会先执行父类的无参方法，在执行自己的方法。
**/