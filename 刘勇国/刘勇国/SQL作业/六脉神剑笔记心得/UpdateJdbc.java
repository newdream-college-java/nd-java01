import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




public class UpdateJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//在myeclipes新建一个文件夹民命名为lib作为库储存/JDBC/lib/mysql-connector-java-5.1.46.jar
		//1.加载驱动(共分两步1.导入驱动包/JDBC/lib/mysql-connector-java-5.1.46.jar  第2步加载驱动)
		//导入jar包build path出奶瓶第一步完成
		//加载驱动导入jar包后点击奶瓶找到com.mysql.jdbc包找到com.mysql.jdbc.Driver.class去掉.class
		Class.forName("com.mysql.jdbc.Driver");		//加载驱动
		//2.创建数据库连接(建造河流)
		/*
		 	jdbc:协议的子协议：  oracle协议	mysql协议 等等在这里我们使用mysql数据库所以使用mysql的协议
		 	127.0.0.1		mysql数据库服务器所在的机器的ip地址(这里是自己的电脑)
		 	3306			mysql数据库程序的口号
		 	java01			数据库名
		 	useUnicode=true&characterEncoding=utf8 ：编码
			useSSL             使用ssl协议
        
        SQLException :  sql异常 
		 */
		 String url="jdbc:mysql://127.0.0.1:3306/java01?useUnicode=true&characterEncoding=utf8&useSSL=true";	//
	        String username="root";
	        String password="123456";
	        Connection conn  = DriverManager.getConnection(url,username,password);	//第一个参数url代表使用协议，ip地址，数据库端口号,数据库名。第二个参数账户名。第三个账户密码。
	     //3.创建Statement对象用于运输myeclipes的命令给mysql,mysql的数据反馈到myeclipes
	       Statement st = conn.createStatement();
	
	     //4.发送并执行sql语句(贸易)
	     //定义执行命令
	       String sql  ="insert into stu_info(name) values('王二辉')";//发送
	      // executeUpdate(sql)这个函数能返回数据库
	      //增删改查都是用executeUpdate(sql)函数		查询：executeQuery(sql) 
	       //发送执行命令
	       int result = st.executeUpdate(sql);
	       
	       //5.判断结果(数据库中受到影响的行数)
	       if(result>0){
	    	   //如果数据库中受到影响的行数>0;
	    	   System.out.println("添加数据库成功");
	       }else {
	            System.out.println("添加数据库失败");
	        }
	       //6.开流就要关流
	       st.close();
	       conn.close();
	       
	}
	
	
	

}
