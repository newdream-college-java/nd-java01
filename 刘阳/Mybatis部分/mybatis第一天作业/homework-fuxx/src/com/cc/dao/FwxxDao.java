package com.cc.dao;

import java.util.List;

import com.cc.entity.Fwxx;

public interface FwxxDao {
	List<Fwxx> listAll();
	int addFwxx();
	int modifyFwxx();
	int removeFwxx();
}
