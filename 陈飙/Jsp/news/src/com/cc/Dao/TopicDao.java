package com.cc.Dao;

import com.cc.entity.Topic;

public interface TopicDao {
	int insert(Topic topic);
	Topic selectTopic(Topic topic);
	boolean selectTopic1(Topic topic);
	
}
