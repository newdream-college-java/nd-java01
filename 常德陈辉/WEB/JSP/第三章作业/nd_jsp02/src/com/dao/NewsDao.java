package com.dao;

import java.util.List;

import com.entity.News;

public interface NewsDao {
	List<News> news(int page,int pageSize);
	int last(int pageSize);
}
