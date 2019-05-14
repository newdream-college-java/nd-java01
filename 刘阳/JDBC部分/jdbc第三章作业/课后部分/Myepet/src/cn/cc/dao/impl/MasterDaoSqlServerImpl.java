package cn.cc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.cc.dao.BaseDao;
import cn.cc.dao.MasterDao;
import cn.cc.entity.Master;

public class MasterDaoSqlServerImpl implements MasterDao {
	private static final ResultSet rs = null;


	public int save(Master master) {
        Connection conn = null;
        PreparedStatement pst = null;
        int result = -1;
        try {
            conn = BaseDao.getConnection();
            String sql = "insert into master (name,password) values(?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1,master.getName());
            pst.setString(2,master.getPassword());
            result = pst.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(null, pst, conn);
        }
        return result;
    }


	public Master findMaster(Master master) {
//		Master find_master=null;
//		String sql="select * from Master where name=? and password=?";
//		psmt_setString(1,master.getName());
		return null;
	}


	public int update(Master master) {
		Connection conn = null;
        PreparedStatement pst = null;
        int result = -1;
        try {
            conn = BaseDao.getConnection();
            String sql = "update master set name=? where id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,master.getName());
            pst.setInt(2,master.getId());
            result = pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(null, pst, conn);
        }
        return result;
    }


	@Override
	public int deleter(Master master) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public ResultSet cha(String name,String password) {
		Connection conn = null;
        PreparedStatement pst = null;
        boolean a=false;
        try {
            conn = BaseDao.getConnection();
            String sql = "select * from master where name=? and password=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,name);
            pst.setString(2,password);
            ResultSet rs= pst.executeQuery();
            rs.next();
            int result = rs.getInt(1);// 下标从1开始

            if (result > 0) {
                System.out.println("登录成功！！！");
            }else {
                System.out.println("登录失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeAll(null, pst, conn);
        }
		return rs;
        
    }
}
