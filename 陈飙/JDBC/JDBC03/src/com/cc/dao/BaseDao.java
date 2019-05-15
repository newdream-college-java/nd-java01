package com.cc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	public static Connection getConn(){
		  Connection conn = null;
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			 String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
				try {
					conn = DriverManager.getConnection(url, "root", "123456");
				} catch (SQLException e) {
					e.printStackTrace();
				}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
		 
	 }
	 public static void closeConn(ResultSet rs, Statement pst, Connection conn){
		  if (rs != null) {
	            try {
	                rs.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
		  if (pst != null) {
	            try {
	                pst.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
		  if (conn != null) {
	            try {
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	 }
	  //≤‚ ‘
	    public static void main(String[] args) {
	        System.out.println(getConn());
	    }
}
