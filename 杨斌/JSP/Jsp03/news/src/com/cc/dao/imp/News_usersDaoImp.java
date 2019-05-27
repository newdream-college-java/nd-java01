package com.cc.dao.imp;
import com.cc.dao.BaseDao;
import com.cc.dao.News_usersDao;
public class News_usersDaoImp extends BaseDao implements News_usersDao{
	public boolean getName(String uname,String upwd) {
		boolean falg=false;		
		try {
			conn();
			StringBuffer sql=new StringBuffer("select * from news_users where uname=? and upwd=?");

				st=conn.prepareStatement(sql.toString());
				st.setString(1,uname);
				st.setString(2,upwd);
				rs=st.executeQuery();
			if(rs.next()){
				falg=true;
			}		
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(rs, conn, st);
		}	
		return falg;
	}
}
