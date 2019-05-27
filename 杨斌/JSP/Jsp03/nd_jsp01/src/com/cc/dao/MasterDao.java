package com.cc.dao;

import java.util.List;

import com.cc.entity.Master;

public interface MasterDao {
	int save(Master master);
	int dropMt(Master master);
	int updateMt(Master master);
	List<Master> list(int id);
}
