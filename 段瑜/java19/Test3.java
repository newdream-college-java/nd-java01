package ��ҵ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
	public static void main(String[] args){
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("���", 96);
		map.put("���1", 96);
		map.put("���3", 96);
		System.out.println(map.values());
		System.out.println("-----------------");
		map.put("���",99);
		System.out.println(map.values());
		
	}
}
