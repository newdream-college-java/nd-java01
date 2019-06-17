package cn.song.dao.impl;

import java.sql.SQLException;

import javax.naming.NamingException;

import cn.song.dao.BaseDao;
import cn.song.dao.UserDao;
import cn.song.entity.User;

public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public boolean register(User user) {
//		// TODO Auto-generated method stub
		String sql = "insert into user(u_phone,u_pwd) values(?,?)";
		String[] strings = { user.getuPhone(), user.getuPwd() };
		if (update(sql, strings)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		try {
			getConnection();
			String sql = "select * from user where u_phone=? and u_pwd=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getuPhone());
			pst.setString(2, user.getuPwd());
			rs = pst.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return false;
	}

	@Override
	public boolean update(User user) {
		int result = -1;
		try {
			getConnection();
			String sql = "update user set u_nickname=?,u_birthday=?, u_sex=?, u_name=? where u_phone=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, user.getuNickname());
			pst.setString(2, user.getuBirthday());
			pst.setString(3, user.getuSex());
			pst.setString(4, user.getuName());
			pst.setString(5, user.getuPhone());
			result = pst.executeUpdate();
			if (result > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}

		return false;
	}

	@Override
	public User select(String phone) {
		User user = null;
		try {
			getConnection();
			String sql = "select * from user where u_phone = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, phone);
			rs = pst.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setuId(rs.getInt("u_id"));
				user.settRealName(rs.getString("t_real_name"));
				user.settIdNumber(rs.getString("t_id_number"));
				user.setuName(rs.getString("u_name"));
				user.setuPwd(rs.getString("u_pwd"));
				user.setuNickname(rs.getString("u_nickname"));
				user.setuSex(rs.getString("u_sex"));
				user.setuPhone(rs.getString("u_phone"));
				user.setuEmail(rs.getString("u_email"));
				user.setuIsAdult(rs.getInt("u_is_adult"));
				user.setuBirthday(rs.getString("u_birthday"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return user;
	};

	@Override
	public boolean updateEmail(String email, String phone) {
		int result = -1;
		try {
			getConnection();
			String sql = "update user set u_email=? where u_phone=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, phone);
			result = pst.executeUpdate();
			if (result > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return false;
	}

	@Override
	public boolean updatePhone(String phone1, String phone2) {
		int result = -1;
		try {
			getConnection();
			String sql = "update user set u_phone=? where u_phone=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, phone1);
			pst.setString(2, phone2);
			result = pst.executeUpdate();
			if (result > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return false;

	}

	@Override
	public boolean updatePWD(String confirm_password, String phone) {
		int result = -1;
		try {
			getConnection();
			String sql = "update user set u_pwd=? where u_phone=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, confirm_password);
			pst.setString(2, phone);
			result = pst.executeUpdate();
			if (result > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeAll();
		}
		return false;
	}
}
