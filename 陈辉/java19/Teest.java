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
		list.add(new Penguin("ŷŷ","Q��"));
		list.add(new Penguin("����","Q��"));
		list.add(new Penguin("�Ʒ�","Q��"));
		list.add(new Penguin("����","Q��"));
		System.out.println("����4ֻ��졣");
		System.out.println("�ֱ��ǣ�");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\nɾ��֮����2ֻ��졣");
		System.out.println("�ֱ��ǣ�");
		list.remove(new Penguin("�Ʒ�","Q��"));
		list.remove(new Penguin("����","Q��"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		Map <String,String> map=new HashMap<String,String>();
		System.out.println("\nMap�д����ƶ����󣬶�����Ϣ����");
		map.put("ŷŷ", "ѩ����");
		Set<String> set=map.keySet();
		for (Object key:set) {
			System.out.println(key+"\t"+map.get(key));
		}
		System.out.println("\nʹ��Iterator���������������ǳƺ�Ʒ�ֱַ��ǣ�");
		map.put("����","Q��");
		map.put("�Ʒ�","Q��");
		map.put("ŷŷ","Q��");
		map.put("����","Q��");		
		Collection<String> values=map.values();
		Collection<String> key=map.keySet();
		Iterator<String> ii=key.iterator();
		Iterator<String> it=values.iterator();
		while(it.hasNext()){
			System.out.println(ii.next()+"\t"+it.next());
		}

		Penguin p1=new Penguin();
		Map <String,Penguin> map1=new HashMap<String,Penguin>();
		map1.put("11111",new Penguin("ŷŷ","Q��"));
		map1.put("22222",new Penguin("����","Q��"));
		map1.put("33333",new Penguin("����","Q��"));
		map1.put("44444",new Penguin("�Ʒ�","Q��"));
		Collection<Penguin> values1=map1.values();
		Iterator<Penguin> it1=values1.iterator();
		System.out.println("\nʹ��Iterator���������������ǳƺ�Ʒ�ֱַ��ǣ�");
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		Set<String> set1=map1.keySet();
		System.out.println("\nʹ��foreach���������������ǳƺ�Ʒ�ֱַ��ǣ�");
		for (Object key1:set1) {
			;
			p1.setBh((String) key1);
			System.out.println(map1.get(key1));
		}
	
	}

}
