package exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * ʹ��List�洢�����Ϣ��ʹ�ü���List�ӿ��µ�ʵ����ArrayList
 * ���ݳ����ǲ��ҳ���
 */
public class Test01 {
	public static void main(String[] args) {
		List<Penguin> lists=new ArrayList<Penguin>();
		lists.add(new Penguin("ŷŷ", "Q��"));
		lists.add(new Penguin("����", "Q��"));
		lists.add(new Penguin("�Ʒ�", "Q��"));
		lists.add(new Penguin("����","Q��"));
		System.out.println("������"+lists.size()+"ֻ���");
		System.out.println("�ֱ���:");
		for(Penguin p:lists) {
			System.out.println(p.getName()+"\t\t"+p.getSex());
		}
		lists.remove(new Penguin("�Ʒ�", "Q��"));
		lists.remove(new Penguin("����","Q��"));
		System.out.println();
		System.out.println("ɾ����ʣ��"+lists.size()+"ֻ���");
		
		if(lists.contains(new Penguin("����","Q��"))) {
			System.out.println("�����а���������Ϣ��");
		}else {
			System.out.println("�����в�����������Ϣ��");
		}
		
		
	}
}
