package com.yb.dao;
import java.util.List;
import com.yb.entity.User;
public interface UserDao {
	List<User> listAll();
	int addUser();
	int modifyUser();
	int removeUser();
}
