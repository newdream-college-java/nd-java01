package com.cc.Dao;

import java.sql.ResultSet;

import com.cc.entity.Topic;
import com.cc.entity.User;

public interface UserDao {
	User selectLogin(User user);
	boolean selectLogin1(User user);
	ResultSet getTopics();
}
