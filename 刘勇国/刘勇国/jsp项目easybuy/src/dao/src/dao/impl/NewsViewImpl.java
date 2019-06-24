package dao.impl;

import java.util.List;

import entity.NewsView;

public interface NewsViewImpl {
	//查询NewsView数据库,新闻详情功能
	List<NewsView> LookUpNewsView(int newsId);
}
