package com.wx.dao;
import java.util.List;

import com.wx.dao.entity.User;
public interface UserDao {
	List<User> listAll();
	int addUser();
	int modifyUser();
	int removeUser();
}
