package com.cc.test;

import java.util.Scanner;

import com.cc.dao.DogDaoImpl;
import com.cc.dao.impl.MasterDaoImpl;
import com.cc.entity.Master;

public class test02 {
	public static void main(String[] args) {
		Master ms=new Master();
		MasterDaoImpl md=new MasterDaoImpl();
		Scanner input=new Scanner(System.in);
		System.out.println("�������˵�¼");
		System.out.println("����������");
		String name=input.next();
		ms.setName(name);
		System.out.println("����������");		
		String password=input.next();
		ms.setPassword(password);
		Master result=md.findmaster(ms);
		DogDaoImpl dog =new DogDaoImpl();
		if(result!=null) {
			System.out.println("��¼�ɹ�����ӭ��");
			boolean goOn;
			do {
				goOn=true;
				System.out.println("============================��ӭ���ʳ����̵�============================");
				System.out.println("1.��ӳ�����Ϣ\t2.�޸ĳ�����Ϣ\t3.��ѯ������Ϣ\t4.���������Ϣ\t0.�˳�");
				System.out.println("����������ѡ��:");
				int num=input.nextInt();
				switch(num) {
					case 3:
						System.out.println("�����̵�>��ѯ����");
						dog.selectDog();
						break;
					case 0:
						System.out.println("лл���Ĺ��٣��ټ�");
						goOn=false;
						break;
//					case 2:
//						System.out.println("�����̵�>�޸ĳ�����Ϣ");
//						t1.updateMaster();
//						break;
					default:
						System.out.println("����ѡ������");
						break;
				}
			}while(goOn);
		}else {
			System.out.println("�û�����������󣬵�¼ʧ��");
		}
	}
}
