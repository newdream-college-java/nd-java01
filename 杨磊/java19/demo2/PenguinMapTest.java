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
		b.put("�Ʒ�", new Penguin("�Ʒ�", "Q��"));
		b.put("ŷŷ", new Penguin("ŷŷ", "Q��"));
		b.put("����", new Penguin("����", "Q��"));
		b.put("����", new Penguin("����", "Q��"));
		System.out.println("������������ӵ����֣�");
		String name = input.next();
		boolean flag = false;
		// ��key����ֵ
		for (Object j : b.keySet()) {
			String key = (String) j;
			if (key.equals(name)) {
				flag = true;
				name = key;
			}
		}
		if (flag) {
			System.out.println("HashMap��������������");
			System.out.println(b.get(name) + "\n");
		} else {
			System.out.println("û����ֻ������ӣ����п���������\n");
		}
		System.out.println("���е�������ӵ����ֺ��Ա�ֱ����£�----������");
		// ������
		Collection<Penguin> values = b.values();
		// iterator
		Iterator<Penguin> it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// ����entry��������
		System.out.println("���е�������ӵ����ֺ��Ա�ֱ����£�----entry");
		Set<Entry<String, Penguin>> entry = b.entrySet();
		for (Entry<String, Penguin> j : entry) {
			System.out.println(j.getValue());
		}

	}

}
