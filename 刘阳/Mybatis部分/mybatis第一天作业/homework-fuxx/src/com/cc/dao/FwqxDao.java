package com.cc.dao;

import java.util.List;

import com.cc.entity.Fwqx;

public interface FwqxDao {
	List<Fwqx> listAll();
	int addFwqx();
	int modifyFwqx();
	int removeFwqx();
}
