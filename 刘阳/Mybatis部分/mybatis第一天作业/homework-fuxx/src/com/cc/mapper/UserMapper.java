package com.cc.mapper;
import java.util.List;

import com.cc.entity.User;
public interface UserMapper {
	List<User> listAll();
	int addUser(User fw);
	int modifyUser(User fw);
	int removeUser(User fw);
}
