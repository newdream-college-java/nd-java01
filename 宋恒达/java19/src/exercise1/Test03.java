package exercise1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * ʹ��iterator��������е���Ϣ
 * @author mo
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(1,new Penguin("����", "Q��"));
		map.put(2, new Penguin("�Ʒ�","Q��"));
		map.put(3,new Penguin("ŷŷ","Q��"));
		map.put(4,new Penguin("����","Q��"));
		Set set=map.keySet();
		Iterator iterator=set.iterator();
		System.out.println("ʹ��Iterator���������������ǳƺ�Ʒ�ֱַ��ǣ�");
		while(iterator.hasNext()) {
			Object i=iterator.next();
			System.out.println(((Penguin)map.get(i)).getName()+"\t\t"+((Penguin)map.get(i)).getSex());
		}
		
		
	}
}
