package com.cc.manager;

import com.cc.dao.MasterInfoDao;
import com.cc.dao.PetTypeInfoDao;
import com.cc.dao.impl.MasterInfoDaoImpl;
import com.cc.dao.impl.PetTypeInfoDaoSqlseverImpl;
import com.cc.enity.MasterInfo;
import com.cc.enity.PetTypeInfo;

public class PetTypeManager {
	public int findId(String name){
		PetTypeInfoDao pTypeDao=new PetTypeInfoDaoSqlseverImpl();
		return pTypeDao.findIdByTypeName(name);
		
	}
}
