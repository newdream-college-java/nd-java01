package ×÷Òµ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
	public static void main(String[] args){
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("Ñî±ó", 96);
		map.put("Ñî±ó1", 96);
		map.put("Ñî±ó3", 96);
		System.out.println(map.values());
		System.out.println("-----------------");
		map.put("Ñî±ó",99);
		System.out.println(map.values());
		
	}
}
