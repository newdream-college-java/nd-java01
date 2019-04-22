package 第20章集合作业_泛型;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;





public class StockTest {
	public static void main(String[] args) {
		//得到一个仓库
		Stock<Dog> stockDog=new Stock<Dog>();
		stockDog.add(new Dog("s1","s"));
		stockDog.add(new Dog("s2","s"));
		stockDog.add(new Dog("s3","s"));
		//这是增强for?
		 for(Dog dog : stockDog.getList()) {
	           System.out.print(dog.getName());
	           dog.eat();
	        }
		 //做题
		 Stock<Penguin> stockPenguin =new Stock<Penguin>();
		 Penguin p0=new Penguin("欧欧", "Q仔");
		 p0.setNo(0);
		 Penguin p1=new Penguin("亚亚", "Q妹");
		 p1.setNo(1);
		 Penguin p2=new Penguin("美美", "Q妹");
		 p2.setNo(2);
		 Penguin p3=new Penguin("菲菲", "Q妹");
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
		 System.out.println("=========增强for输出hasMap=============");
		 for(Object key:set){
			System.out.println(map.get(key));
		 }
		 System.out.println("=========Iterator=============");
		 Set setIt=new HashSet();
		 setIt.add(new Penguin("亚亚","Q仔"));
		 setIt.add(new Penguin("菲菲","Q妹"));
		 setIt.add(new Penguin("欧欧","Q妹"));
		 setIt.add(new Penguin("美美","Q妹"));
		 Iterator it=setIt.iterator();
		 while(it.hasNext()){
			 System.out.println(it.next());
		 }
		 System.out.println("=========Foreach=============");
		 //增强for：用法setIt为集合名，Object x为集合里的数据类型，x为一个临时变量
		 // 相当于一个容器储存集合里的某个元素。
		 for(Object x:setIt){
			 System.out.println(x);
		 }
		 System.out.println("=========Foreach=============");
		
	}
}
