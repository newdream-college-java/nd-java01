package cn.cc.manager;

import java.util.Scanner;

import cn.cc.dao.MasterDao;
import cn.cc.dao.typeDao;
import cn.cc.dao.imgl.MasterDaoSqlServerImpl;
import cn.cc.dao.imgl.TypeDaoSqlServerImpl;
import cn.cc.entity.Master;
import cn.cc.entity.Type;

public class MasterManager {
	public int save(Master master) {
		MasterDao masterDao=new MasterDaoSqlServerImpl();
		return masterDao.save(master);
	}
	public int update(Master master) {
		MasterDao masterDao=new MasterDaoSqlServerImpl();
		return masterDao.update(master);		
	}
	public int select(Master master) {
		MasterDao masterDao=new MasterDaoSqlServerImpl();
		return masterDao.select(master);		
	}
	public int select(Type type) {
		typeDao typeDao=new TypeDaoSqlServerImpl();
		return typeDao.select(type);	
	}
	public static void main(String[] args) {
		Master master=new Master();
		Type type=new Type();
		Scanner input=new Scanner(System.in);
		System.out.println("----»¶Ó­¹âÁÙ³èÎïÀÖÔ°----");
		System.out.print("ÇëÊäÈëµÇÂ¼Ãû£º");
		String name=input.next();
		System.out.print("ÇëÊäÈëµÇÂ¼ÃÜÂë£º");
		String password=input.next();
		master.setName(name);
		master.setPassword(password);
		MasterManager m=new MasterManager();
		if(m.save(master)==0) {
			System.out.println("µÇÂ¼Ê§°Ü");
		}else {
			System.out.println("µÇÂ¼³É¹¦");
		}
		System.out.println("ÇëÊäÈë³èÎïÀàĞÍ£º¹·¹·|Æó¶ì|Ã¨ßä");
		String uname=input.next();
		type.setTypeName(uname);
		
	}
}
