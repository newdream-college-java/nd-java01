package cn.song.dao;


import java.util.Map;

import cn.song.entity.News;

/**
* @author mo
* @version 2019��5��27�� ����8:07:12
* @description
*/
public interface NewsDao {
	boolean addNews(News news);
	Map<Integer,News> showAllNews();
	Map<Integer,News> showAllNews(int page,int pageSize);
}
