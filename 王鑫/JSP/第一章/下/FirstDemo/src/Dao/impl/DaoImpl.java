package Dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.BaseDao;

public class DaoImpl implements BaseDao{

	private Connection conn;
	private PreparedStatement ps;
	public void getConn(){
		String url = "jdbc:mysql://127.0.0.1:3306/datebase?useUnicode=true&characterEncoding=utf8&useSLL=true";
		String username = "root";
		String password = "123456";	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public void flow(){
		try {
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//增加
	public int raize(String name,int age , String date){
		getConn();
		try {
			String sql = "INSERT into stu_info VALUES(NULL,"+name+","+age+","+date+");";
			ps = conn.prepareStatement(sql);
			int rs = ps.executeUpdate();
			if (rs>0) {
				return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flow();
		return 0;
	}
	//删除
	public int delete(int n){
		getConn();
		String sql = "delete from stu_info where sid = "+n+";";
		try {
			ps = conn.prepareStatement(sql);
			int rs = ps.executeUpdate();
			if (rs>0) {
				return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flow();
		return 0;
		
	}
	//修改
	public int modify(int id, String name, int age, String date){
		getConn();
		String sql = "update stu_info set sname = '"+name+"', sage = "+age+", sbirthday = '"+date+"' where sid = "+id+";";
		try {
			ps = conn.prepareStatement(sql);
			int rs = ps.executeUpdate();
			if (rs>0) {
				return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flow();
		return 0;
	}
	//查看
	public void see(int n){
		getConn();
		String sql = "select * from stu_info where sid="+n+";";
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				System.out.println("学生id："+rs.getString(1)+"\t姓名："+rs.getString(2)+"\t年龄："+rs.getString(3)+"\t\t出生日期："+rs.getString(4));
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flow();
	}
}
