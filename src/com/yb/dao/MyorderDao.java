package com.yb.dao;

import java.util.List;

import com.yb.vo.Myorder;

public interface MyorderDao {
	List<Myorder> list(int apg,int bpg,Integer pcnuid);
	int count(int bpg);
}
