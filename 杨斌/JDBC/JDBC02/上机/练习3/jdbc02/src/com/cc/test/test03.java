package com.cc.test;

import java.util.Scanner;

import com.cc.dao.DogDao;
import com.cc.dao.DogDaoImpl;
import com.cc.dao.impl.MasterDaoImpl;
import com.cc.entity.Master;

public class test03 {
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
				    case 1:
				    	System.out.println("�����̵�>��ӳ�����Ϣ");
				    	System.out.println("�������������:");
						String ename=input.next();
						System.out.println("���������Ľ���ֵ:");
						int health=input.nextInt();
						System.out.println("����������ϲ�ö�:");
						int love=input.nextInt();
						System.out.println("��������������:");
						String strain=input.next();
						String sql="insert into dog values(null,?,?,?,?)";					
						Object[] objects= {ename,health,love,strain};
						int resu=dog.executeUpdate(sql,objects);
						if(resu>0) {
							System.out.println("���빷����Ϣ�ɹ�");
						}
						break;
					case 2:
						System.out.println("�����̵�>�޸ĳ�����Ϣ");
				    	System.out.println("��������Ҫ�޸Ľ���ֵ�ĳ�������:");
						String ename01=input.next();
						System.out.println("�������޸ĺ�Ľ���ֵ��1-100��");
						int health01=input.nextInt();
						String sql01="update dog set health=? where name=?";					
						Object[] objects01= {health01,ename01};
						int resu01=dog.executeUpdate(sql01,objects01);
						if(resu01>0) {
							System.out.println("���������Ϣ�ɹ�");
						}
						break;
					case 3:
						System.out.println("�����̵�>��ѯ����");
						dog.selectDog();
						break;
					case 4:
						System.out.println("�����̵�>���������Ϣ");
						System.out.println("��������������:");
						String mname=input.next();
						System.out.println("���������˵�����:");
						String pass=input.next();
						System.out.println("���������˵�Ԫ��:");
						int money=input.nextInt();
						String sql02="insert into master values(null,?,?,?)";					
						Object[] objects02= {mname,pass,money};
						int resu02=dog.executeUpdate(sql02,objects02);
						if(resu02>0) {
							System.out.println("���빷����Ϣ�ɹ�");
						}
						break;
					case 0:
						System.out.println("лл���Ĺ��٣��ټ�");
						goOn=false;
						break;

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
