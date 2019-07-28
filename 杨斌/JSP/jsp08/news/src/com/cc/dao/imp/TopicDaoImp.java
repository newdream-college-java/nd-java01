package com.cc.dao.imp;
import java.util.ArrayList;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.TopicDao;
import com.cc.entity.News;
import com.cc.entity.Topic;
public class TopicDaoImp extends BaseDao implements TopicDao {
	@Override
	public int save(String name) {		
		try {
			conn();
			String sql="insert into topic values(null,?)";
			st=conn.prepareStatement(sql);
			st.setString(1,name);
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(null, conn, st);
		}	
		return result;
	}
	public boolean getName(String name) {
		boolean falg=false;		
		try {
			conn();
			StringBuffer sql=new StringBuffer("select * from Topic where tname=?");

				st=conn.prepareStatement(sql.toString());
				st.setString(1,name);
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

	@Override
	public List<String> list() {
		List<String> alist=new ArrayList<String>();
		try {
			conn();
			StringBuffer sql=new StringBuffer("select * from Topic");
				st=conn.prepareStatement(sql.toString());
				rs=st.executeQuery();
				while(rs.next()){
					alist.add(rs.getString("tname"));
				}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(rs,conn,st);
		}	
		return alist;
	}
	public int id(String name) {
		int id=-1;
		try {
			conn();
			String sql="select tid from topic where tname=?";
			st=conn.prepareStatement(sql);
			st.setString(1,name);
			rs=st.executeQuery();
			if(rs.next()){
				id=rs.getInt("tid");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(null, conn, st);
		}	
		return id;
	}
	public List<Topic> limitTopic(int page,int pagesize) {
		Topic topic=null;
		List<Topic> alist=new ArrayList<Topic>();
		try {
			conn();
			String sql="select * from topic limit ?,?";
				st=conn.prepareStatement(sql);
				st.setInt(1, (page-1)*pagesize);
				st.setInt(2, pagesize);
				rs=st.executeQuery();
				while(rs.next()){
					topic=new Topic();
					topic.setId(rs.getInt("tid"));
					topic.setName(rs.getString("tname"));
					alist.add(topic);
				}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(rs,conn,st);
		}	
		return alist;
	}
	public Integer count(int pagesize) {
		int count=0;
		try {
			conn();
			String sql="select ceil(count(*)/?) cot from topic";
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
	public int delete(int tid) {		
		try {
			conn();
			String sql="delete from topic where tid=?";
			st=conn.prepareStatement(sql);
			st.setInt(1,tid);
			result=st.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeAll(null, conn, st);
		}	
		return result;
	}
	public static void main(String[] args){
		List<Topic> list=new TopicDaoImp().limitTopic(1, 3);
		System.out.println(list);
	}
}
