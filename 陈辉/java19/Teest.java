package java19;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Teest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Penguin> list=new ArrayList<Penguin>();
		list.add(new Penguin("欧欧","Q仔"));
		list.add(new Penguin("亚亚","Q妹"));
		list.add(new Penguin("菲菲","Q妹"));
		list.add(new Penguin("美美","Q妹"));
		System.out.println("共有4只企鹅。");
		System.out.println("分别是：");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n删除之后还有2只企鹅。");
		System.out.println("分别是：");
		list.remove(new Penguin("菲菲","Q妹"));
		list.remove(new Penguin("美美","Q妹"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		Map <String,String> map=new HashMap<String,String>();
		System.out.println("\nMap中存在制定对象，对象信息如下");
		map.put("欧欧", "雪娜瑞");
		Set<String> set=map.keySet();
		for (Object key:set) {
			System.out.println(key+"\t"+map.get(key));
		}
		System.out.println("\n使用Iterator遍历，所有企鹅的昵称和品种分别是：");
		map.put("亚亚","Q妹");
		map.put("菲菲","Q妹");
		map.put("欧欧","Q仔");
		map.put("美美","Q妹");		
		Collection<String> values=map.values();
		Collection<String> key=map.keySet();
		Iterator<String> ii=key.iterator();
		Iterator<String> it=values.iterator();
		while(it.hasNext()){
			System.out.println(ii.next()+"\t"+it.next());
		}

		Penguin p1=new Penguin();
		Map <String,Penguin> map1=new HashMap<String,Penguin>();
		map1.put("11111",new Penguin("欧欧","Q仔"));
		map1.put("22222",new Penguin("亚亚","Q妹"));
		map1.put("33333",new Penguin("美美","Q妹"));
		map1.put("44444",new Penguin("菲菲","Q妹"));
		Collection<Penguin> values1=map1.values();
		Iterator<Penguin> it1=values1.iterator();
		System.out.println("\n使用Iterator遍历，所有企鹅的昵称和品种分别是：");
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		Set<String> set1=map1.keySet();
		System.out.println("\n使用foreach遍历，所有企鹅的昵称和品种分别是：");
		for (Object key1:set1) {
			;
			p1.setBh((String) key1);
			System.out.println(map1.get(key1));
		}
	
	}

}
