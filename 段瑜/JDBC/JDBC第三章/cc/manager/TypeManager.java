package cn.cc.manager;



import java.util.Scanner;

import cn.cc.dao.typeDao;
import cn.cc.dao.imgl.TypeDaoSqlServerImpl;
import cn.cc.entity.Master;
import cn.cc.entity.Type;

public class TypeManager {
	public int findId(String typename) {
		typeDao typeDao=new TypeDaoSqlServerImpl();
		return typeDao.findIdByTypeName(typename);	
	}
}
