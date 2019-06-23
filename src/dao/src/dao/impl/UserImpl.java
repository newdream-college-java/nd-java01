package dao.impl;

import java.util.List;


import entity.User;

public interface UserImpl {
	//注册功能
	public int addUser(User user );
	 //登录功能
	public int login(User user);
   
	
}
