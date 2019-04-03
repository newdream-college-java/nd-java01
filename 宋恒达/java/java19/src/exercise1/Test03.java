package exercise1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * 使用iterator迭代企鹅中的信息
 * @author mo
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(1,new Penguin("亚亚", "Q妹"));
		map.put(2, new Penguin("菲菲","Q妹"));
		map.put(3,new Penguin("欧欧","Q仔"));
		map.put(4,new Penguin("美美","Q妹"));
		Set set=map.keySet();
		Iterator iterator=set.iterator();
		System.out.println("使用Iterator遍历，所有企鹅的昵称和品种分别是：");
		while(iterator.hasNext()) {
			Object i=iterator.next();
			System.out.println(((Penguin)map.get(i)).getName()+"\t\t"+((Penguin)map.get(i)).getSex());
		}
		
		
	}
}
