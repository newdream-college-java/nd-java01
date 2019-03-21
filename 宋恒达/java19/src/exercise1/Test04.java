package exercise1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * 使用泛型集合显示存储在Map中的企鹅信息，为企鹅添加一个编号属性id
 * 封装该属性，将企鹅的编号作为键存储多个企鹅信息到应用泛型的HashMap集合
 * 使用Iterator、foreach语句进行遍历
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
		p1.setName("亚亚");
		p1.setBrand("Q妹");
		p2.setId(2);
		p2.setName("菲菲");
		p2.setBrand("Q妹");
		p3.setId(3);
		p3.setName("欧欧");
		p3.setBrand("Q仔");
		p4.setId(4);
		p4.setName("美美");
		p4.setBrand("Q妹");
		Map map=new HashMap();
		map.put(p1.getId(), p1);
		map.put(p2.getId(), p2);
		map.put(p3.getId(), p3);
		map.put(p4.getId(), p4);
		System.out.println("使用Iterator进行遍历，所有的企鹅昵称和品种为:");
		Set set=map.keySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			Object i=iterator.next();
			System.out.println(((Penguin1)map.get(i)).getName()+"\t\t"+((Penguin1)map.get(i)).getBrand());
		}
		System.out.println("使用foreach进行遍历，所有的企鹅昵称和品种为:");
		for(Object i:set) {
			System.out.println(((Penguin1)map.get(i)).getName()+"\t\t"+((Penguin1)map.get(i)).getBrand());
		}
	}
}
