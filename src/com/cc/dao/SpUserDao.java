package com.cc.dao;

import java.util.List;

import com.cc.entity.SpUser;


public interface SpUserDao {
	List<SpUser> list(String name,int pwd);
	List<SpUser>listName(String name);
}
