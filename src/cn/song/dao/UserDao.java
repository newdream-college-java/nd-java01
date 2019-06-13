package cn.song.dao;

import cn.song.entity.User;

public interface UserDao {
	/**
	 * 注册功能
	 */
	boolean register(User user);
	/**
	 * 登录功能
	 */
	boolean login(User user);
}
