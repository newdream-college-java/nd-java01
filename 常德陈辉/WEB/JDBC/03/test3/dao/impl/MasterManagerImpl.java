package test2.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Tset.dao.BaseDao;
import test2.dao.MasterManagerDao;
import test2.enity.MasterManager;

public class MasterManagerImpl implements MasterManagerDao{

	public int findMasterManager(MasterManager mastermanager) {
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		MasterManager find=null;
		try {
			conn=BaseDao.getConn();
			String sql="select id from type where typename like ?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,mastermanager.getName());
			rs=pst.executeQuery();
			if(rs.next()){
				find=new MasterManager();
				find.setId(rs.getInt("id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(rs, pst, conn);
		}
		return find.getId();
	}

}
