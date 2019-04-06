package com.nd.yl.jiu;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
//		List a = new ArrayList();
//		a.add("A");
//		a.add(2, "B");
//		String s = (String) a.get(1);
//		System.out.println(s);
		Map a = new HashMap();
		String s = "key";
		a.put(s, "hello");
		a.put(s, "world");
		System.out.println(a.size());
	}

}
