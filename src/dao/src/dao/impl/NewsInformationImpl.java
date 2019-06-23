package dao.impl;

import java.util.List;

import entity.NewsInformation;

public interface NewsInformationImpl {
	//就一个显示新闻动态的功能
	List<NewsInformation> listNewsInformation();
}
