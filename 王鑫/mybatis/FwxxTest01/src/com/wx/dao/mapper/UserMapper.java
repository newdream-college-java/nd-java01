package com.wx.dao.mapper;
import java.util.List;

import com.wx.dao.entity.User;
public interface UserMapper {
	List<User> listAll();
	int addUser(User fw);
	int modifyUser(User fw);
	int removeUser(User fw);
}
