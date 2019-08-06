package com.dy.mapper;

import java.util.List;

import com.dy.entiy.User1;



public interface User1Mapper {
	List<User1>findAll();
	int saveUser1(User1 user1);
	int UpdateUser1(User1 user1);
	int DeleteUser1(User1 user1);
}
