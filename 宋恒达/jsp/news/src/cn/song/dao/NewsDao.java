package cn.song.dao;


import java.util.Map;

import cn.song.entity.News;

/**
* @author mo
* @version 2019年5月27日 下午8:07:12
* @description
*/
public interface NewsDao {
	boolean addNews(News news);
	Map<Integer,News> showAllNews();
	Map<Integer,News> showAllNews(int page,int pageSize);
}
