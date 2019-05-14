package cn.cc.manager;

import java.util.List;

import cn.cc.dao.StudentDao;
import cn.cc.dao.imgl.StudenDaoSqlServerimgl;
import cn.cc.entity.Studen;

public class StudenManager {
	public int update(Studen studen) {
	StudentDao studenDao=new StudenDaoSqlServerimgl();
	return studenDao.update(studen);
	}
	public List<Studen> select(Studen studen) {
		StudentDao studenDao=new StudenDaoSqlServerimgl();
		return studenDao.select();
		
	}
}
