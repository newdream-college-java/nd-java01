package exercise1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * ʹ�÷��ͼ�����ʾ�洢��Map�е������Ϣ��Ϊ������һ���������id
 * ��װ�����ԣ������ı����Ϊ���洢��������Ϣ��Ӧ�÷��͵�HashMap����
 * ʹ��Iterator��foreach�����б���
 * @author mo
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Penguin1 p1=new Penguin1();
		Penguin1 p2=new Penguin1();
		Penguin1 p3=new Penguin1();
		Penguin1 p4=new Penguin1();
		p1.setId(1);
		p1.setName("����");
		p1.setBrand("Q��");
		p2.setId(2);
		p2.setName("�Ʒ�");
		p2.setBrand("Q��");
		p3.setId(3);
		p3.setName("ŷŷ");
		p3.setBrand("Q��");
		p4.setId(4);
		p4.setName("����");
		p4.setBrand("Q��");
		Map map=new HashMap();
		map.put(p1.getId(), p1);
		map.put(p2.getId(), p2);
		map.put(p3.getId(), p3);
		map.put(p4.getId(), p4);
		System.out.println("ʹ��Iterator���б��������е�����ǳƺ�Ʒ��Ϊ:");
		Set set=map.keySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			Object i=iterator.next();
			System.out.println(((Penguin1)map.get(i)).getName()+"\t\t"+((Penguin1)map.get(i)).getBrand());
		}
		System.out.println("ʹ��foreach���б��������е�����ǳƺ�Ʒ��Ϊ:");
		for(Object i:set) {
			System.out.println(((Penguin1)map.get(i)).getName()+"\t\t"+((Penguin1)map.get(i)).getBrand());
		}
	}
}
