package com.cc.dao;
import java.util.List;

import com.cc.entity.Person;
public interface PersonDao {
	int save(Person person);
	List<Person> selectByIdOrAll(Integer id);
	int deleteByName(String name);
	int updatePerson(Person person);
	
}
