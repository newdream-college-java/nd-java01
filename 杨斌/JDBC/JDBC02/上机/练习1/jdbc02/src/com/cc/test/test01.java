package com.cc.test;

import java.util.Scanner;

import com.cc.dao.impl.MasterDaoImpl;
import com.cc.entity.Master;

public class test01 {
	public static void main(String[] args) {
		Master ms=new Master();
		MasterDaoImpl md=new MasterDaoImpl();
		Scanner input=new Scanner(System.in);
		System.out.println("³èÎïÖ÷ÈËµÇÂ¼");
		System.out.println("ÇëÊäÈëĞÕÃû");
		String name=input.next();
		ms.setName(name);
		System.out.println("ÇëÊäÈëÃÜÂë");		
		String password=input.next();
		ms.setPassword(password);
		Master result=md.findmaster(ms);
		if(result!=null) {
			System.out.println("µÇÂ¼³É¹¦£¬»¶Ó­Äú");
		}else {
			System.out.println("ÓÃ»§Ãû»òÃÜÂë´íÎó£¬µÇÂ¼Ê§°Ü");
		}
	}
}
