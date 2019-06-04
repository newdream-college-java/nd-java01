package Dao;

import java.util.List;

import entity.Club;

public interface ClubDao {
	public List<Club> select(Club club);
	public int  update(Club club);
}
