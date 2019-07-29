package com.ch.mapper;

import java.util.List;

import com.ch.entity.Items;
import com.ch.entity.Test1;
import com.ch.entity.User;

public interface UserMapper {
	//查看所有user的数据
	List<User> findAll();
	//查看所有items的数据
	List<Items> find();
	//修改user数据
	int modify(User user);
	//添加user数据查看id
	int insert(User user);
	//添加test1数据查看字符串id
	int insertTest1(Test1 test);
}
