package com.yb.dao;
import java.util.List;
import com.yb.entity.Fwjd;
public interface FwjdDao {
	List<Fwjd> listAll();
	int addFwid();
	int modifyFwjd();
	int removeFwjd();
}
