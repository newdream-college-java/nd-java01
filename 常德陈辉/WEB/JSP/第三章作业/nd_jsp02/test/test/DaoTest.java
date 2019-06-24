package test;

import org.junit.Test;

import com.dao.BaseDao;
import com.dao.impl.NewsDaoImpl;
import com.dao.impl.TopicDaoImpl;
import com.entity.Topic;

public class DaoTest {
	TopicDaoImpl pd = new TopicDaoImpl();
	NewsDaoImpl nd=new NewsDaoImpl();
	@Test
	public void testBaseDao(){
		BaseDao bd=new BaseDao();
		bd.getConn();
		System.out.println(bd.conn);
	}
	@Test
	public void getTopicByName() {
		System.out.println(pd.getTopicByName("国内"));
	}
	@Test
	public void insertTopic(){
		Topic bd=new Topic("财经");
		System.out.println(pd.insertTopic(bd));
	}
	@Test
	public void news(){
		System.out.println(nd.news(1, 2));
	}
	@Test
	public void last(){
		System.out.println(nd.last(3));
	}
	
}
