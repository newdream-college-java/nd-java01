package com.cc.ho;

import java.util.ArrayList;

public class Test02 {
	public static void main(String[] args) {
		//得到一个类的所有父类
		Class clazz=ArrayList.class;
		//Class clazz=int.class;
		//Class clazz=Integer.TYPE;
		Class[] inClazz=clazz.getInterfaces();
		while(clazz!=null){
			System.out.println("父类"+clazz.getName());
			clazz=clazz.getSuperclass();
			for(int i=0;i<inClazz.length;i++){
				 System.out.println("接口："+inClazz[i].getName());
			}
			if(clazz!=null){
				inClazz=clazz.getInterfaces();
			}
		}
		//包装类和基础类型获取class
		//Class clazz2=int.class;
		//包装类特有的
		//Class clazz3=Integer.TYPE;
	}
}
