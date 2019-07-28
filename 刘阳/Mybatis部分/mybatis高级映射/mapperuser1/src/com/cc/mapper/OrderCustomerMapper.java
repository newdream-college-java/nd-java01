package com.cc.mapper;

import java.util.List;

import org.apache.logging.log4j.core.config.Order;

import com.cc.entity.OrderCustomer;
import com.cc.entity.Orders;
import com.cc.entity.User;


public interface OrderCustomerMapper {
	List<OrderCustomer> orderfind(int id);
	
	//��ʽ����resultMap��
	Orders orderfind1(int id);
	
	//һ�Զ���resultMap��
	Orders orderfind2(int id);
	
	//���ӵ�һ�Զ���resultMap��
	User findItem(int a);
	
	//��Զ���resultMap��
	List<User> querItemsByUserId();
}