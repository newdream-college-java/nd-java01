package Demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectField {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.��������
		Class.forName("com.mysql.jdbc.Driver");
		//2.�������ݿ�����
		String url = "jdbc:mysql://127.0.0.1:3306/java01?useUnicode=true&characterEncoding=utf8&useSLL=true";
		String username = "root";
		String password = "123456";
		Connection conn = DriverManager.getConnection(url, username, password);
		//3.����statement����(�촬)
		Statement st = conn.createStatement();
		//4.���Ͳ�ִ��sql���(ó��)
		String sql = "select * from emp";
		ResultSet result = st.executeQuery(sql);
		while (result.next()) {
			System.out.println(result.getString("ename"));
		}
		//5.�ж��Ƿ��ѯ�ɹ�
		if(result!=null) {
            System.out.println("�ѳɹ�����������Ϣ");
        }else {
            System.out.println("������Ϣ������");
        }
		//6.����
		st.close();
		conn.close();
	}
}
