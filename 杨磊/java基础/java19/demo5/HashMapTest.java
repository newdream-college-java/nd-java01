package com.nd.yl.demo5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("���", 39);
		a.put("С����", 99);
		a.put("��־ƽ", 88);
		a.put("��ǧ��", 77);
		for (String g : a.keySet()) {
			System.out.println(g + ":" + a.get(g));
		}
		a.put("���", 99);
		System.out.println("�޸ĺ�");
		for (String g : a.keySet()) {
			System.out.println(g + ":" + a.get(g));
		}

		Collection<Integer> values = a.values();

		// iterator
		Iterator<Integer> it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
