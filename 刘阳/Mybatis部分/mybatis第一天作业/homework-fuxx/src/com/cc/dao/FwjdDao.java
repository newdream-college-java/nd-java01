package com.cc.dao;
import java.util.List;

import com.cc.entity.Fwjd;
public interface FwjdDao {
	List<Fwjd> listAll();
	int addFwid();
	int modifyFwjd();
	int removeFwjd();
}
