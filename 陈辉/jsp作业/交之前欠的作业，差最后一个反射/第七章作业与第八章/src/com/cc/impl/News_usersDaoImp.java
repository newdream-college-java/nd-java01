package com.cc.impl;

import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.NewsDao;

public class News_usersDaoImp extends BaseDao implements NewsDao{
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

	public int add(int ntid, String ntitle, String nauthor, String filePath,
			String ncontent, String nsummary) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Integer count(int pagesize) {
		// TODO Auto-generated method stub
		return null;
	}

	public <News> List<News> list(int page, int pagesize) {
		// TODO Auto-generated method stub
		return null;
	}
}
