package Kh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cc.dao.BaseDao;

public class test02 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			conn=BaseDao.conn();
			String sql="select count(*) co from dog";
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getInt("co"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			BaseDao.closeAll(conn, st, rs);
		}
	}
}
