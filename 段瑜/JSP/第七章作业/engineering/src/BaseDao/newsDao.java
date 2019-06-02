package BaseDao;

import java.util.List;

import entity.News;

public interface newsDao {
	List<News> select(int apg,int bpg);
	int conts(int bpg);
	int insertNews(News n);
}
