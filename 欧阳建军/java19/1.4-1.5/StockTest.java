package ��20�¼�����ҵ_����;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;





public class StockTest {
	public static void main(String[] args) {
		//�õ�һ���ֿ�
		Stock<Dog> stockDog=new Stock<Dog>();
		stockDog.add(new Dog("s1","s"));
		stockDog.add(new Dog("s2","s"));
		stockDog.add(new Dog("s3","s"));
		//������ǿfor?
		 for(Dog dog : stockDog.getList()) {
	           System.out.print(dog.getName());
	           dog.eat();
	        }
		 //����
		 Stock<Penguin> stockPenguin =new Stock<Penguin>();
		 Penguin p0=new Penguin("ŷŷ", "Q��");
		 p0.setNo(0);
		 Penguin p1=new Penguin("����", "Q��");
		 p1.setNo(1);
		 Penguin p2=new Penguin("����", "Q��");
		 p2.setNo(2);
		 Penguin p3=new Penguin("�Ʒ�", "Q��");
		 p3.setNo(3);
		 stockPenguin.add(p0);
		 stockPenguin.add(p1);
		 stockPenguin.add(p2);
		 stockPenguin.add(p3);
		 HashMap map=new HashMap();
		 map.put(p0.getNo(), p0);
		 map.put(p1.getNo(), p1);
		 map.put(p2.getNo(), p2);
		 map.put(p3.getNo(), p3);
		 Set set=map.keySet();
		 System.out.println("=========��ǿfor���hasMap=============");
		 for(Object key:set){
			System.out.println(map.get(key));
		 }
		 System.out.println("=========Iterator=============");
		 Set setIt=new HashSet();
		 setIt.add(new Penguin("����","Q��"));
		 setIt.add(new Penguin("�Ʒ�","Q��"));
		 setIt.add(new Penguin("ŷŷ","Q��"));
		 setIt.add(new Penguin("����","Q��"));
		 Iterator it=setIt.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		 System.out.println("=========Foreach=============");
		 //��ǿfor���÷�setItΪ��������Object xΪ��������������ͣ�xΪһ����ʱ����
		 // �൱��һ���������漯�����ĳ��Ԫ�ء�
		 for(Object x:setIt){
			 System.out.println(x);
		 }
		 System.out.println("=========Foreach=============");
		
	}
}
