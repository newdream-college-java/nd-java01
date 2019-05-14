package cn.cc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.cc.dao.BaseDao;
import cn.cc.dao.PetTypeDao;

/**
* @author mob
* @version 2019年5月13日 下午7:51:40
* @description
*/
public class PetTypeDaoImpl implements PetTypeDao{

	@Override
	public int findIdByTypeName(String name) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int id=-1;
		try {
			conn=BaseDao.getConnection();
			String sql="select id from type where typeName=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			if(rs.next()) {
				id=rs.getInt("id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}

}
