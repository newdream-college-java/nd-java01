package exercise3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * 创建一个HashMap对象，并在其中添加一些
 * 学员的姓名和他们的分数，键为学员姓名（使用 String类型）
 * 值为学员分数（使用Integer类型），从HashMap对象中获取
 * 这些学员的成绩并打印出来。修改其中一名学员的成绩，然后再次打印
 * 所有学员的成绩。提示：使用put方法进行添加和修改操作；使用values
 * 方法打印出来
 * 使用Iterator迭代打印学员的成绩
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
