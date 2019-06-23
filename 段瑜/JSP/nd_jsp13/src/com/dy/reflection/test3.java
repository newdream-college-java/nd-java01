package com.dy.reflection;

import java.util.HashMap;

public class test3 {
	public static void main(String[] args) {
		Class cl=HashMap.class;
		Class[] incl=cl.getInterfaces();
		while(cl!=null){
			System.out.println("∏∏¿‡"+cl.getName());
			cl=cl.getSuperclass();
			
		}
		Class cla=int.class;
		Class clas=Integer.TYPE;
	}
}
