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
}
