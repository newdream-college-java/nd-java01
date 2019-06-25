package com.yb.dao;

import java.util.List;

import com.yb.entity.Pcnuser;

public interface PcnuserDao {
	int save(Pcnuser pcnuser);
	List<Pcnuser> list(String name,String password);
	int update(Pcnuser pcnuser);
	List<Pcnuser> select(Integer id);
}
