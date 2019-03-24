package 第20章集合作业_1_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class Homeworl1_3 {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(new Student("lyg1",100).name, new Student("lyg1",100).score);
		map.put(new Student("lyg2",100).name, new Student("lyg2",100).score);
		
		Set set=new HashSet();
		//map.keySet()是得到map中的所有key值
		//问题 能不能用增强for中使用map.某个方法的形式得到他的key值同时打印出对应的value值？
		set=map.keySet();
		int i=1;
		for(Object s:set){
			System.out.println("第"+i+"名同学的分数为："+map.get(s));
			i++;
		}
		System.out.println("==============修改后===============");
		//问题:这里根据对象修改对象的value也需要重写toString和equals方法
		map.put(new Student("lyg1",0).name, new Student("lyg1",0).score);
		i=1;
		for(Object s:set){
			System.out.println(s+" "+map.get(s));
			i++;
		}
		System.out.println("==============Iterator===============");
		Iterator it=set.iterator();
		while(it.hasNext()){
			//迭代 不能和键和值一起打印出来？
			System.out.println(it.next());
		}

	}
}
