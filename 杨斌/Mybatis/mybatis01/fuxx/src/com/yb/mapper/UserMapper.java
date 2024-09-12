package com.yb.mapper;
import java.util.List;
import com.yb.entity.User;
public interface UserMapper {
	List<User> listAll();
	int addUser(User fw);
	int modifyUser(User fw);
	int removeUser(User fw);
}
