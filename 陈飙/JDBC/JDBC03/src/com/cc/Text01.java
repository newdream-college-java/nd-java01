package com.cc;

import com.cc.dao.MasterInfoDao;
import com.cc.dao.impl.MasterInfoDaoImpl;
import com.cc.enity.MasterInfo;

public class Text01 {

	public static void main(String[] args) {
		//MasterInfo stu = new MasterInfo();
		//stu.setName("������");

		//MasterInfo stu2 = new MasterInfo();
		//stu2.setName("�����");
		//stu2.setId(22);
		
		//MasterInfo stu3=new MasterInfo();
		//stu3.setName("�����");
		
		MasterInfo stu4=new MasterInfo();
		stu4.setName("ͼ�鱦��");
		stu4.setPassword("1111");
		// ����ĸ����ʹ���ĸ�dao
		MasterInfoDao sd = new MasterInfoDaoImpl();
		//ʹ��sd�������newsd�������� ��Ϊ��������������ִ�е�
		//����ΪMasterInfo
		
		MasterInfo s1=sd.select(stu4);
		System.out.println("��ѯ�ɹ��ɹ�������");
		
		//int result = sd.save(stu3);
		/*if (result != 0) {
			System.out.println("������ݳɹ�������");
		}

		result = sd.update(stu2);
		if (result != 0) {
			System.out.println("�������ݳɹ�������");
		}*/
		
		/*int result=sd.delete(stu3);
		if(result!=0){
			System.out.println("ɾ�����ݳɹ�������");
		}*/
	}

}
