package com.nd.yl.demo3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.nd.yl.demo1.Penguin;

public class PenguinHashMapTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<Object, Penguin> b = new HashMap<Object, Penguin>();
		Penguin p1 = new Penguin(1, "菲菲", "Q妹");
		Penguin p2 = new Penguin(2, "欧欧", "Q仔");
		Penguin p3 = new Penguin(3, "亚亚", "Q妹");
		Penguin p4 = new Penguin(4, "美美", "Q妹");

		b.put(p1.getId(), p1);
		b.put(p2.getId(), p2);
		b.put(p3.getId(), p3);
		b.put(p4.getId(), p4);
		System.out.println("请输入企鹅崽子的代号：");
		Integer name = input.nextInt();
		boolean flag = false;
		// 用key来查值
		for (Object j : b.keySet()) {
			Integer key = (Integer) j;
			if (key == name) {
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
		Set<Entry<Object, Penguin>> entry = b.entrySet();
		for (Entry<Object, Penguin> j : entry) {
			System.out.println(j.getValue());
		}

	}

}
