import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




public class UpdateJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//��myeclipes�½�һ���ļ���������Ϊlib��Ϊ�ⴢ��/JDBC/lib/mysql-connector-java-5.1.46.jar
		//1.��������(��������1.����������/JDBC/lib/mysql-connector-java-5.1.46.jar  ��2����������)
		//����jar��build path����ƿ��һ�����
		//������������jar��������ƿ�ҵ�com.mysql.jdbc���ҵ�com.mysql.jdbc.Driver.classȥ��.class
		Class.forName("com.mysql.jdbc.Driver");		//��������
		//2.�������ݿ�����(�������)
		/*
		 	jdbc:Э�����Э�飺  oracleЭ��	mysqlЭ�� �ȵ�����������ʹ��mysql���ݿ�����ʹ��mysql��Э��
		 	127.0.0.1		mysql���ݿ���������ڵĻ�����ip��ַ(�������Լ��ĵ���)
		 	3306			mysql���ݿ����Ŀں�
		 	java01			���ݿ���
		 	useUnicode=true&characterEncoding=utf8 ������
			useSSL             ʹ��sslЭ��
        
        SQLException :  sql�쳣 
		 */
		 String url="jdbc:mysql://127.0.0.1:3306/java01?useUnicode=true&characterEncoding=utf8&useSSL=true";	//
	        String username="root";
	        String password="123456";
	        Connection conn  = DriverManager.getConnection(url,username,password);	//��һ������url����ʹ��Э�飬ip��ַ�����ݿ�˿ں�,���ݿ������ڶ��������˻������������˻����롣
	     //3.����Statement������������myeclipes�������mysql,mysql�����ݷ�����myeclipes
	       Statement st = conn.createStatement();
	
	     //4.���Ͳ�ִ��sql���(ó��)
	     //����ִ������
	       String sql  ="insert into stu_info(name) values('������')";//����
	      // executeUpdate(sql)��������ܷ������ݿ�
	      //��ɾ�Ĳ鶼����executeUpdate(sql)����		��ѯ��executeQuery(sql) 
	       //����ִ������
	       int result = st.executeUpdate(sql);
	       
	       //5.�жϽ��(���ݿ����ܵ�Ӱ�������)
	       if(result>0){
	    	   //������ݿ����ܵ�Ӱ�������>0;
	    	   System.out.println("������ݿ�ɹ�");
	       }else {
	            System.out.println("������ݿ�ʧ��");
	        }
	       //6.������Ҫ����
	       st.close();
	       conn.close();
	       
	}
	
	
	

}
