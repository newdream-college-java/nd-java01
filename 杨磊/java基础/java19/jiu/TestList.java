package com.nd.yl.jiu;

//����������������û�ж��巺�͵Ļ�Ĭ��ΪObject���ͣ��� ʹ�õ�ʱ����Ҫǿ��ת��
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
