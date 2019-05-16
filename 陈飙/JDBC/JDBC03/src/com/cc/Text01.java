package com.cc;

import com.cc.dao.MasterInfoDao;
import com.cc.dao.impl.MasterInfoDaoImpl;
import com.cc.enity.MasterInfo;

public class Text01 {

	public static void main(String[] args) {
		//MasterInfo stu = new MasterInfo();
		//stu.setName("王二辉");

		//MasterInfo stu2 = new MasterInfo();
		//stu2.setName("杨二辉");
		//stu2.setId(22);
		
		//MasterInfo stu3=new MasterInfo();
		//stu3.setName("杨二辉");
		
		MasterInfo stu4=new MasterInfo();
		stu4.setName("图灵宝宝");
		stu4.setPassword("1111");
		// 添加哪个表就使用哪个dao
		MasterInfoDao sd = new MasterInfoDaoImpl();
		//使用sd必须放在newsd语句的下面 因为代码是重上往下执行的
		//类型为MasterInfo
		
		MasterInfo s1=sd.select(stu4);
		System.out.println("查询成功成功！！！");
		
		//int result = sd.save(stu3);
		/*if (result != 0) {
			System.out.println("添加数据成功！！！");
		}

		result = sd.update(stu2);
		if (result != 0) {
			System.out.println("更新数据成功！！！");
		}*/
		
		/*int result=sd.delete(stu3);
		if(result!=0){
			System.out.println("删除数据成功！！！");
		}*/
	}

}
