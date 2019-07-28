package com.yb.dao;

import java.util.List;
import com.yb.entity.Fwqx;

public interface FwqxDao {
	List<Fwqx> listAll();
	int addFwqx();
	int modifyFwqx();
	int removeFwqx();
}
