package cn.cc.test;

import java.util.Scanner;

import cn.cc.dao.PetTypeDao;
import cn.cc.entity.Master;
import cn.cc.manager.MasterManager;
import cn.cc.manager.PetTypeManager;
import cn.cc.manager.StudentManager;

/**
* @author mob
* @version 2019��5��13�� ����7:44:26
* @description ������
*/
public class Test {
	public static void main(String[] args) {
//		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
//		System.out.println("---- ��ӭ��¼  -----");
//		System.out.print("�������¼��:");
//		String name=input.next();
//		System.out.print("����������:");
//		String password=input.next();
//		MasterManager manager=new MasterManager();
//		if(manager.login(name,password)) {
//			System.out.println("��¼�ɹ���");
//		}else {
//			System.out.println("��¼ʧ�ܣ�");
//		}
//		System.out.println("������������ͣ�����|���|è��");
//		String name=input.next();
//		PetTypeManager petTypeManager=new PetTypeManager();
//		int id=petTypeManager.findId(name);
//		if(id!=-1) {
//			System.out.println(name+"�����ͱ����"+id);
//		}else {
//			System.out.println("���������������");
//		}
		StudentManager studentManager=new StudentManager();
		System.out.print("�������޸ĵ�id");
		int id=input.nextInt();
		System.out.println("�������޸ĺ������");
		String name=input.next();
		if(studentManager.updateById(id, name)) {
			System.out.println("�޸ĳɹ�");
		}
		System.out.println(studentManager.getAll());
	}
}
