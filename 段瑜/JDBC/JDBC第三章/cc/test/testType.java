package cn.cc.test;

import java.util.Scanner;

import cn.cc.entity.Type;
import cn.cc.manager.TypeManager;

public class testType {
	public static void main(String[] args) {
		Type type=new Type();
		Scanner input=new Scanner(System.in);
		System.out.println("������������ͣ�����|���|è��");
		String name=input.next();
		TypeManager pmanager=new TypeManager();
		type.setTypeName(name);
		int id=pmanager.findId(name);
		if(id!=0) {
			System.out.println(name+"�����ͱ���ǣ�"+id);
			
		}else {
			System.out.println("���������������");
		}
	}
}
