package 作业;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zy1  {
	public static void main(String[] args) {
		List<Penguin> list = new ArrayList<Penguin>();
        list.add(new Penguin("欧欧","Q仔"));
        list.add(new Penguin("亚亚","Q妹"));
        list.add(new Penguin("美美","Q妹"));
        list.add(new Penguin("菲菲","Q妹"));       
        System.out.println("企鹅有四个。\n分别是：");
        for(Penguin p : list) {
            p.eat();
        }
        System.out.println("删除两个后。\n分别是：");
        list.remove(new Penguin("美美","Q妹"));
        list.remove(new Penguin("菲菲","Q妹"));
        for(Penguin p : list) {
            p.eat();
        }
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("欧欧", "雪纳瑞");
        System.out.println("\nMap中存在制定对象，对象信息如下");
        Set<String> set = map.keySet();//查出map中所有的key ,放到set集合
        for(Object key :set) {
            //map.get(key)----根据键(key),得到值
            System.out.println(key+"\t"+map.get(key));
        }
        
        System.out.println("\n使用Iterator遍历，所有企鹅的昵称和品种分别是：");
        map.put("欧欧", "Q仔");
        map.put("亚亚", "Q妹");
        map.put("美美", "Q妹");
        map.put("菲菲", "Q妹");
        Collection<String> key=map.keySet();
        Collection<String> values=map.values();
        Iterator it=key.iterator();
        Iterator iv=values.iterator();
        while(iv.hasNext()) {
            System.out.println(it.next()+"\t"+iv.next());
        }
       System.out.println("\n使用Iterator遍历，所有企鹅的昵称和品种分别是：");
       Map<String, String> map1 = new HashMap<String, String>();
       Penguin p1=new Penguin();
        map1.put("01", "欧欧\tQ仔");
        map1.put("02", "亚亚\tQ妹");
        map1.put("03", "美美\tQ妹");
        map1.put("04", "菲菲\tQ妹");
        Collection<String> key1=map1.keySet();
        Collection<String> values1=map1.values();
        Iterator it1=key1.iterator();
        Iterator iv1=values1.iterator();
        while(iv1.hasNext()) {
            System.out.println(iv1.next());
        }
        Set<String> set1=map1.keySet();
		System.out.println("\n使用foreach遍历，所有企鹅的昵称和品种分别是：");
		for (Object key2:set1) {	
			p1.setBh((String) key2);
			System.out.println(map1.get(key2));
		}
	}
}
