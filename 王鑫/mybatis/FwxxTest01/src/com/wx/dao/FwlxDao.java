package com.wx.dao;
import java.util.List;

import com.wx.dao.entity.Fwlx;
public interface FwlxDao {
	List<Fwlx> listAll();
	int addFwlx();
	int modifyFwlx();
	int removeFwlx();
}
