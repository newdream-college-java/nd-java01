package cn.cc.test;
import java.util.Scanner;

import cn.cc.manager.PeTypeManager;
public class test03 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		PeTypeManager pn=new PeTypeManager();
		System.out.println("������������ͣ�����|\t���|\tè��");
		String name=input.next();	
		int id=pn.findId(name);
		if(id!=0) {
			System.out.println(name+"�����ͱ����"+id);
		}else{
			System.out.println("�����������");
		}
	}
}
