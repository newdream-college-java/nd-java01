package dao;

import java.util.List;

import entity.Membersinfo;

public interface MembersinfoDao {
	List<Membersinfo> list(Integer mem);
	int update(Membersinfo mem);
	List<Membersinfo> findById(int id);
}
