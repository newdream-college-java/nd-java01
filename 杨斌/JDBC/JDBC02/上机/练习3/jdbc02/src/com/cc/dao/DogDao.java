package com.cc.dao;

import com.cc.entity.Dog;

public interface DogDao {
	public Dog selectDog();

	public int executeUpdate(String sql, Object[] objects);
}
