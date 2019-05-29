package cn.song.dao;

import java.util.Map;

import cn.song.entity.Topic;

/**
* @author mob
* @version 2019��5��27�� ����3:07:36
* @description
*/
public interface TopicDao {
		boolean addTopic(Topic topic);
		boolean exitTopic(Topic topic);
		Map<Integer, Topic> findAllTopic();
}
