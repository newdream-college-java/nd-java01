package exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * ʹ��Map�ӿڵ�ʵ����HashMap
 * @author mo
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(1,new Penguin("ŷŷ", "Q��"));
		map.put(2, new Penguin("ѩ����", "Q��"));
		Set set=map.keySet();
		System.out.println("Map�д���ָ�����󣬶�����Ϣ����");
		for(Object key:set) {
			System.out.print(((Penguin)map.get(key)).getName()+"\t\t");
		}
		System.out.println();
	}
}
