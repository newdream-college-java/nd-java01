package com.cc.Dao;

import java.sql.ResultSet;


import java.util.List;

import com.cc.entity.New;

public interface NewDao {
	ResultSet select();
	int insert(New news);
	List<New> list(int page,int pageSize);
}
