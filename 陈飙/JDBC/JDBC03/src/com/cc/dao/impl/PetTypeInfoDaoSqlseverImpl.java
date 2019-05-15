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
			//查询语句的结果要在下面的get语句中有，不然会获得不匹配的错误
			String sql ="select * from type where typeName=?";
			pst = conn.prepareStatement(sql);
			
			pst.setString(1,petInfo.getTypeName());
			ResultSet rs = pst.executeQuery();
			//MasterInfo s1 = null;
			//运用到循环
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
		//返回集合
		return s1;
	}*/

	@Override
	public int findIdByTypeName(String name) {
		//1.获得链接
		Connection conn=null;
		PreparedStatement pst=null;
		 ResultSet rs=null;
		 int id=0;
		//2.执行语句
		String sql="select id from type where typeName=?";
		//3.预处理sql语句
		try {
			conn=BaseDao.getConn();
			 pst=conn.prepareStatement(sql);
			 //4.填入参数
			 pst.setString(1, name);
			 //5.返回结果集
			  rs=pst.executeQuery();
			  //6.获取查询的结果
			  while(rs.next()){
				   id=rs.getInt("id");
			  }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}
}
