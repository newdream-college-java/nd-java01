package exercise3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * ����һ��HashMap���󣬲����������һЩ
 * ѧԱ�����������ǵķ�������ΪѧԱ������ʹ�� String���ͣ�
 * ֵΪѧԱ������ʹ��Integer���ͣ�����HashMap�����л�ȡ
 * ��ЩѧԱ�ĳɼ�����ӡ�������޸�����һ��ѧԱ�ĳɼ���Ȼ���ٴδ�ӡ
 * ����ѧԱ�ĳɼ�����ʾ��ʹ��put����������Ӻ��޸Ĳ�����ʹ��values
 * ������ӡ����
 * ʹ��Iterator������ӡѧԱ�ĳɼ�
 * @author mo
 *
 */
public class Test {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("s");
		s1.setScore(30);
		Student s2=new Student();
		s2.setName("n");
		s2.setScore(60);
		Map map=new HashMap();
		map.put(s1.getName(), s1.getScore());
		map.put(s2.getName(), s2.getScore());
		System.out.println(map.values());
		map.put(s2.getName(), 90);
		System.out.println(map.values());
		Set set=map.keySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
		}
	}
}
