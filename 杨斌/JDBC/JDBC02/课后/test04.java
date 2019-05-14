package Kh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cc.dao.BaseDao;

public class test04 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			conn=BaseDao.conn();
			String sql="select count(*) co from student limit 0,30";
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			if(rs.next()) {
				System.out.println("×ÜÒ³Êý:"+Math.ceil(rs.getInt("co")/30.0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			BaseDao.closeAll(conn, st, rs);
		}
	}
}
