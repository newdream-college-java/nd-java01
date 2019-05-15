package cn.two.dao;

import cn.two.entity.Master;

public interface MasterDao {
	boolean select(Master master);
	int save(Master master);
}
