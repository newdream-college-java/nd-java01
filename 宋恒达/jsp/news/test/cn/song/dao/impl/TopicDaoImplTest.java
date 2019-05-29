package cn.song.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import cn.song.dao.TopicDao;
import cn.song.entity.Topic;

/**
* @author mo
* @version 2019年5月27日 下午6:35:21
* @description
*/
class TopicDaoImplTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void testAddTopic() {
		TopicDao topicDao=new TopicDaoImpl();
		Topic topic=new Topic();
		topic.setTitle("国内");
		topicDao.addTopic(topic);
	}
	@Test
	void testExitTopic() {
		TopicDao topicDao=new TopicDaoImpl();
		Topic topic=new Topic();
		topic.setTitle("国内");
		System.out.println(topicDao.exitTopic(topic));
	}
	@Test
	void testFindAllTopic() {
		TopicDao topicDao=new TopicDaoImpl();
		Map<Integer, Topic> maps=topicDao.findAllTopic();
		Set<Integer> keys=maps.keySet();
		for(Integer key:keys) {
			System.out.println(maps.get(key).getTitle());
		}
	}
}
