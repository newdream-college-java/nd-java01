package 第20章集合作业;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ArrayListHome1 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(0,new Penguin("欧欧", "Q仔"));
		a1.add(1,new Penguin("亚亚", "Q仔"));
		a1.add(2,new Penguin("菲菲", "Q妹"));
		a1.add(3,new Penguin("美美", "Q妹"));
		for(int i=0;i<a1.size();i++){
			System.out.println(a1.get(i));
		}
		a1.remove(new Penguin("菲菲", "Q妹"));
		a1.remove(new Penguin("美美", "Q妹"));
		System.out.println("===========================");
		for(int i=0;i<a1.size();i++){
			System.out.println(a1.get(i));
		}
		System.out.println("=========HashMap=============");
		HashMap map=new HashMap();
		map.put(new Penguin("欧欧", "企鹅"),new Penguin("欧欧", "雪娜瑞"));
		map.put(new Penguin("欧欧","sex"),"雪娜瑞");
		//set集合输出的的顺序是无序的，且唯一储存：set.add(2);set.add(2);里面只能保存一个2
		Set set=map.keySet();
		System.out.println("=========增强for输出hasMap=============");
		for(Object key:set){
			System.out.println(key+"\t"+map.get(key));
		}
		System.out.println("=========Iterator============");
		Set setIt=new HashSet();
		setIt.add(new Penguin("亚亚","Q妹"));
		setIt.add(new Penguin("菲菲","Q妹"));
		setIt.add(new Penguin("欧欧","Q仔"));
		setIt.add(new Penguin("美美","Q妹"));
		Iterator it =setIt.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}


}
