package cn.song.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
* @author mo
* @version 2019年5月14日 下午6:56:57
* @description
*/
public class Test01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("宠物主人登录");
		System.out.print("请输入姓名");
		String name=input.next();
		System.out.println("请输入密码");
		String password=input.next();
		Connection conn=null;
		PreparedStatement ps=null;
//		Statement st=null;
		ResultSet rs=null;
		boolean flag=false;
		try {
			conn=BaseDao.getConnection();
//			String sql="select * from master where name='"+name+"' and password='"+password+"'";
			String sql="select * from master where name=? and password=?";
			System.out.println(sql);
			ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
//			st=conn.createStatement();
//			rs=st.executeQuery(sql);
			rs=ps.executeQuery();
			if(rs.next()) {
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag) {
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}
	}
}
