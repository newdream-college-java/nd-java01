package Tset.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Tset.dao.BaseDao;
import Tset.dao.MasterDao;
import Tset.enity.Master;

public class MasterDaoImpl implements MasterDao{

	@Override
	public Master findMaster(Master master) {
		List<Master> list=new ArrayList<Master>();
		Master find_master=null;
		PreparedStatement pst = null;
		Connection conn=null;
		ResultSet rs=null;
		try {
			String sql="select * from Master where name=? and password=?";
			conn = BaseDao.getConn();
			pst=conn.prepareStatement(sql);
			pst.setString(1,master.getName());
			pst.setString(2,master.getPassword());
			rs=pst.executeQuery();
			if(rs.next()){
				find_master=new Master();
				find_master.setId(rs.getInt("id"));
				find_master.setName(rs.getString("name"));
				find_master.setPassword(rs.getString("password"));
				find_master.setMoney(rs.getInt("money"));
				list.add(find_master);
				System.out.println("登入成功");
			}else{
				System.out.println("登入失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
			BaseDao.closeConn(rs, pst, conn);
		}
		return find_master;
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
