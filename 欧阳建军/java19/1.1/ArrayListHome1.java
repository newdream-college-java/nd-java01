package ��20�¼�����ҵ;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ArrayListHome1 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(0,new Penguin("ŷŷ", "Q��"));
		a1.add(1,new Penguin("����", "Q��"));
		a1.add(2,new Penguin("�Ʒ�", "Q��"));
		a1.add(3,new Penguin("����", "Q��"));
		for(int i=0;i<a1.size();i++){
			System.out.println(a1.get(i));
		}
		a1.remove(new Penguin("�Ʒ�", "Q��"));
		a1.remove(new Penguin("����", "Q��"));
		System.out.println("===========================");
		for(int i=0;i<a1.size();i++){
			System.out.println(a1.get(i));
		}
		System.out.println("=========HashMap=============");
		HashMap map=new HashMap();
		map.put(new Penguin("ŷŷ", "���"),new Penguin("ŷŷ", "ѩ����"));
		map.put(new Penguin("ŷŷ","sex"),"ѩ����");
		//set��������ĵ�˳��������ģ���Ψһ���棺set.add(2);set.add(2);����ֻ�ܱ���һ��2
		Set set=map.keySet();
		System.out.println("=========��ǿfor���hasMap=============");
		for(Object key:set){
			System.out.println(key+"\t"+map.get(key));
		}
		System.out.println("=========Iterator============");
		Set setIt=new HashSet();
		setIt.add(new Penguin("����","Q��"));
		setIt.add(new Penguin("�Ʒ�","Q��"));
		setIt.add(new Penguin("ŷŷ","Q��"));
		setIt.add(new Penguin("����","Q��"));
		Iterator it =setIt.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}


}
