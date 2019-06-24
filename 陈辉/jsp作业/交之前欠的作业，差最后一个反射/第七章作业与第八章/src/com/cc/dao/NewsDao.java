package com.cc.dao;

import java.util.List;




public interface NewsDao {
	<News> List<News> list(int page,int pagesize);
	int add(int ntid,String ntitle,String nauthor,String filePath,String ncontent,String nsummary);
	public Integer count(int pagesize);
}
