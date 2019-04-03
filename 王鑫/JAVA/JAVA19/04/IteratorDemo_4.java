package Test2019_3_18_z19;

import java.util.HashMap;
import java.util.*;
public class IteratorDemo_4 {
	public static void main(String[] args) {
		HashMap <String,Integer> hm=new HashMap <String,Integer>();
		hm.put("一号", 100);
		hm.put("二号",90);
		hm.put("三号",80);
		Collection<Integer> values1=hm.values();
		Iterator<Integer> it=values1.iterator();
		System.out.print("添加前的值：");
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		hm.put("四号", 70);
		values1=hm.values();
		it=values1.iterator();
		System.out.print("\n添加后的值：");
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
}
