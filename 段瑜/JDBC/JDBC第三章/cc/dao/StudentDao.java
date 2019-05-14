package cn.cc.dao;

import java.util.List;

import cn.cc.entity.Studen;

public interface StudentDao {
	int update(Studen studen);
	List<Studen>  select();
}
