package dao.impl;

import java.util.List;

import entity.NewsView;

public interface NewsViewImpl {
	//��ѯNewsView���ݿ�,�������鹦��
	List<NewsView> LookUpNewsView(int newsId);
}
