package exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * 使用Map接口的实现类HashMap
 * @author mo
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put(1,new Penguin("欧欧", "Q仔"));
		map.put(2, new Penguin("雪瑞娜", "Q仔"));
		Set set=map.keySet();
		System.out.println("Map中存在指定对象，对象信息如下");
		for(Object key:set) {
			System.out.print(((Penguin)map.get(key)).getName()+"\t\t");
		}
		System.out.println();
	}
}
