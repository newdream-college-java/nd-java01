package com.cc.test;

import java.util.Scanner;

import com.cc.dao.impl.MasterDaoImpl;
import com.cc.entity.Master;

public class test01 {
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
		if(result!=null) {
			System.out.println("��¼�ɹ�����ӭ��");
		}else {
			System.out.println("�û�����������󣬵�¼ʧ��");
		}
	}
}
