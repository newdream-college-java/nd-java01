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
		Penguin p1 = new Penguin(1, "�Ʒ�", "Q��");
		Penguin p2 = new Penguin(2, "ŷŷ", "Q��");
		Penguin p3 = new Penguin(3, "����", "Q��");
		Penguin p4 = new Penguin(4, "����", "Q��");

		b.put(p1.getId(), p1);
		b.put(p2.getId(), p2);
		b.put(p3.getId(), p3);
		b.put(p4.getId(), p4);
		System.out.println("������������ӵĴ��ţ�");
		Integer name = input.nextInt();
		boolean flag = false;
		// ��key����ֵ
		for (Object j : b.keySet()) {
			Integer key = (Integer) j;
			if (key == name) {
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
		Set<Entry<Object, Penguin>> entry = b.entrySet();
		for (Entry<Object, Penguin> j : entry) {
			System.out.println(j.getValue());
		}

	}

}
