package Test2019_3_18_z19;

import java.awt.List;
import java.util.ArrayList;

public class Test_1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println("共计有4只企鹅。\n分别是：");
		Penguin_1 p = new Penguin_1();
		
		p.setName("欧欧\tQ仔");
		list.add(p.getName());
		p.show();
		p.setName("亚亚\tQ妹");
		list.add(p.getName());
		p.show();
		p.setName("菲菲\tQ妹");
		list.add(p.getName());
		p.show();
		p.setName("美美\tQ妹");
		list.add(p.getName());
		p.show();
		
		list.remove("菲菲\tQ妹");
		list.remove("美美\tQ妹");
		System.out.println("删除之后还有2只企鹅。\n分别是：");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));	
		}
		
	}
}
