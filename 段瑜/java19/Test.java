package 作业;

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
		al.add(new List("欧欧","Q仔"));
		al.add(new List("亚亚","Q妹"));
		al.add(new List("菲菲","Q妹"));
		al.add(new List("美美","Q妹"));
		System.out.println("共计有4只企鹅。");
		System.out.println("分别是：");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		al.remove(new List("欧欧","Q仔"));
		al.remove(new List("亚亚","Q妹"));
		System.out.println();
		System.out.println("删除之后还有2只企鹅。");
		System.out.println("分别是：");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		Map map=new LinkedHashMap();
		Set set=map.keySet();
		map.put(new List("欧欧", "雪纳瑞"), set);
		System.out.println();
		System.out.println("Map中存在制定对象，信息如下：");
		for (Object key :set) {
			System.out.println(key);
		}
		System.out.println();
		map.put(new List("亚亚","Q妹"),set);
		map.put(new List("菲菲","Q妹"), set);
		map.put(new List("欧欧","Q仔"), set);
		map.put(new List("美美","Q妹"), set);
		Iterator it=set.iterator();
		System.out.println("Interator遍历，所有且昵称和品种分别是：");
		while(it.hasNext()) {
			System.out.println(it.next());
		}		
		System.out.println("使用Foreach语句遍历，所有企鹅的昵称和品种分别是：");
		for (Object key :set) {
			System.out.println(key);
		}
	}
}
