package com.cc.dao;
import java.util.List;
import com.cc.entity.Topic;
public interface TopicDao {
	int save(String name);
	boolean getName(String name);
	List<String> list();
	List<Topic> limitTopic(int page,int pagesize);
	public int delete(int tid);
}
