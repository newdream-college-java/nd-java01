package biao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class TopicDaoImp extends BaseDao implements Wedjk {


//添加
	public int save(String name) {	
		Connection conn = null;
		PreparedStatement pst = null;
		int result=-1;
		try {
			conn = BaseDao.getConn();
			String sql = "insert into topic values(NULL,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, name);
			result = pst.executeUpdate();	
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(null, pst, conn);
		}
		return result;
	}
	
//查询
	public boolean save1(String name) {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs=null;
		boolean b=false;	
		try {
			conn =BaseDao.getConn();
			StringBuffer sql=new StringBuffer("select * from Topic where tname=?");
			pst=conn.prepareStatement(sql.toString());
			pst.setString(1,name);
			rs=pst.executeQuery();
			if(rs.next()){
				b=true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			closeConn(null, pst, conn);
		}	
		return b;
	}
//	public static void main(String[] args){
//
//
//		System.out.println(save1("主题1"));
//	}

}








