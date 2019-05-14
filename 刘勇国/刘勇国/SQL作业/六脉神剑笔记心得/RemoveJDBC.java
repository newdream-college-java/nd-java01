

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
		//1.导入mysql驱动
		//2.加载驱动到myeclipes
		Class.forName("com.mysql.jdbc.Driver");
		//2.建流
		String url="jdbc:mysql://127.0.0.1:3306/java01?useUnicode=true&characterEncoding=utf8&useSSL=true";
		String username="root";
		String password="123456";
		//连接mysql数据库
		Connection conn =DriverManager.getConnection(url,username,password);
		//3.创建Statement对象用于运输myeclipes的命令给mysql,mysql的数据反馈
		Statement st =conn.createStatement();
		//4.发送并执行sql语句
		//定义执行命令
		String sql = "delete from stu_info where id=6";
		//发送执行命令
		int result = st.executeUpdate(sql);
		//5.判断执行的结果是否成功
		//executeUpdate()函数返回的是mysql语句影响的行数
		if(result>0){
			System.out.println("执行成功");
		}else{
			System.out.println("执行失败");
		}
		//6.关流
		st.close();
		conn.close();
	}

}
