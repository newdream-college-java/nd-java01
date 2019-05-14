package cn.cc.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import cn.cc.dao.BaseDao;
import cn.cc.dao.MasterDao;
import cn.cc.entity.Master;
public class MasterDaoSqlServerImpl implements MasterDao{

	@Override
	public Master findMaster(Master master) {
		Master find=null;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		String sql="select * from Master where name=? and password=?";
		try {
			conn=BaseDao.getConnection();
			st=conn.prepareStatement(sql);
			st.setString(1, master.getName());
			st.setString(2, master.getPassword());
			rs=st.executeQuery();
			if(rs.next()) {
				find=new Master();
				find.setId(rs.getInt("id"));
				find.setName(rs.getString("name"));
				find.setPassword(rs.getString("password"));
				find.setMoney(rs.getInt("money"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			BaseDao.doseAll(rs,conn,st);
		}
		return find;
	}

}
