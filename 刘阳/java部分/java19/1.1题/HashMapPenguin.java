import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class HashMapPenguin {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("����", "Q��");
		hm.put("�Ʒ�", "Q��");
		hm.put("ŷŷ", "Q��");
		hm.put("����", "Q��");
		Collection value=hm.values();
		Iterator it=value.iterator();
		Collection key=hm.keySet();
		Iterator it1=key.iterator();
		System.out.println("ʹ��Iterator���������������ǳƺ�Ʒ�ֱַ��ǣ�");
		while(it.hasNext()){
		System.out.println(it1.next()+"\t"+it.next());
		}
	}

}
