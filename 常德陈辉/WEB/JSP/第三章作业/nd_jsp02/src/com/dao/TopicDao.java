package com.dao;

import java.util.ArrayList;



import com.entity.Topic;

public interface TopicDao {
	boolean getTopicByName(String title);
	int insertTopic(Topic top);
	int updateTopic(Topic top);
	int deleteTopic(Topic top);
	ArrayList<Topic> selectTopic();
}
