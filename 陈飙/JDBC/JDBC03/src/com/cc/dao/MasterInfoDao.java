package com.cc.dao;

import com.cc.enity.MasterInfo;



public interface MasterInfoDao {
		//дmasterinfo�����ܲ�����д���ͣ�ֻҪд��������Ϊ����
	   int save(MasterInfo masInfo);
	   
	   int update(MasterInfo masInfo);
	   
	   int delete(MasterInfo masInfo);
	   //�ص���������ΪMasterInfo
	   MasterInfo select(MasterInfo masInfo);
}