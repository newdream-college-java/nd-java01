package com.wx.mapper;

import java.util.List;


import com.wx.entity.User;

public interface UserMapper {
	//一对多复杂
	User findItems(int a);
	//多对多
	List<User> findALL();
	
	//一对多 user---->orders订单
	User findOrders(int B);
}
