package Test2019_3_18_z19;

import java.awt.List;
import java.util.ArrayList;

public class Test_1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println("������4ֻ��졣\n�ֱ��ǣ�");
		Penguin_1 p = new Penguin_1();
		
		p.setName("ŷŷ\tQ��");
		list.add(p.getName());
		p.show();
		p.setName("����\tQ��");
		list.add(p.getName());
		p.show();
		p.setName("�Ʒ�\tQ��");
		list.add(p.getName());
		p.show();
		p.setName("����\tQ��");
		list.add(p.getName());
		p.show();
		
		list.remove("�Ʒ�\tQ��");
		list.remove("����\tQ��");
		System.out.println("ɾ��֮����2ֻ��졣\n�ֱ��ǣ�");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));	
		}
		
	}
}
