package Tset;

import java.util.Scanner;

import Tset.dao.MasterDao;
import Tset.dao.impl.MasterDaoImpl;
import Tset.enity.Master;

public class Test01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Master ren=new Master();
		ren.setName("程南");
		ren.setPassword("1111");
		MasterDao ma=new MasterDaoImpl();
//		int result=ma.save(ren);
//		Master ren2=new Master();
//		ren2.setName("輝哥");
//		ren2.setId(4);
//		
//		int result=ma.update(ren2);
//		if(result!=0) {
//			System.out.println("更新数据成功！！！");
//		}
		
		Master ren3=new Master();
		System.out.println("请输入要查找的名字：");
		String str=input.next();
		System.out.println("请输入密码：");
		String password=input.next();
		ren3.setName(str);
		ren3.setPassword(password);
		Master finMaster=ma.findMaster(ren3);
		System.out.println(finMaster);
	}
}
