package com.cc.dao;
import java.util.List;

import com.cc.entity.Fwlx;
public interface FwlxDao {
	List<Fwlx> listAll();
	int addFwlx();
	int modifyFwlx();
	int removeFwlx();
}
