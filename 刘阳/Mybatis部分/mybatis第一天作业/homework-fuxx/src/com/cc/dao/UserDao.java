package com.cc.dao;
import java.util.List;

import com.cc.entity.User;
public interface UserDao {
	List<User> listAll();
	int addUser();
	int modifyUser();
	int removeUser();
}
