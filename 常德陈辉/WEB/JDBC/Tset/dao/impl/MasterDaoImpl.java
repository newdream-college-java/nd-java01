package Tset.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Tset.dao.BaseDao;
import Tset.dao.MasterDao;
import Tset.enity.Master;

public class MasterDaoImpl implements MasterDao{

	@Override
	public Master findMaster(Master master) {
//		Master find_master=null;
//		String sql="select * from Master where name=? and password=?";
//		try {
//			
//			
//		} catch (Exception e) {
//			
//		}
		return null;
	}

	@Override
	public int save(Master master) {
		Connection conn = null;
        PreparedStatement pst = null;
        int result = -1;
        try {
            conn = BaseDao.getConn();
            String sql = "insert into master(name,password) values(?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1,master.getName());
            pst.setString(2,master.getPassword());
            result = pst.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeConn(null, pst, conn);
        }
		return result;
	}

	@Override
	public int update(Master master) {
		 Connection conn = null;
	        PreparedStatement pst = null;
	        int result = -1;
	        try {
	            conn = BaseDao.getConn();
	            String sql = "update master set name=? where id=?";
	            pst = conn.prepareStatement(sql);
	            pst.setString(1,master.getName());
	            pst.setInt(2,master.getId());
	            result = pst.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }finally {
	            BaseDao.closeConn(null, pst, conn);
	        }
		return result;
	}
	
}
