package ��20�¼�����ҵ_1_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class Homeworl1_3 {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(new Student("lyg1",100).name, new Student("lyg1",100).score);
		map.put(new Student("lyg2",100).name, new Student("lyg2",100).score);
		
		Set set=new HashSet();
		//map.keySet()�ǵõ�map�е�����keyֵ
		//���� �ܲ�������ǿfor��ʹ��map.ĳ����������ʽ�õ�����keyֵͬʱ��ӡ����Ӧ��valueֵ��
		set=map.keySet();
		int i=1;
		for(Object s:set){
			System.out.println("��"+i+"��ͬѧ�ķ���Ϊ��"+map.get(s));
			i++;
		}
		System.out.println("==============�޸ĺ�===============");
		//����:������ݶ����޸Ķ����valueҲ��Ҫ��дtoString��equals����
		map.put(new Student("lyg1",0).name, new Student("lyg1",0).score);
		i=1;
		for(Object s:set){
			System.out.println(s+" "+map.get(s));
			i++;
		}
		System.out.println("==============Iterator===============");
		Iterator it=set.iterator();
		while(it.hasNext()){
			//���� ���ܺͼ���ֵһ���ӡ������
			System.out.println(it.next());
		}

	}
}
