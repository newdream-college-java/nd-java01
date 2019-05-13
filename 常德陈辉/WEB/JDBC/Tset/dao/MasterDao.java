package Tset.dao;

import Tset.enity.Master;

public interface MasterDao {
	Master findMaster(Master master);
	
	int save(Master master);
	
	int update(Master master);

}