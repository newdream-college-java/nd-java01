package ��ҵ;
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
        list.add(new Penguin("ŷŷ","Q��"));
        list.add(new Penguin("����","Q��"));
        list.add(new Penguin("����","Q��"));
        list.add(new Penguin("�Ʒ�","Q��"));       
        System.out.println("������ĸ���\n�ֱ��ǣ�");
        for(Penguin p : list) {
            p.eat();
        }
        System.out.println("ɾ��������\n�ֱ��ǣ�");
        list.remove(new Penguin("����","Q��"));
        list.remove(new Penguin("�Ʒ�","Q��"));
        for(Penguin p : list) {
            p.eat();
        }
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("ŷŷ", "ѩ����");
        System.out.println("\nMap�д����ƶ����󣬶�����Ϣ����");
        Set<String> set = map.keySet();//���map�����е�key ,�ŵ�set����
        for(Object key :set) {
            //map.get(key)----���ݼ�(key),�õ�ֵ
            System.out.println(key+"\t"+map.get(key));
        }
        
        System.out.println("\nʹ��Iterator���������������ǳƺ�Ʒ�ֱַ��ǣ�");
        map.put("ŷŷ", "Q��");
        map.put("����", "Q��");
        map.put("����", "Q��");
        map.put("�Ʒ�", "Q��");
        Collection<String> key=map.keySet();
        Collection<String> values=map.values();
        Iterator it=key.iterator();
        Iterator iv=values.iterator();
        while(iv.hasNext()) {
            System.out.println(it.next()+"\t"+iv.next());
        }
       System.out.println("\nʹ��Iterator���������������ǳƺ�Ʒ�ֱַ��ǣ�");
       Map<String, String> map1 = new HashMap<String, String>();
       Penguin p1=new Penguin();
        map1.put("01", "ŷŷ\tQ��");
        map1.put("02", "����\tQ��");
        map1.put("03", "����\tQ��");
        map1.put("04", "�Ʒ�\tQ��");
        Collection<String> key1=map1.keySet();
        Collection<String> values1=map1.values();
        Iterator it1=key1.iterator();
        Iterator iv1=values1.iterator();
        while(iv1.hasNext()) {
            System.out.println(iv1.next());
        }
        Set<String> set1=map1.keySet();
		System.out.println("\nʹ��foreach���������������ǳƺ�Ʒ�ֱַ��ǣ�");
		for (Object key2:set1) {	
			p1.setBh((String) key2);
			System.out.println(map1.get(key2));
		}
	}
}
