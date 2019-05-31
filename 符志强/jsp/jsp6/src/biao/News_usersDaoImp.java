package biao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


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

	public List<news>listByPage(int curPage, int pageSize) {
		List list=new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;	
		ResultSet rs=null;
		try {
			conn = BaseDao.getConn();	
			String sql=new String("select * from news limit ?,?");
				pst=conn.prepareStatement(sql);
				pst.setInt(1,(curPage-1)*pageSize);
				pst.setInt(2,pageSize);
				rs=pst.executeQuery();
			while(rs.next()){

				news s=new news();
				s.setNtitle(rs.getString("ntitle"));
				s.setNcreatedate(rs.getString("ncreatedate"));
				
				s.setNauthor(rs.getString("nauthor"));
				s.setNid(rs.getInt("nid"));
				s.setNsummary(rs.getString("nsummary"));
				s.setNcontent(rs.getString("ncontent"));
				s.setNtid(rs.getInt("ntid"));
				s.setNpicpath(rs.getString("npicpath"));
				s.setNmodifydate(rs.getString("nmodifydate"));
				list.add(s);
			}		
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeConn(rs, pst, conn);
		}	
		return list;
	}
	public Integer getmax(int count) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs=null;
		int i=0;
		try {
			conn = BaseDao.getConn();
			
			String sql=new String("select ceil(count(*)/?) a from news");

				pst=conn.prepareStatement(sql);
				pst.setInt(1, count);
				rs=pst.executeQuery();
				
				if(rs.next()){
				i=rs.getInt("a");
				}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeConn(rs, pst, conn);
		}	
		return i;
	}
	public static void main(String[] args) {
//		News_usersDaoImp n=new News_usersDaoImp();
//		System.err.println(n.listByPage(1, 1));
		News_usersDaoImp n=new News_usersDaoImp();
		System.err.println(n.getmax(3));
	}
}