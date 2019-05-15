package cn.two.manager;

import java.util.List;

import cn.two.dao.DogDao;
import cn.two.dao.imgl.DogDaoimpl;
import cn.two.entity.Dog;

public class DogManager {
	public List<Dog> selectDog() {
		DogDao dog=new DogDaoimpl();
		return dog.selectDog();
	}
	public int save(Dog dog) {
		DogDao dogDao=new DogDaoimpl();
		return dogDao.save(dog);
	}
	public int updateDog(Dog dog) {
		DogDao dogDao=new DogDaoimpl();
		return dogDao.updateDog(dog);
		
	}
}
