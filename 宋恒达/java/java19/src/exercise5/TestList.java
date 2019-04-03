package exercise5;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		print(list);
	}
	public static void print(List pList) {
		for(int i=0;i<pList.size();i++) {
		//	String str=pList.get(i);	返回的应该是Object类型
			String str=(String) pList.get(i);
			System.out.println(str);
		}
	}
}
