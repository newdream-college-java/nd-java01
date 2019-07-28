package com.wx.dao;

import java.util.List;

import com.wx.dao.entity.Fwxx;

public interface FwxxDao {
	List<Fwxx> listAll();
	int addFwxx();
	int modifyFwxx();
	int removeFwxx();
}
