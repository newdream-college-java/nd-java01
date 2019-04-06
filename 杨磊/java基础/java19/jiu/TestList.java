package com.nd.yl.jiu;

//集合里面的数据如果没有定义泛型的话默认为Object类型，在 使用的时候需要强制转型
import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		print(list);

	}

	private static void print(List pList) {
		for (int i = 0; i < pList.size(); i++) {
			String str = (String) pList.get(i);
			System.out.println(str);

		}

	}

}
