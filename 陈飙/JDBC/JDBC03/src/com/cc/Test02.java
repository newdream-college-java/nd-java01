package com.cc;

import java.util.Scanner;

import com.cc.dao.MasterInfoDao;
import com.cc.dao.impl.MasterInfoDaoImpl;
import com.cc.manager.MasterManager;

public class Test02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������¼����");
		String name=input.next();
		System.out.println("���������룺");
		String password=input.next();
		MasterManager mas=new MasterManager();
		boolean s=mas.login(name, password);
		if(s){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ��");
		}
		
		
		
	}

}
