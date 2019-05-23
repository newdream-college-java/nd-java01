package com.cc.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import com.cc.dao.BaseDao;
import com.cc.dao.PersonDao;
import com.cc.entity.Person;

public class PersonDaoImpl implements PersonDao {
	//增加
	@Override
	public int save(Person person) {
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			conn=BaseDao.getConn();
			String sql="insert into Preson values(NULL,?,?,?)";
			 pst=conn.prepareStatement(sql);
			 pst.setString(1, person.getName());
			 pst.setInt(2, person.getIsMarried());
			 pst.setInt(3, person.getAge());
			 result=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(null, pst, conn);
		}
		return result;//用于测试
	}
	public static void main(String[] args) {
		int result=new PersonDaoImpl().update(new Person("6哥",0,50));
		System.out.println(result);
	}
	
	//删除
	@Override
	public int delete(Person person) {
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			conn=BaseDao.getConn();
			String sql="delete from preson where name=? and age=?";
			 pst=conn.prepareStatement(sql);
			 pst.setString(1, person.getName());
			 pst.setInt(2, person.getAge());
			 result=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(null, pst, conn);
		}
		return result;
	}
	//修改
	@Override
	public int update(Person person) {
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			conn=BaseDao.getConn();
			String sql="update preson set name=? where age=?";
			 pst=conn.prepareStatement(sql);
			 pst.setString(1, person.getName());
			 pst.setInt(2, person.getAge());
			 result=pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(null, pst, conn);
		}
		return result;
		
	}

}
