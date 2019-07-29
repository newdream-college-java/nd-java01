package com.ch.mapper;

import java.util.List;

import com.ch.entity.Items;
import com.ch.entity.Test1;
import com.ch.entity.User;

public interface UserMapper {
	//�鿴����user������
	List<User> findAll();
	//�鿴����items������
	List<Items> find();
	//�޸�user����
	int modify(User user);
	//���user���ݲ鿴id
	int insert(User user);
	//���test1���ݲ鿴�ַ���id
	int insertTest1(Test1 test);
}
