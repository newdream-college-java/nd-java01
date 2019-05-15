package cn.two.manager;


import cn.two.dao.MasterDao;
import cn.two.dao.imgl.MasterDaoimpl;
import cn.two.entity.Master;


public class MasterManager {
	public boolean select(Master master) {
		MasterDao masterDao=new MasterDaoimpl();
		return masterDao.select(master);
	}
	public int save(Master master) {
		MasterDao masterDao=new MasterDaoimpl();
		return masterDao.save(master);
	}
}
