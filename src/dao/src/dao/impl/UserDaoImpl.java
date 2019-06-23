package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import dao.BaseDao;
import entity.User;

public class UserDaoImpl extends BaseDao implements UserImpl {
		Connection conn = null;
		PreparedStatement pst = null;
		int result = -1;
		ResultSet rs=null;
		//注册页面，注册用户功能
	public int addUser(User user) {
		
        try {
        	//添加用户
			conn=getConn();
			String sql="insert into user values(null,?,?,?,?,?,?,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getUserName());
			pst.setString(2, user.getUserAccount());
			pst.setString(3, user.getUserPassword());
			pst.setInt(4, user.getUserSex());
			pst.setString(5, user.getUserBirthday());
			pst.setInt(6,user.getUserId());
			pst.setString(7, user.getUserEmail());
			pst.setInt(8, user.getUserPhone());
			pst.setString(9, user.getUserAddress());
			
			result = pst.executeUpdate();
			
        } catch (Exception e) {
        	e.printStackTrace();
		}finally{
			closeConn(null, pst, conn);
		}
		
		return result;
	}
	
	
	
	
	//注册时需要查看数据是否用户名重复
	public boolean lookupForUanme(User user){
		try {
			getConn();
			String sql ="select count(*) b from user where uname=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1,user.getUserName());
			rs=pst.executeQuery();
			if(rs.next()){
            	int b = rs.getInt("b");
            	if(b>0){
            		System.out.println("用户名存在");
            		return true;
            	}else{
            	
            		System.out.println("用户名可以注册");
            		return false;
            	}
            }
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
				closeConn(rs, pst, conn);
		}
		return false;
		
		
		
	}
	//登录功能,查询数据库是否存在账号密码
	public int login(User user) {
		//测试成功
		int a=-1;
		try {
			
			conn=getConn();
			String sql="select count(*) a from user where user_account=? and user_password=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1,user.getUserAccount());
            pst.setString(2,user.getUserPassword());   
            rs = pst.executeQuery();
            if(rs.next()){
            	a =rs.getInt("a");
            	if(a>0){
            		System.out.println("登录成功");
            	}else{
            	
            		System.out.println("登录失败");
            	}
            }
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return a;
	}

	
}
