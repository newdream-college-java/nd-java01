package cn.cc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.cc.dao.BaseDao;
import cn.cc.dao.PetTypeDao;
import cn.cc.entity.Master;

public class PetTypeDaoSqlServerImpl implements PetTypeDao {


	public int findIdByTypeName(String name) {
		int id=0;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		String sql="select id from type where typeName=?";
		try {
			conn=BaseDao.getConnection();
			st=conn.prepareStatement(sql);
			st.setString(1,name);
			rs=st.executeQuery();
			if(rs.next()) {
				id=rs.getInt("id");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			BaseDao.doseAll(rs,conn,st);
		}
		return id;
	}
	
}
