package cn.cc.dao.imgl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import cn.cc.dao.BaseDao;
import cn.cc.dao.MasterDao;
import cn.cc.entity.Master;

public class MasterDaoSqlServerImpl implements MasterDao{

	@Override
	public int save(Master master) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			conn=BaseDao.getConn();
			conn.setAutoCommit(false);
			String sql="insert into master(name,mpassword) values(?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,master.getName());
			pst.setString(2,master.getPassword());
			result=pst.executeUpdate();
			if(result==0) {
				conn.rollback();
			}else {
				conn.commit();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			BaseDao.doseAll(null, pst, conn);
		}
		return result;
	}

	@Override
	public int update(Master master) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			 conn = BaseDao.getConn();
			 String sql="Update master set name=? where mpassword=?";
			 pst=conn.prepareStatement(sql);
			 pst.setString(1,master.getName());
			 pst.setString(2, master.getPassword());
			 result=pst.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			BaseDao.doseAll(null, pst, conn);
		}
		return result;
	}

	@Override
	public int select(Master master) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			 conn = BaseDao.getConn();
			 String sql="select name,mpassword from master  where name=?,mpassword=?";
			 pst=conn.prepareStatement(sql);
			 pst.setString(1,master.getName());
			 pst.setString(2,master.getPassword());
			 result=pst.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			BaseDao.doseAll(null, pst, conn);
		}
		return result;
	}

}
