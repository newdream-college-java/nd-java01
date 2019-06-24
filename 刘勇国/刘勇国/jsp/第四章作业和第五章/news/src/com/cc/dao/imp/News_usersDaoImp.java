package com.cc.dao.imp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cc.dao.BaseDao;
import com.cc.dao.News_usersDao;
public class News_usersDaoImp extends BaseDao implements News_usersDao{
	public boolean getName(String uname,String upwd) {
		boolean falg=false;		
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			conn = BaseDao.getConn();
			StringBuffer sql=new StringBuffer("select * from news_users where uname=? and upwd=?");

				st=conn.prepareStatement(sql.toString());
				st.setString(1,uname);
				st.setString(2,upwd);
				rs=st.executeQuery();
			if(rs.next()){
				falg=true;
			}		
		} catch (Exception e) {

		}finally{
			closeConn(rs, conn, st);
		}	
		return falg;
	}
}
