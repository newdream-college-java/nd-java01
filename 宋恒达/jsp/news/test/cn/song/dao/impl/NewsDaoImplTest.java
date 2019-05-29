package cn.song.dao.impl;


import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import cn.song.dao.NewsDao;
import cn.song.entity.News;

/**
* @author mob
* @version 2019��5��27�� ����8:55:24
* @description
*/
class NewsDaoImplTest {

	@Test
	void testAddNews() {
		NewsDao newsDao=new NewsDaoImpl();
		News news=new News();
		news.setNtid(1);
		news.setNtitle("����������ɭ�� ��̭���������¶�������");
		news.setNauthor("��������");
		news.setNcreatedate("2019-05-27 18:20:00");
		news.setNpicpath(null);
		news.setNcontent("����ʱ��5��27�գ��ݡ��ɽ�ɽ���±���������"
				+ "����-����ɭ�Զ���ѡ����������ݶ������ڻ��������кܶ�����ѹ�Լ�������������ݣ�"
				+ "��ϲ���ڼ������������ǣ�����������������");
		news.setNmodifydate(null);
		news.setNsummary("����-����ɭ�Զ���ѡ����������ݶ������ڻ�");
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
