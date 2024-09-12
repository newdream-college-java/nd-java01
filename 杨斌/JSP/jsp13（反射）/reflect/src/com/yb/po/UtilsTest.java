package com.yb.po;

public class UtilsTest {
 public static void main(String[] args) throws Exception {
	 ReflectionUtils ru=new ReflectionUtils();
	 A a=new A();
	 //System.out.println(ru.show(a, "a"));
	 Class[] getname={int.class,String.class};
	 ru.showB(a,"showA", getname);
}
}
