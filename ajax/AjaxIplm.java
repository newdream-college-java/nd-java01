package com.cc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cc.dao.AjaxDao;
import com.cc.dao.BaseDao;
import com.cc.entity.Ajax;

public class AjaxIplm extends BaseDao implements AjaxDao {

	public int list(String name) {
		int result=0;
		int count=0;
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		getConn();
		String sql="select count(*) num from ajax where name=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1,name);
			rs=pst.executeQuery();
			if(rs.next()){
				count = rs.getInt("num");
			}
			
			if(count>0){
				System.out.println("该用户已经存在");
			}else{
				System.out.println("该用户不存在");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return count;
	}
		
}
