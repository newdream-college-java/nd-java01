package cn.cc.manager;

import cn.cc.dao.PetTypeDao;
import cn.cc.dao.impl.PetTypeDaoImpl;

/**
* @author mo
* @version 2019��5��13�� ����7:57:30
* @description
*/
public class PetTypeManager {
	public static int findId(String name) {
		PetTypeDao petTypeDao=new PetTypeDaoImpl();
		return petTypeDao.findIdByTypeName(name);
	}
}
