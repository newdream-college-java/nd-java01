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
	//�������ӳ�
	public void getConn(){
		try {
			Context ctx=new InitialContext();
			DataSource ds=(DataSource) ctx.lookup("java:comp/env/jdbcNews");
			conn= ds.getConnection(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//�ر�����
	public void closeAll(ResultSet rs,Connection conn,Statement st){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		if(st!=null){
			try {
				st.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}		
	}	
	//��ɾ��
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
