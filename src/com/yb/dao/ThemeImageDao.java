package com.yb.dao;

import java.util.List;

import com.yb.entity.ThemeImage;

public interface ThemeImageDao {
	//²éÑ¯Ö÷Ìâ½éÉÜÍ¼Æ¬
	List<ThemeImage> themeImageList(Integer pctid);
}
