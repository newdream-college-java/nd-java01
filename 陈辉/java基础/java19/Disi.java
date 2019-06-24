package java19;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
public class Disi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String,Integer> map=new HashMap <String,Integer>();
		map.put("±ø", 60);
		map.put("Óã",70);
		map.put("Ç¿",80);
		map.put("»Ô¸ç",90);	
		Collection<Integer> values1=map.values();
		Iterator<Integer> it=values1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("---------------");
		map.put("»Ô¸ç", 99);
		values1=map.values();
		it=values1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
