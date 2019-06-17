package cn.song.dao;

import cn.song.entity.User;

public interface UserDao {
	/**
	 * ע�Ṧ��
	 */
	boolean register(User user);

	/**
	 * ��¼����
	 */
	boolean login(User user);

	boolean update(User user);

	User select(String phone);

	boolean updatePhone(String phone1, String phone2);

	boolean updateEmail(String email, String phone);

	boolean updatePWD(String confirm_password, String phone);
}
