package cn.cc.manager;

import cn.cc.dao.PetTypeDao;
import cn.cc.dao.impl.PetTypeDaoSqlServerImpl;

public class PeTypeManager {
	public int findId(String name) {
		PetTypeDao pt=new PetTypeDaoSqlServerImpl();
		return pt.findIdByTypeName(name);
	}
}
