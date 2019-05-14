package cn.cc.dao;

import java.sql.ResultSet;

import cn.cc.entity.Master;

public interface MasterDao {
	Master findMaster(Master master);
	
	int save(Master master);
	
	int update(Master master);
	
	int deleter(Master master);
	
	ResultSet cha(String master,String dsa);
}
