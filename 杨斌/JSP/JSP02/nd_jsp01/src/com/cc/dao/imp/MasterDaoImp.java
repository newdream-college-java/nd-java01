package com.cc.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cc.dao.BaseDao;
import com.cc.dao.MasterDao;
import com.cc.entity.Master;
public class MasterDaoImp implements MasterDao {

	@Override
	public int save(Master master) {
		Connection conn=null;
		PreparedStatement st=null;
		int result=-1;
		try {
			conn=BaseDao.conn();
			String sql="insert into master values(null,?,?,?)";
			st=conn.prepareStatement(sql);
			st.setString(1, master.getName());
			st.setString(2, master.getPass());
			st.setInt(3, master.getMoney());
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			BaseDao.closeAll(null, conn, st);
		}	
		return result;
	}
	public int dropMt(Master master) {
		Connection conn=null;
		PreparedStatement st=null;
		int result=-1;
		try {
			conn=BaseDao.conn();
			String sql="delete from master where name=?";
			st=conn.prepareStatement(sql);
			st.setString(1, master.getName());
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			BaseDao.closeAll(null, conn, st);
		}	
		return result;
	}
	public int updateMt(Master master) {
		Connection conn=null;
		PreparedStatement st=null;
		int result=-1;
		try {
			conn=BaseDao.conn();
			String sql="update master set password=? where name=?";
			st=conn.prepareStatement(sql);
			st.setString(1, master.getPass());
			st.setString(2, master.getName());
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			BaseDao.closeAll(null, conn, st);
		}	
		return result;
	}
	public static void main(String[] args) {
		System.out.println(new MasterDaoImp().updateMt(new Master("¡ı¥∫¿Ÿ","jlallg")));
	}
	
}
