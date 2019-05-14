package cn.cc.dao.imgl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cn.cc.dao.StudentDao;
import cn.cc.entity.Studen;

public class StudenDaoSqlServerimgl implements StudentDao{

	@Override
	public int update(Studen studen) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pst=null;
		Scanner input=new Scanner(System.in);
		int result=-1;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn=DriverManager.getConnection(url,"root","z382698.");
			System.out.println("ÇëÊäÃû×Ö£º");
			studen.setName(input.next());
			System.out.println("ÇëÊäid");
			studen.setId(input.nextInt());
			String sql="update  studen  set name=? where id=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, studen.getName());
			pst.setInt(2,studen.getId());
			result=pst.executeUpdate();
			if(result!=0) {
				System.out.println("ÐÞ¸Ä³É¹¦");
			}else {
				System.out.println("ÐÞ¸ÄÊ§°Ü");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public List<Studen> select() {
		Connection conn=null;
		PreparedStatement pst=null;
		List<Studen> studen=new ArrayList<Studen>();
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn=DriverManager.getConnection(url,"root","z382698.");
			String sql="select * from studen";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
				Studen s=new Studen();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				studen.add(s);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return studen;
	}

	
	
	

}
