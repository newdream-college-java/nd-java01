package com.java.java19;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
public class Z4{
	public static void main(String[] args) {
		HashMap <String,Integer> map=new HashMap <String,Integer>();
		map.put("�»�", 60);
		map.put("�»�2",70);
		map.put("�»�3",80);
		map.put("�»�4",90);	
		Collection<Integer> values1=map.values();
		Iterator<Integer> it=values1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("---------------");
		map.put("�»�4", 99);
		values1=map.values();
		it=values1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
	}
}

