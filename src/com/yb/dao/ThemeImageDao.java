package com.yb.dao;

import java.util.List;

import com.yb.entity.ThemeImage;

public interface ThemeImageDao {
	//��ѯ�������ͼƬ
	List<ThemeImage> themeImageList(Integer pctid);
}
