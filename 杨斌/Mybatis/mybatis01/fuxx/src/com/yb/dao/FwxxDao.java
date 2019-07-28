package com.yb.dao;

import java.util.List;
import com.yb.entity.Fwxx;

public interface FwxxDao {
	List<Fwxx> listAll();
	int addFwxx();
	int modifyFwxx();
	int removeFwxx();
}
