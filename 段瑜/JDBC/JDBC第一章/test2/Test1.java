package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		updateStuden();
	}
	public static  void  updateStuden() {
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		Scanner input=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn=DriverManager.getConnection(url,"root","z382698.");
			System.out.println("请输入修改名称");
			String name=input.next();
			System.out.println("请输入查询ID");
			int id=input.nextInt();
			String update="update studen set name=? where id=?";
			pst=conn.prepareStatement(update);
			pst.setString(1, name);
			pst.setInt(2, id);
			result=pst.executeUpdate();
			if(result!=0) {
				System.out.println("修改成功");
			}else{
				System.out.println("修改失败");
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
	}
}
