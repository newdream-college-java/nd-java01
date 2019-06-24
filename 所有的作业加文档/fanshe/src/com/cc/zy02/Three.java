package com.cc.zy02;

import java.util.Hashtable;

public class Three {
	public static void main(String[] args) {
		Class c1 = Hashtable.class;// 延时加载
		Class[] cs = c1.getInterfaces();// 获取接口
		while (c1 != null) {
			System.out.println("父类" + c1.getName());
			c1 = c1.getSuperclass();
			for (int i = 0; i < cs.length; i++) {
				System.out.println("接口：" + cs[i].getName());
			}
			if (c1 != null) {
				cs = c1.getInterfaces();
			}
		}
	}
}
