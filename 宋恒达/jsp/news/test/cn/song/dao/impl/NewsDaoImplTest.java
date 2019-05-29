package cn.song.dao.impl;


import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import cn.song.dao.NewsDao;
import cn.song.entity.News;

/**
* @author mob
* @version 2019年5月27日 下午8:55:24
* @description
*/
class NewsDaoImplTest {

	@Test
	void testAddNews() {
		NewsDao newsDao=new NewsDaoImpl();
		News news=new News();
		news.setNtid(1);
		news.setNtitle("复仇者汤普森！ 淘汰哈登利拉德动力在这");
		news.setNauthor("新浪体育");
		news.setNcreatedate("2019-05-27 18:20:00");
		news.setNpicpath(null);
		news.setNcontent("北京时间5月27日，据《旧金山纪事报》报道，"
				+ "克莱-汤普森仍对落选今年最佳阵容而耿耿于怀。他称有很多人力压自己进入了最佳阵容，"
				+ "他喜欢在季后赛对阵他们，这让他充满动力。");
		news.setNmodifydate(null);
		news.setNsummary("克莱-汤普森仍对落选今年最佳阵容而耿耿于怀");
		System.out.println(newsDao.addNews(news));
	}
	@Test
	void testShowAllNews() {
		NewsDao newsDao=new NewsDaoImpl();
		Map<Integer,News> maps=newsDao.showAllNews();
		Set<Integer> keys=maps.keySet();
		for(Integer key:keys) {
			System.out.println(maps.get(key));
		}
	}
}
