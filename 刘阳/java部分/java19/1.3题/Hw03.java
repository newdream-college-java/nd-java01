import java.util.HashMap;


public class Hw03 {
	public static void main(String[] args) {
		HashMap <String,Integer> hm=new HashMap <String,Integer>();
		hm.put("С��", 44);
		hm.put("С��",55);
		hm.put("С��",47);
		hm.put("С��",87);
		System.out.println(hm.values());		
		System.out.println("\n");
		hm.put("С��", 99);
		System.out.println(hm.values());
	}
}
