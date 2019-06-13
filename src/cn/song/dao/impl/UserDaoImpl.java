package cn.song.dao.impl;

import java.sql.SQLException;

import javax.naming.NamingException;

import cn.song.dao.BaseDao;
import cn.song.dao.UserDao;
import cn.song.entity.User;

public class UserDaoImpl extends BaseDao implements UserDao {
	
	public boolean register(User user) {
//		// TODO Auto-generated method stub
		String sql = "insert into user(u_phone,u_pwd) values(?,?)";
		String[] strings = { user.getuPhone(), user.getuPwd() };
		if (update(sql, strings)) {
			return true;
		}
		return false;
	}

	
	public boolean login(User user) {
		// TODO Auto-generated method stub
		try {
			getConnection();
			String sql="select * from user where u_phone=? and u_pwd=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, user.getuPhone());
			pst.setString(2, user.getuPwd());
			rs=pst.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return false;
	}

}
