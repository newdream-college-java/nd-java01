package com.cc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.MasterInfoDao;
import com.cc.enity.MasterInfo;

public class MasterInfoDaoImpl implements MasterInfoDao {
	//List list = new ArrayList();

	@Override
	public int save(MasterInfo masInfo) {
		Connection conn = null;
		PreparedStatement pst = null;
		int result = -1;
		try {
			conn = BaseDao.getConn();
			String sql = "insert into ta(name) values(?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, masInfo.getName());
			result = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return result;
		} finally {
			BaseDao.closeConn(null, pst, conn);
		}
		return result;
	}

	@Override
	public int update(MasterInfo masInfo) {
		Connection conn = null;
		PreparedStatement pst = null;
		int result = -1;
		try {
			conn = BaseDao.getConn();
			String sql = "update ta set name=? where id=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, masInfo.getName());
			pst.setInt(2, masInfo.getId());
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeConn(null, pst, conn);
		}
		return result;
	}

	@Override
	public int delete(MasterInfo masInfo) {
		Connection conn = null;
		PreparedStatement pst = null;
		int result = -1;
		try {
			conn = BaseDao.getConn();
			String sql = "delete from ta where name=?;";
			pst = conn.prepareStatement(sql);
			pst.setString(1, masInfo.getName());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			BaseDao.closeConn(null, pst, conn);
		}
		return result;
	}

	@Override
	//返回的是一个对象，因为用对象名做类型
	public MasterInfo select(MasterInfo masInfo) {
		//运用到集合
		List list = new ArrayList();
		Connection conn = null;
		MasterInfo s1 = null;
		PreparedStatement pst = null;
		try {
			conn = BaseDao.getConn();
			//String sql = "select * from master;";
			String sql ="select * from master where name=? and `password`=?;";
			pst = conn.prepareStatement(sql);
			pst.setString(1, masInfo.getName());
			pst.setString(2,masInfo.getPassword());
			ResultSet rs = pst.executeQuery();
			//MasterInfo s1 = null;
			//运用到循环
			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString("name");
				String password = rs.getString("password");
				int money = rs.getInt("money");

				s1 = new MasterInfo(id, name, password, money);
				s1.setId(id);
				list.add(s1);
			}
			System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			BaseDao.closeConn(null, pst, conn);
		}
		//返回集合
		return s1;
	}

	/*
	 * @Override public int save(MasterInfo masInfo) { Connection conn = null;
	 * PreparedStatement pst = null; int result = -1; try { conn =
	 * MasterDao.getConn(); String sql = "insert into stu_info(name) values(?)";
	 * pst = conn.prepareStatement(sql); pst.setString(1,masInfo.getName());
	 * result = pst.executeUpdate();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); return result; } return
	 * result; }
	 * 
	 * @Override public int update(MasterInfo masInfo) { Connection conn = null;
	 * PreparedStatement pst = null; int result = -1; try { conn =
	 * MasterDao.getConn(); String sql =
	 * "update stu_info set name=? where id=?"; pst =
	 * conn.prepareStatement(sql); pst.setString(1,masInfo.getName());
	 * pst.setInt(2,masInfo.getId()); result = pst.executeUpdate(); } catch
	 * (Exception e) { e.printStackTrace(); }finally { MasterDao.closeConn(null,
	 * pst, conn); } return result; }
	 */
}
