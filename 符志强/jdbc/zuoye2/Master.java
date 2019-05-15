package zuoye2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Master {
    public void login(String name, String password) throws Exception {
    	//1.导包，加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2.连接
		String url="jdbc:mysql://127.0.0.1:3306/jdbc1?useUnicode=true&characterEncoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url, "root", "123");
		//3.mysql代码
		String sql="select count(*) from master where name=? and password=? or 1=1 ";
        //4.声明
		PreparedStatement pst = conn.prepareStatement(sql);

		 //填充占位符
        pst.setString(1,name);
        pst.setString(2,password);
		ResultSet zj=pst.executeQuery();
		//5.判断
		zj.next();
        int result = zj.getInt(1);// 下标从1开始

        if (result > 0) {
            System.out.println("登录成功！！！");
        }else {
            System.out.println("登录失败");
        }
        //6.关闭
		pst.close();
		conn.close();
	}
    //测试
	 public static void main(String[] args) throws Exception {
	        new Master().login("vv", "0011");
	    }
}
