package com.cc.Dao;

import java.sql.ResultSet;
import java.util.List;

import com.cc.entity.Topic;

public interface TopicDao {
	int insert(Topic topic);
	Topic selectTopic(Topic topic);
	boolean selectTopic1(Topic topic);
	List<String> selectTopic();
	//Topic selectTopicAll();
	ResultSet selectTopicAll();
	List<Topic>getTopic(int pageSize,int curPage);
	int pageSizeMax(int pageSize);
}
