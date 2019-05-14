package Kh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cc.dao.BaseDao;

public class test03 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			conn=BaseDao.conn();
			String sql="select count(id) id,count(name) name from student";
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			if(rs.next()) {
				System.out.println("idÊý:"+rs.getInt("id")+"\n"+"nameÊý:"+rs.getInt("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			BaseDao.closeAll(conn, st, rs);
		}
	}
}
