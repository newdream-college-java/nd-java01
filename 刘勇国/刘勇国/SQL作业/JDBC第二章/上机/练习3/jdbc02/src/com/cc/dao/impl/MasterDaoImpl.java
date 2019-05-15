package com.cc.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cc.dao.BaseDao;
import com.cc.dao.MasterDao;
import com.cc.entity.Master;

public class MasterDaoImpl implements MasterDao {
	public Master findmaster(Master master) {
		Master find=null;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			conn=BaseDao.conn();
			String sql="select * from master where name=? and password=?";
			st=conn.prepareStatement(sql);
			st.setString(1, master.getName());
			st.setString(2, master.getPassword());
			rs=st.executeQuery();
			while(rs.next()) {
				find=new Master();
				find.setId(rs.getInt("id"));
				find.setName(rs.getString("name"));
				find.setPassword(rs.getString("password"));
				find.setMoney(rs.getInt("money"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			BaseDao.closeAll(conn, st, rs);
		}
		return find;
	}
	
}
