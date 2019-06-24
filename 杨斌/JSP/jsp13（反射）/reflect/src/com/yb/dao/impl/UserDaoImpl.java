package com.yb.dao.impl;
import java.lang.reflect.Field;
import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;
import com.yb.dao.BaseDao;

public class UserDaoImpl extends BaseDao {
	public static void save(Object obj){
		Class c=obj.getClass();
		Field[] fl=c.getDeclaredFields();
		Field.setAccessible(fl,true);
		Connection conn=getConn();
		PreparedStatement st=null;
		StringBuffer sb=new StringBuffer();
		sb.append("insert into ");
	}
}
