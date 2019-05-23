package Marriimp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



import entity.Marri;
import Dao.BaseDao;
import Dao.Marriface;

public class Marriimplement implements Marriface {

	public int delete(Marri marri) {
		// TODO Auto-generated method stub
		//Scanner input=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement ps=null;
		int rs=0;
		try {
			
			conn=BaseDao.getConn(); 
			String sql="delete from Marri where name=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1,marri.getName());
			rs=ps.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.closeConn(null, conn, ps);
		}
		return rs;
	}

	public int save(Marri marri) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement ps=null;
		int rs=0;
		try {
			conn=BaseDao.getConn(); 
			String sql="insert into marri(name) values(?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1,marri.getName());
			rs=ps.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			BaseDao.closeConn(null, conn, ps);
		}
		return rs;
	}

	public int update(Marri marri) {
		// TODO Auto-generated method stub
		Connection conn=BaseDao.getConn();
		PreparedStatement ps=null;
		int rs=0;
		String sql="update Marri set age=100 where name=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, marri.getName());
			rs=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(null, conn, ps);
		}
		
		return rs;
	}

}
