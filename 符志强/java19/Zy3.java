package ×÷Òµ;
import java.util.HashMap;
public class Zy3 {

	public static  void main(String[] args) {
		HashMap<String,Integer> a=new HashMap<String,Integer>();
		a.put("³Â»Ô", 99);
		a.put("Ñî±ó", 98);
		a.put("¶Îè¤", 97);
		System.out.println(a.values());
		System.out.println("---------------");
		a.put("¶Îè¤", 99);
		System.out.println(a.values());
	}

}
