package com.cc.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cc.Dao.BaseDao;
import com.cc.Dao.UserDao;
import com.cc.entity.Topic;
import com.cc.entity.User;

public class UserDaoImpl implements UserDao {
	List list=new ArrayList();
	@Override
	public User selectLogin(User user) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs=null;
		 User ur=null;
		boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select * from news_users where Uname=? and Upwd=?;";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getUname());
			pst.setString(2,user.getUpwd());
			 rs=pst.executeQuery();
			 while(rs.next()){
				 String name=rs.getString("Uname");
				 String pwd=rs.getString("Upwd");
				 //�˴������ô��������Ҳ�����ò����������
				 //���ô�������Ŀ����Լ����崩��Щ��Ȼ��Ѷ���ķ��������������
				 ur=new User();
				 ur.setUname(name);
				 ur.setUpwd(pwd);
				 list.add(ur);
				 //find=true;
			 }
			 System.out.println(list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(rs, pst, conn);
		}
		return ur;
	}
	
	@Override
	public boolean selectLogin1(User user) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs=null;
		 User ur=null;
		boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select * from news_users where Uname=? and Upwd=?;";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getUname());
			pst.setString(2,user.getUpwd());
			 rs=pst.executeQuery();
			 while(rs.next()){
				 String name=rs.getString("Uname");
				 String pwd=rs.getString("Upwd");
				 //�˴������ô��������Ҳ�����ò����������
				 //���ô�������Ŀ����Լ����崩��Щ��Ȼ��Ѷ���ķ��������������
				 ur=new User();
				 ur.setUname(name);
				 ur.setUpwd(pwd);
				 list.add(ur);
				 find=true;
			 }
			// System.out.println(list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(rs, pst, conn);
		}
		return find;
	}
	public static void main(String[] args) {
		User us=new User();
		us.setUname("����");
		us.setUpwd("123");
		UserDao usDao=new UserDaoImpl();
		boolean result=usDao.selectLogin1(us);
		System.out.println(result);
	}

	@Override
	public ResultSet getTopics() {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs=null;
		Topic tp=null;
		//boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select * from topic ";
			pst = conn.prepareStatement(sql);
			
			 rs=pst.executeQuery();
			 while(rs.next()){
				 int id=rs.getInt("Tid");
				 String name=rs.getString("Tname");
				 //�˴������ô��������Ҳ�����ò����������
				 //���ô�������Ŀ����Լ����崩��Щ��Ȼ��Ѷ���ķ��������������
				  tp=new Topic();
				  tp.setTid(id);
				 tp.setTname(name);
				 list.add(tp);
				 //find=true;
			 }
			 System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
		BaseDao.closeConn(rs, pst, conn);
		
		}	
		return rs;
		
	}
}
