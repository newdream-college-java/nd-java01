package cn.cc.manager;

import cn.cc.dao.PetTypeDao;
import cn.cc.dao.impl.PetTypeDaoSqlServerImpl;

public class PetTypeManager {
	public int findId(String name) {
		PetTypeDao pTypeDao=new PetTypeDaoSqlServerImpl();
		return pTypeDao.findIdByTypeName(name);
	}
}
