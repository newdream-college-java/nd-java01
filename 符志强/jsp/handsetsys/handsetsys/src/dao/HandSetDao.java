package dao;

import java.util.List;

import entity.HandSet;


public interface HandSetDao {
	List<HandSet> list(Integer id);

	boolean delete(Integer id);
}
