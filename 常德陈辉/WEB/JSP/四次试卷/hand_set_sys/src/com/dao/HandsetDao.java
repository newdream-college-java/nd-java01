package com.dao;

import java.util.List;

import com.entity.Handset;

public interface HandsetDao {
	List<Handset> list(Integer hid);
	int delete(int hid);
}
