import java.util.HashMap;
import java.util.Set;


public class HashMapDog {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("欧欧","雪纳瑞");
		System.out.println("Map中存在的指定对象，对象信息如下：");
		Set set=hm.keySet();
		for(Object key:set){
			System.out.println(key+"\t"+hm.get(key));
			}

	}
}
