

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class RemoveJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.����mysql����
		//2.����������myeclipes
		Class.forName("com.mysql.jdbc.Driver");
		//2.����
		String url="jdbc:mysql://127.0.0.1:3306/java01?useUnicode=true&characterEncoding=utf8&useSSL=true";
		String username="root";
		String password="123456";
		//����mysql���ݿ�
		Connection conn =DriverManager.getConnection(url,username,password);
		//3.����Statement������������myeclipes�������mysql,mysql�����ݷ���
		Statement st =conn.createStatement();
		//4.���Ͳ�ִ��sql���
		//����ִ������
		String sql = "delete from stu_info where id=6";
		//����ִ������
		int result = st.executeUpdate(sql);
		//5.�ж�ִ�еĽ���Ƿ�ɹ�
		//executeUpdate()�������ص���mysql���Ӱ�������
		if(result>0){
			System.out.println("ִ�гɹ�");
		}else{
			System.out.println("ִ��ʧ��");
		}
		//6.����
		st.close();
		conn.close();
	}

}
