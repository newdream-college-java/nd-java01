package cn.song.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
* @author mo
* @version 2019年5月14日 下午7:26:32
* @description
*/
public class Test04 {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			conn=BaseDao.getConnection();
			String sql="select * from student limit 0,30";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("学生信息为"+rs.getInt("id")+"-"+rs.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.release(conn, ps, rs);
		}
	}
}
