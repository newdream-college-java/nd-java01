package com.yb.dao;

import java.util.List;

import com.yb.entity.ParentChildTheme;

public interface ParentChildThemeDao {
	List<ParentChildTheme> parentChildThemeList(Integer themeType,Integer page,Integer pageSize,String city,Integer activity,Integer day);
}
