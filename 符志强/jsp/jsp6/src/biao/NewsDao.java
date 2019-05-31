package biao;
import java.util.List;

public interface NewsDao {
	boolean getName(String uname,String upwd);
	List<news> listByPage(int curPage,int pageSize);
	Integer getmax(int count);
}
