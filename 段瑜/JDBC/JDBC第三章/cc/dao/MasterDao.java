package cn.cc.dao;

import cn.cc.entity.Master;

public interface MasterDao {
	int save(Master master);
	int  update(Master master);
	int select(Master master);
}
