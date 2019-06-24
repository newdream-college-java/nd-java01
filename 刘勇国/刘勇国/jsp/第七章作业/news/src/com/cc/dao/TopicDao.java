package com.cc.dao;
import java.util.List;

public interface TopicDao {
	int save(String name);
	boolean getName(String name);
	List<String> list();
}
