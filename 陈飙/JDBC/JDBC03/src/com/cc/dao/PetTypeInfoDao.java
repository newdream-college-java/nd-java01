package com.cc.dao;

import com.cc.enity.PetTypeInfo;

public interface PetTypeInfoDao {
	//PetTypeInfo select(PetTypeInfo petInfo);
	int findIdByTypeName(String name);
}
