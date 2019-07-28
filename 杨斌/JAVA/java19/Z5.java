package com.java.java19;
import java.util.*;
public class Z5 {
	public static void main(String[] args) {
		List list =new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		print(list);
		
	}
	public static void print(List pList){
		for(int i=0;i<pList.size();i++){
			String str=(String) pList.get(i);
			System.out.print(str);
		}
	}
}
