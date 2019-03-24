package com.nd.yl.demo5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		a.put("杨过", 39);
		a.put("小笼包", 99);
		a.put("尹志平", 88);
		a.put("裘千仞", 77);
		for (String g : a.keySet()) {
			System.out.println(g + ":" + a.get(g));
		}
		a.put("杨过", 99);
		System.out.println("修改后：");
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
