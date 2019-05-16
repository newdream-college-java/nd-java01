package com.cc;

import java.util.Scanner;

import com.cc.dao.MasterInfoDao;
import com.cc.dao.impl.MasterInfoDaoImpl;
import com.cc.manager.MasterManager;

public class Test02 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ÇëÊäÈëµÇÂ¼Ãû£º");
		String name=input.next();
		System.out.println("ÇëÊäÈëÃÜÂë£º");
		String password=input.next();
		MasterManager mas=new MasterManager();
		boolean s=mas.login(name, password);
		if(s){
			System.out.println("µÇÂ¼³É¹¦");
		}else{
			System.out.println("µÇÂ¼Ê§°Ü");
		}
		
		
		
	}

}
