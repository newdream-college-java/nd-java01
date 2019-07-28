package com.dy.mapper;

import java.util.List;

import com.dy.entiy.User;

public interface UserMapper {
	List<User>findAll();
	int addUser(User user);
	int DeleteUser(User user);
	int UpdateUser(User user);
	User findUserAll(int id);
	User selectUserItems();
	User UserMapOrder(int id);
}
