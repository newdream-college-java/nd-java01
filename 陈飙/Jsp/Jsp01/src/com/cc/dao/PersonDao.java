package com.cc.dao;

import com.cc.entity.Person;

public interface PersonDao {
	int save(Person person);
	int delete(Person person);
	int update(Person person);
}
