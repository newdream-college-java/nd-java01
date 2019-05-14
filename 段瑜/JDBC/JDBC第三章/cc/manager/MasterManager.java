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
}
