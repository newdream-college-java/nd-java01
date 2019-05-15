package com.cc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.PetTypeInfoDao;
import com.cc.enity.MasterInfo;
import com.cc.enity.PetTypeInfo;

public class PetTypeInfoDaoSqlseverImpl extends BaseDao implements PetTypeInfoDao{

	//@Override
	/*public PetTypeInfo select(PetTypeInfo petInfo) {
		
		List list = new ArrayList();
		Connection conn = null;
		PetTypeInfo s1 = null;
		PreparedStatement pst = null;
		
		try {
			conn = BaseDao.getConn();
			//String sql = "select * from master;";
			//��ѯ���Ľ��Ҫ�������get������У���Ȼ���ò�ƥ��Ĵ���
			String sql ="select * from type where typeName=?";
			pst = conn.prepareStatement(sql);
			
			pst.setString(1,petInfo.getTypeName());
			ResultSet rs = pst.executeQuery();
			//MasterInfo s1 = null;
			//���õ�ѭ��
			while (rs.next()) {

				int id = rs.getInt(1);
				
				String name=rs.getString("typeName");
				s1=new PetTypeInfo(id, null);
				s1.setId(id);
				list.add(s1);
			}
			System.out.println(list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			BaseDao.closeConn(null, pst, conn);
		}
		//���ؼ���
		return s1;
	}*/

	@Override
	public int findIdByTypeName(String name) {
		//1.�������
		Connection conn=null;
		PreparedStatement pst=null;
		 ResultSet rs=null;
		 int id=0;
		//2.ִ�����
		String sql="select id from type where typeName=?";
		//3.Ԥ����sql���
		try {
			conn=BaseDao.getConn();
			 pst=conn.prepareStatement(sql);
			 //4.�������
			 pst.setString(1, name);
			 //5.���ؽ����
			  rs=pst.executeQuery();
			  //6.��ȡ��ѯ�Ľ��
			  while(rs.next()){
				   id=rs.getInt("id");
			  }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}
}
