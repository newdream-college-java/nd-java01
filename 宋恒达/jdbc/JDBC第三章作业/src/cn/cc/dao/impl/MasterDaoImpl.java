package cn.cc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.cc.dao.BaseDao;
import cn.cc.dao.MasterDao;
import cn.cc.entity.Master;

/**
* @author mob
* @version 2019年5月13日 下午7:12:42
* @description
*/
public class MasterDaoImpl implements MasterDao{

	@Override
	public Master findMaster(Master master) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Master find_master=null;
		try {
			conn=BaseDao.getConnection();
			String sql="select * from master where name=? and password=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, master.getName());
			ps.setString(2, master.getPassword());
			rs=ps.executeQuery();
			if(rs.next()) {
				find_master=new Master();
				find_master.setId(rs.getInt("id"));
				find_master.setMoney(rs.getInt("money"));
				find_master.setName(rs.getString("name"));
				find_master.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.closeAll(conn, ps, rs);
		}
		return find_master;
	}
	public static void main(String[] args) {
		MasterDao masterDao=new MasterDaoImpl();
		Master master=new Master();
		master.setName("图灵宝宝");
		master.setPassword("1111");
		System.out.println(masterDao.findMaster(master));
	}
}
