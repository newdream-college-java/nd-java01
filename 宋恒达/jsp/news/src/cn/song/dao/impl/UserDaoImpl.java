package cn.song.dao.impl;

import java.sql.SQLException;

import cn.song.dao.BaseDao;
import cn.song.dao.UserDao;
import cn.song.entity.User;

/**
* @author mo
* @version 2019年5月27日 下午7:17:32
* @description
*/
public class UserDaoImpl extends BaseDao implements UserDao{

	@Override
	public boolean findUser(User user) {
		// TODO Auto-generated method stub
		try {
			getConnection();
			String sql="select * from news_users where uname=? and upwd=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getUpwd());
			rs=ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (ClassNotFoundException e) {
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
