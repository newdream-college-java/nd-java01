package ��ҵ;
import java.util.HashMap;
public class Zy3 {

	public static  void main(String[] args) {
		HashMap<String,Integer> a=new HashMap<String,Integer>();
		a.put("�»�", 99);
		a.put("���", 98);
		a.put("���", 97);
		System.out.println(a.values());
		System.out.println("---------------");
		a.put("���", 99);
		System.out.println(a.values());
	}

}
