package cn.song.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
* @author mo
* @version 2019年5月14日 下午7:21:13
* @description
*/
public class Test03 {
	public static void main(String[] args) {
		
	}
	public static int executeObject(String sql,Object[] objects) {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int result=-1;
		try {
			conn=BaseDao.getConnection();
			ps=conn.prepareStatement(sql);
			if(objects!=null) {
				for(int i=0;i<objects.length;i++) {
					ps.setObject(i+1, objects[i]);
				}
			}
			result=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
