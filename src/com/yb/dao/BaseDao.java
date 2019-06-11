package com.yb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
public class BaseDao {
	public Connection conn=null;
	public PreparedStatement st=null;
	public ResultSet rs=null;	
	//建立连接池
	public void getConn(){
		try {
			Context ctx=new InitialContext();
			DataSource ds=(DataSource) ctx.lookup("java:comp/env/jdbcNews");
			conn= ds.getConnection(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//关闭连接
	public void closeAll(ResultSet rs,Connection conn,Statement st){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if(st!=null){
			try {
				st.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}		
	}	
	//增删改
	public int updateDb(String sql, Object...args) {
        int result = -1;
        try {
            st = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                st.setObject(i + 1, args[i]);
            }
            result = st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
        	closeAll(rs,conn,st);
        }
        return result;
    }   
}
