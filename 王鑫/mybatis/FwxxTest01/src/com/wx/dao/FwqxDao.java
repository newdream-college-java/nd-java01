package com.wx.dao;

import java.util.List;

import com.wx.dao.entity.Fwqx;

public interface FwqxDao {
	List<Fwqx> listAll();
	int addFwqx();
	int modifyFwqx();
	int removeFwqx();
}
