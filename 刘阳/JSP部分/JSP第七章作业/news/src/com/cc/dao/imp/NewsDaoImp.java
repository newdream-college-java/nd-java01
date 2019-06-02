package com.cc.dao.imp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.NewsDao;
import com.cc.entity.News;
public class NewsDaoImp extends BaseDao implements NewsDao {
	public List<News> list(int page,int pageSize) {
		News news=null;
		List<News> alist=new ArrayList<News>();
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			conn = BaseDao.getConn();
			String sql="select * from news limit ?,? ";
				st=conn.prepareStatement(sql);
				st.setInt(1,(page-1)*pageSize);
				st.setInt(2,pageSize);
				rs=st.executeQuery();
				while(rs.next()){
					news=new News();
					news.setNtitle(rs.getString("ntitle"));
					news.setDate(rs.getString("ncreatedate"));
					news.setUtitle(rs.getString("Nauthor"));
					news.setNtid(rs.getInt("Ntid"));
					news.setNcontent(rs.getString("Ncontent"));
					news.setNsummary(rs.getString("Nsummary"));
					news.setNpicpath(rs.getString("Npicpath"));
					news.setNid(rs.getInt("Nid"));

					alist.add(news);
				}
		} catch (Exception e) {
		}finally{
			closeConn(rs,conn,st);
		}	
		return alist;
	}
	@Override
	public int add(int ntid,String ntitle,String nauthor,String ncontent,String nsummary) {
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String datetime=df.format(new Date());
		 Connection conn=null;
			PreparedStatement st=null;
			int result=-1;
		try {
			conn = BaseDao.getConn();
			String sql="insert into news VALUES(null,?,?,?,?,null,?,null,?);";
			st=conn.prepareStatement(sql);
			st.setInt(1,ntid);
			st.setString(2,ntitle);
			st.setString(3,nauthor);		
			st.setString(4,datetime);
			st.setString(5,ncontent);
			st.setString(6,nsummary);
			result=st.executeUpdate();
		} catch (Exception e) {
		}finally{
			closeConn(null, conn, st);
		}	
		return result;
	}
	public int count() {
		int count=0;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			conn = BaseDao.getConn();
			String sql="select count(*) cot from news";
				st=conn.prepareStatement(sql);
				rs=st.executeQuery();
				while(rs.next()){
					count=rs.getInt("cot");
				}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeConn(rs,conn,st);
		}	
		return count;
	}
	
	public int insertNews(News n){
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		NewsDaoImp alist=new NewsDaoImp();
		System.out.println(alist.list(1,3));
		
	}
}
