package cn.song.dao;

import cn.song.entity.User;

/**
* @author mo
* @version 2019年5月27日 下午7:16:29
* @description
*/
public interface UserDao {
	boolean findUser(User user);
}
