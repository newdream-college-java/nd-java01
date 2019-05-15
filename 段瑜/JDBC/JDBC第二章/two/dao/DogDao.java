package cn.two.dao;

import java.util.List;

import cn.two.entity.Dog;

public interface DogDao {
	List<Dog> selectDog();
	int save(Dog dog);
	int updateDog(Dog dog);
}
