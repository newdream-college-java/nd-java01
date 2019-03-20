import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class HashMapPenguin {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("亚亚", "Q妹");
		hm.put("菲菲", "Q妹");
		hm.put("欧欧", "Q仔");
		hm.put("美美", "Q妹");
		Collection value=hm.values();
		Iterator it=value.iterator();
		Collection key=hm.keySet();
		Iterator it1=key.iterator();
		System.out.println("使用Iterator遍历，所有企鹅的昵称和品种分别是：");
		while(it.hasNext()){
		System.out.println(it1.next()+"\t"+it.next());
		}
	}

}
