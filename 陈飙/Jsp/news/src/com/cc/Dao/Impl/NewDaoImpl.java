package com.cc.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cc.Dao.BaseDao;
import com.cc.Dao.NewDao;
import com.cc.entity.New;

public class NewDaoImpl implements NewDao {

	@Override
	public ResultSet select() {
		List list=new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs=null;
		New nw=null;
		//boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select nsummary,nid from news;";//�˴�ֻ�ܲ�ѯTname
			pst = conn.prepareStatement(sql);
			
			 rs=pst.executeQuery();
			 while(rs.next()){
			 	int id=rs.getInt("nid");
				String ns=rs.getString("nsummary");
				 //�˴������ô��������Ҳ�����ò����������
				 //���ô�������Ŀ����Լ����崩��Щ��Ȼ��Ѷ���ķ��������������
				  nw= new New();
				 nw.setNid(id);
				 nw.setNsummary(ns);
				 /*  tp=new Topic();
				  tp.setTid(id);
				 tp.setTname(name); */
				 list.add(nw);
				 //find=true;
			 }
			 System.out.println(list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
		//BaseDao.closeConn(rs, pst, conn);
		
		}	
		return rs;
	}
	public static void main(String[] args) {
		New ne=new New();
		ResultSet rs1=new NewDaoImpl().select();
		//System.out.println(rs1);
	}

}
