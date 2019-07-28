package com.wx.dao;
import java.util.List;

import com.wx.dao.entity.Fwjd;
public interface FwjdDao {
	List<Fwjd> listAll();
	int addFwid();
	int modifyFwjd();
	int removeFwjd();
}
