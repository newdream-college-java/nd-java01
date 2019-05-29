package cn.song.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cn.song.dao.UserDao;
import cn.song.entity.User;

/**
* @author mo
* @version 2019年5月27日 下午7:20:02
* @description
*/
class UserDaoImplTest {

	@Test
	void testFindUser() {
		UserDao userDao=new UserDaoImpl();
		User user=new User();
		user.setUname("songhengd");
		user.setUpwd("123456");
		System.out.println(userDao.findUser(user));
	}

}
