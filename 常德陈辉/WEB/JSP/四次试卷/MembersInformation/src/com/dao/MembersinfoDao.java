package com.dao;

import java.util.List;

import com.entity.Membersinfo;

public interface MembersinfoDao {
	List<Membersinfo> list(Integer mid);
	int Update(Membersinfo mbf);
}
