package com.cc.dao.imp;
import java.util.ArrayList;
import java.util.List;
import com.cc.dao.BaseDao;
import com.cc.dao.TopicDao;
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
	public static void main(String[] args){
		int id=new TopicDaoImp().id("¹ú¼Ê");
		System.out.println(id);
	}
}
