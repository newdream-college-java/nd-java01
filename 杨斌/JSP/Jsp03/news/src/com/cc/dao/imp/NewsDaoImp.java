package com.cc.dao.imp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.NewsDao;
import com.cc.entity.News;
public class NewsDaoImp extends BaseDao implements NewsDao {
	public List<News> list() {
		News news=null;
		List<News> alist=new ArrayList<News>();
		try {
			conn();
			StringBuffer sql=new StringBuffer("select * from news");
				st=conn.prepareStatement(sql.toString());
				rs=st.executeQuery();
				while(rs.next()){
					news=new News();
					news.setUtitle(rs.getString("ntitle"));
					news.setDate(rs.getString("ncreatedate"));
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
	public int add(int ntid,String ntitle,String nauthor,String ncontent,String nsummary) {
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		 String datetime=df.format(new Date());
		try {
			conn();
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
			// TODO: handle exception
		}finally{
			closeAll(null, conn, st);
		}	
		return result;
	}
	public static void main(String[] args){
		System.out.println(new NewsDaoImp().add(9,"姚明全家福","杨斌","3333","6666"));
			
	}

	
}
