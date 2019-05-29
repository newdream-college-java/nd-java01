package cn.song.dao;

import java.util.Map;

import cn.song.entity.Topic;

/**
* @author mob
* @version 2019年5月27日 下午3:07:36
* @description
*/
public interface TopicDao {
		boolean addTopic(Topic topic);
		boolean exitTopic(Topic topic);
		Map<Integer, Topic> findAllTopic();
}
