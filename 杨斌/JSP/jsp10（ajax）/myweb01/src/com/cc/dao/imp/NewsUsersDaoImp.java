package com.cc.dao.imp;
import com.cc.dao.BaseDao;
import com.cc.dao.NewsUsersDao;
public class NewsUsersDaoImp extends BaseDao implements NewsUsersDao{
	public boolean getName(String uname) {
		boolean falg=true;		
		try {
			
			getConn();
			String sql="select * from news_users where uname like ?";

				st=conn.prepareStatement(sql);
				st.setString(1,"%"+uname+"%");
				rs=st.executeQuery();
				
			if(rs.next()){
				falg=false;
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeAll(rs, conn, st);
		}	
		return falg;
	}
}
