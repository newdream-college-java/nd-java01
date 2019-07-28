package com.yb.dao;
import java.util.List;
import com.yb.entity.Fwlx;
public interface FwlxDao {
	List<Fwlx> listAll();
	int addFwlx();
	int modifyFwlx();
	int removeFwlx();
}
