package ×÷Òµ;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("Ñî±ó", 96);
		map.put("Ñî±ó1", 96);
		map.put("Ñî±ó3", 96);
		Collection values=map.values();
		Iterator it=values.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
