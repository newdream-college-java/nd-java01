package com.java.java19;
import java.util.HashMap;
public class Z3 {
	public static void main(String[] args) {
		HashMap <String,Integer> map=new HashMap <String,Integer>();
		map.put("³Â»Ô", 60);
		map.put("³Â»Ô2",70);
		map.put("³Â»Ô3",80);
		map.put("³Â»Ô4",90);
		System.out.println(map.values());		
		System.out.println("---------------");
		map.put("³Â»Ô4", 99);
		System.out.println(map.values());
		

		
		
		
	}
}
