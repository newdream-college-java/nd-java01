package Test2019_3_18_z19;
import java.util.HashMap;

public class Student_3 {
	public static void main(String[] args) {
		HashMap <String,Integer> hm=new HashMap <String,Integer>();
		hm.put("一号", 100);
		hm.put("二号",90);
		hm.put("三号",80);
		System.out.println("添加前："+hm.values());
		hm.put("四号",70);
		System.out.println("添加前："+hm.values());
	}
}