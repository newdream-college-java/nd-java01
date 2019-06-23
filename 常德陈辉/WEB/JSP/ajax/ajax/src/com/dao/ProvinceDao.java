package com.dao;

import java.util.List;

import com.entity.Province;

public interface ProvinceDao {
	List<Province> list(String word);
}
