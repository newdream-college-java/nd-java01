package com.cc.zy02;

import java.util.Hashtable;

public class Three {
	public static void main(String[] args) {
		Class c1 = Hashtable.class;// ��ʱ����
		Class[] cs = c1.getInterfaces();// ��ȡ�ӿ�
		while (c1 != null) {
			System.out.println("����" + c1.getName());
			c1 = c1.getSuperclass();
			for (int i = 0; i < cs.length; i++) {
				System.out.println("�ӿڣ�" + cs[i].getName());
			}
			if (c1 != null) {
				cs = c1.getInterfaces();
			}
		}
	}
}
