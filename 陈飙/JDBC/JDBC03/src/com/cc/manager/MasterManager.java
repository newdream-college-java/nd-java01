package com.cc.manager;

import com.cc.dao.MasterInfoDao;
import com.cc.dao.impl.MasterInfoDaoImpl;
import com.cc.enity.MasterInfo;

public class MasterManager {
	public boolean login(String loginName,String password){
		MasterInfo mas=new MasterInfo();
		mas.setName(loginName);
		mas.setPassword(password);
		MasterInfoDao masDao=new MasterInfoDaoImpl();
		MasterInfo master=masDao.select(mas);
		boolean isLogin=master==null?false:true;
		return isLogin;
		
	}
	
	
}
