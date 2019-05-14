package cn.cc.manager;

import java.util.Scanner;

import cn.cc.dao.MasterDao;
import cn.cc.dao.impl.MasterDaoImpl;
import cn.cc.entity.Master;

/**
* @author mob
* @version 2019Äê5ÔÂ13ÈÕ ÏÂÎç7:28:59
* @description
*/
public class MasterManager {
	/**
	 * Ö÷ÈËµÇÂ¼
	 * @param name
	 * @param password
	 * @return
	 */
	public static boolean login(String name,String password) {
		Master master=new Master();
		master.setName(name);
		master.setPassword(password);
		MasterDao masterDao=new MasterDaoImpl();
		Master m=masterDao.findMaster(master);
		boolean isLogin=(m==null?false:true);
		return isLogin;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("---- »¶Ó­µÇÂ¼  -----");
		System.out.print("ÇëÊäÈëµÇÂ¼Ãû:");
		String name=input.next();
		System.out.print("ÇëÊäÈëÃÜÂë:");
		String password=input.next();
		if(login(name,password)) {
			System.out.println("µÇÂ¼³É¹¦£¡");
		}else {
			System.out.println("µÇÂ¼Ê§°Ü£¡");
		}
	}
}
