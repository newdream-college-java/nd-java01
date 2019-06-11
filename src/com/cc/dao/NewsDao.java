package com.cc.dao;

import java.util.List;

import com.cc.entity.News;

public interface NewsDao {
    List<News> listNewsByPage(int page,int pageSize);
}
