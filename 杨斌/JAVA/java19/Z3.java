package com.java.java19;
import java.util.HashMap;
public class Z3 {
	public static void main(String[] args) {
		HashMap <String,Integer> map=new HashMap <String,Integer>();
		map.put("�»�", 60);
		map.put("�»�2",70);
		map.put("�»�3",80);
		map.put("�»�4",90);
		System.out.println(map.values());		
		System.out.println("---------------");
		map.put("�»�4", 99);
		System.out.println(map.values());
		

		
		
		
	}
}
