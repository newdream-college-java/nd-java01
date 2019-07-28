package com.cc.mapper;

import java.util.List;

import org.apache.logging.log4j.core.config.Order;

import com.cc.entity.OrderCustomer;
import com.cc.entity.Orders;
import com.cc.entity.User;


public interface OrderCustomerMapper {
	List<OrderCustomer> orderfind(int id);
	
	//方式二用resultMap做
	Orders orderfind1(int id);
	
	//一对多用resultMap做
	Orders orderfind2(int id);
	
	//复杂的一对多用resultMap做
	User findItem(int a);
	
	//多对多用resultMap做
	List<User> querItemsByUserId();
}