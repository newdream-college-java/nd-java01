import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class Hw04 {

	public static void main(String[] args) {
		HashMap <String,Integer> hm=new HashMap <String,Integer>();
		hm.put("С��", 44);
		hm.put("С��",55);
		hm.put("С��",47);
		hm.put("С��",87);
		Collection value=hm.values();
		Iterator it=value.iterator();
		Collection key=hm.keySet();
		Iterator it1=key.iterator();
		while(it.hasNext()){
		System.out.println(it1.next()+"\t"+it.next());
		}
	}

}
