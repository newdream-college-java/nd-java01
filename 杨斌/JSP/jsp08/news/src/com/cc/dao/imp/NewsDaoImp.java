package com.cc.dao.imp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.NewsDao;
import com.cc.entity.News;
public class NewsDaoImp extends BaseDao implements NewsDao {
	public List<News> list(int page,int pagesize) {
		News news=null;
		List<News> alist=new ArrayList<News>();
		try {
			conn();
			String sql="select * from news limit ?,?";
				st=conn.prepareStatement(sql);
				st.setInt(1, (page-1)*pagesize);
				st.setInt(2, pagesize);
				rs=st.executeQuery();
				while(rs.next()){
					news=new News();
					news.setNtitle(rs.getString("ntitle"));
					news.setNcreatdate(rs.getString("ncreatedate"));
					news.setNauthor(rs.getString("Nauthor"));
					news.setNtid(rs.getInt("Ntid"));
					news.setNcontent(rs.getString("Ncontent"));
					news.setNsummary(rs.getString("Nsummary"));
					news.setNpicpath(rs.getString("Npicpath"));
					news.setNid(rs.getInt("Nid"));
					news.setNauthor(rs.getString("Nauthor"));
					alist.add(news);
				}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(rs,conn,st);
		}	
		return alist;
	}
	@Override
	public int add(int ntid,String ntitle,String nauthor,String filePath,String ncontent,String nsummary) {
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		 String datetime=df.format(new Date());
		try {
			conn();
			String sql="insert into news VALUES(null,?,?,?,?,?,?,null,?);";
			st=conn.prepareStatement(sql);
			st.setInt(1,ntid);
			st.setString(2,ntitle);
			st.setString(3,nauthor);		
			st.setString(4,datetime);
			st.setString(5,filePath);
			st.setString(6,ncontent);
			st.setString(7,nsummary);
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(null, conn, st);
		}	
		return result;
	}
	
	public Integer count(int pagesize) {
		int count=0;
		try {
			conn();
			String sql="select ceil(count(*)/?) cot from news";
				st=conn.prepareStatement(sql);
				st.setInt(1, pagesize);
				rs=st.executeQuery();
				if(rs.next()){
					count=rs.getInt("cot");
				}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(rs,conn,st);
		}	
		return count;
	}
	public static void main(String[] args){
		System.out.println(new NewsDaoImp().count(3));
			
	}
	

	
}
