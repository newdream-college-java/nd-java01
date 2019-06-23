package com.cc.dao;

import java.util.List;

import com.cc.entity.Search;

public interface SearchDao {
	List<Search>list(String user);
	 String searchByKeyWord(String keyWord);
}
