package BaseDao;

import java.sql.ResultSet;
import java.util.List;
import entity.Topic;

public interface topicDao {
	boolean getByName(String title);
	int save(Topic topic);
	List<Topic> getTopics();
	
}
