package biao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class News_usersDaoImp extends BaseDao implements NewsDao{
	public boolean getName(String uname,String upwd) {
		Connection conn = null;
		PreparedStatement pst = null;
		boolean falg=false;	
		ResultSet rs=null;
		try {
			conn = BaseDao.getConn();
			
			StringBuffer sql=new StringBuffer("select * from news_users where uname=? and upwd=?");

				pst=conn.prepareStatement(sql.toString());
				pst.setString(1,uname);
				pst.setString(2,upwd);
				rs=pst.executeQuery();
			if(rs.next()){
				falg=true;
			}		
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeConn(rs, pst, conn);
		}	
		return falg;
	}

}
