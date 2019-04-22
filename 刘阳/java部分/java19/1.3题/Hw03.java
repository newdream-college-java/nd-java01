import java.util.HashMap;


public class Hw03 {
	public static void main(String[] args) {
		HashMap <String,Integer> hm=new HashMap <String,Integer>();
		hm.put("小白", 44);
		hm.put("小黑",55);
		hm.put("小黄",47);
		hm.put("小猪",87);
		System.out.println(hm.values());		
		System.out.println("\n");
		hm.put("小猪", 99);
		System.out.println(hm.values());
	}
}
