package BaseDao;

import java.util.List;

import entity.Stu_info;

public interface stu_infoDao {
	int save(Stu_info stuinfo);
	int Update(Stu_info stuinfo);
	int Delete(Stu_info stuinfo);
	List<Stu_info> select();
}
