package ��ҵ;
import java.util.*;
public class Zy5 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		print(list);
	}
	public static void print(List pList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < pList.size(); i++) {
			//String str=pList.get(i);
			//���Ͳ�ƥ��  Ӧ��ǿת��String
			String str=(String) pList.get(i);
			System.out.println(str);
		}
	}
}
