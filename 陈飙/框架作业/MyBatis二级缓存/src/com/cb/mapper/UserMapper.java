package com.cb.mapper;
import com.cb.entity.User;

public interface UserMapper {
	User findALL(int a);
	int delete(int i);
	int addUser(User user);
}
