package com.cc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
    public Connection conn = null;
    public PreparedStatement pst = null;
    public ResultSet rs = null;

    /* 得到数据库连接（1.加载驱动；2.得到连接） */
    public void getConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/easybuy-sys?useUnicode=true&characterEncoding=utf8&useSSL=true";
            // Context ctx = new InitialContext();
            // DataSource ds= (DataSource) ctx.lookup("java:comp/env/java/news");
            // conn = ds.getConnection();
            conn = DriverManager.getConnection(url, "root", "root");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* 统一关闭资源的方法 */
    public void closeConn(ResultSet rs, Statement pst, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // sql 语句 参数不同
    // insert into news values(NULL,?,?,?,?);
    // update news set nd_id=?,...... where nd_id=?
    public int updateDb(String sql, String... args) {// 可变参数 String[] args
        int result = -1;
        try {
            pst = conn.prepareStatement(sql);
            for (int i = 0; i < args.length; i++) {
                pst.setObject(i + 1, args[i]);
            }
            result = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int add(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        BaseDao bd = new BaseDao();
        bd.getConn();
        System.out.println(bd.conn);

//        System.out.println(bd.add(1));
//        System.out.println(bd.add(2, 3));
//        System.out.println(bd.add(4, 5, 6, 7, 8));
        
        String sql="insert into eb_news(en_title,en_content) values(?,?)";
        String[] params = {"辉哥为什么这么白","凤凰空气好..."};
       System.out.println( bd.updateDb(sql, params ));
       
       
//       String sql="insert into eb_news values(NULL,?,?,?)";
//       String[] params = {"辉哥为什么这么白","凤凰空气好...","1900-1-1"};
//      System.out.println( bd.updateDb(sql, params ));

    }
}
