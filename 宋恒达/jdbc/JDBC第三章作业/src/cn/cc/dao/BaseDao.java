package cn.cc.dao;
/**
* @author mob
* @version 2019��5��13�� ����6:52:12
* @description ��ϰ1��ҵ
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	private static String DRIVER="com.mysql.cj.jdbc.Driver";
	private static String URL="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&"
			+ "characterEncoding=utf8&serverTimezone=GMT&useSSL=true";
	private static String USERNAME="songhengda";
	private static String PASSWORD="123456";
	/**
	 * @description ��ȡ���ݿ�����
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException {
		Connection conn=null;
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("���ӳɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("����ʧ��");
		} 
		return conn;
	}
	/**
	 * 1.�رս����
	 * 2.�ر�Ԥ����
	 * 3.�ر�����
	 * @param conn
	 * @param st
	 * @param rs
	 */
	public static void closeAll(Connection conn,Statement st,ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		try {
			BaseDao.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
