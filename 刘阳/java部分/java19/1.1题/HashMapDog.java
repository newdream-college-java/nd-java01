import java.util.HashMap;
import java.util.Set;


public class HashMapDog {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("ŷŷ","ѩ����");
		System.out.println("Map�д��ڵ�ָ�����󣬶�����Ϣ���£�");
		Set set=hm.keySet();
		for(Object key:set){
			System.out.println(key+"\t"+hm.get(key));
			}

	}
}
