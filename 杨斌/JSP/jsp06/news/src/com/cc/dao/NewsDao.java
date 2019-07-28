package com.cc.dao;
import java.util.List;

import com.cc.entity.News;

public interface NewsDao {
	List<News> list(int page,int pagesize);
	int add(int ntid,String ntitle,String nauthor,String ncontent,String nsummary);
	int count();
}
