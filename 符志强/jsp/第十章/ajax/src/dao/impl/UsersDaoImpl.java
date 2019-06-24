package dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import dao.UsersDao;
import entity.Users;

public class UsersDaoImpl extends BaseDao implements UsersDao {

	public String list(String uname) {
		//可拼接的字符串
		StringBuffer s=new StringBuffer();	
		
		try {
			getConn();
			String sql="select * from news_users where uname  like ?";
			st=conn.prepareStatement(sql);
			st.setString(1, uname+"%");
			rs=st.executeQuery();
		
			while(rs.next()){
				//拼接
				s.append(rs.getString("uname")+"-");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}
		
		return s.toString();
	}
	public static void main(String[] args) {
		UsersDaoImpl u=new UsersDaoImpl();
		System.out.println(u.list("a"));
	}
}
