package cn.cc.test;

import java.util.Scanner;

import cn.cc.dao.MasterDao;
import cn.cc.dao.imgl.MasterDaoSqlServerImpl;
import cn.cc.entity.Master;
import cn.cc.manager.MasterManager;

public class testMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master master=new Master();
		Scanner input=new Scanner(System.in);
		System.out.println("----»¶Ó­¹âÁÙ³èÎïÀÖÔ°----");
		System.out.print("ÇëÊäÈëµÇÂ¼Ãû£º");
		String name=input.next();
		System.out.print("ÇëÊäÈëµÇÂ¼ÃÜÂë£º");
		String password=input.next();
		master.setName(name);
		master.setPassword(password);
		MasterManager m=new MasterManager();
		MasterDao masterDao=new MasterDaoSqlServerImpl();
		masterDao.select(master);
	}

}
