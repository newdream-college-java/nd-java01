package ��ҵ;

import java.io.Console;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args){
		LinkedList al=new LinkedList();
		al.add(new List("ŷŷ","Q��"));
		al.add(new List("����","Q��"));
		al.add(new List("�Ʒ�","Q��"));
		al.add(new List("����","Q��"));
		System.out.println("������4ֻ��졣");
		System.out.println("�ֱ��ǣ�");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		al.remove(new List("ŷŷ","Q��"));
		al.remove(new List("����","Q��"));
		System.out.println();
		System.out.println("ɾ��֮����2ֻ��졣");
		System.out.println("�ֱ��ǣ�");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		Map map=new LinkedHashMap();
		Set set=map.keySet();
		map.put(new List("ŷŷ", "ѩ����"), set);
		System.out.println();
		System.out.println("Map�д����ƶ�������Ϣ���£�");
		for (Object key :set) {
			System.out.println(key);
		}
		System.out.println();
		map.put(new List("����","Q��"),set);
		map.put(new List("�Ʒ�","Q��"), set);
		map.put(new List("ŷŷ","Q��"), set);
		map.put(new List("����","Q��"), set);
		Iterator it=set.iterator();
		System.out.println("Interator�������������ǳƺ�Ʒ�ֱַ��ǣ�");
		while(it.hasNext()) {
			System.out.println(it.next());
		}		
		System.out.println("ʹ��Foreach�����������������ǳƺ�Ʒ�ֱַ��ǣ�");
		for (Object key :set) {
			System.out.println(key);
		}
	}
}
