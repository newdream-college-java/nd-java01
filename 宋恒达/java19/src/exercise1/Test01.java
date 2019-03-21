package exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 使用List存储企鹅信息，使用集合List接口下的实现类ArrayList
 * 根据宠物昵查找宠物
 */
public class Test01 {
	public static void main(String[] args) {
		List<Penguin> lists=new ArrayList<Penguin>();
		lists.add(new Penguin("欧欧", "Q仔"));
		lists.add(new Penguin("亚亚", "Q妹"));
		lists.add(new Penguin("菲菲", "Q妹"));
		lists.add(new Penguin("美美","Q妹"));
		System.out.println("共计有"+lists.size()+"只企鹅");
		System.out.println("分别有:");
		for(Penguin p:lists) {
			System.out.println(p.getName()+"\t\t"+p.getSex());
		}
		lists.remove(new Penguin("菲菲", "Q妹"));
		lists.remove(new Penguin("美美","Q妹"));
		System.out.println();
		System.out.println("删除后还剩下"+lists.size()+"只企鹅");
		
		if(lists.contains(new Penguin("美美","Q妹"))) {
			System.out.println("集合中包含美美信息！");
		}else {
			System.out.println("集合中不包含美美信息！");
		}
		
		
	}
}
