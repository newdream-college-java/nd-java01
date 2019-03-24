package com.nd.yl.demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.nd.yl.demo1.Penguin;

public class PenguinMapTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, Penguin> b = new HashMap<String, Penguin>();
		b.put("菲菲", new Penguin("菲菲", "Q妹"));
		b.put("欧欧", new Penguin("欧欧", "Q仔"));
		b.put("亚亚", new Penguin("亚亚", "Q妹"));
		b.put("美美", new Penguin("美美", "Q妹"));
		System.out.println("请输入企鹅崽子的名字：");
		String name = input.next();
		boolean flag = false;
		// 用key来查值
		for (Object j : b.keySet()) {
			String key = (String) j;
			if (key.equals(name)) {
				flag = true;
				name = key;
			}
		}
		if (flag) {
			System.out.println("HashMap中有这个企鹅崽子");
			System.out.println(b.get(name) + "\n");
		} else {
			System.out.println("没有这只企鹅崽子，很有可能是死了\n");
		}
		System.out.println("所有的企鹅崽子的名字和性别分别如下：----迭代器");
		// 迭代器
		Collection<Penguin> values = b.values();
		// iterator
		Iterator<Penguin> it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// 利用entry来查属性
		System.out.println("所有的企鹅崽子的名字和性别分别如下：----entry");
		Set<Entry<String, Penguin>> entry = b.entrySet();
		for (Entry<String, Penguin> j : entry) {
			System.out.println(j.getValue());
		}

	}

}
