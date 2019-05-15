package com.cc.dao;

import com.cc.enity.MasterInfo;



public interface MasterInfoDao {
		//写masterinfo类型能不用重写类型，只要写出对象作为类型
	   int save(MasterInfo masInfo);
	   
	   int update(MasterInfo masInfo);
	   
	   int delete(MasterInfo masInfo);
	   //重点这里类型为MasterInfo
	   MasterInfo select(MasterInfo masInfo);
}