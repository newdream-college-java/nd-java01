package com.cb.mapper;

import java.util.List;

import com.cb.entity.Orders;

public interface OrderMapper {
	Orders findId(int a);
	Orders findByDatetail(int b);
	//订单与商品：一对多				
	// 根据订单id---->订单详情--->商品
	Orders findItems(int c);
	//orders订单-->items商品表：多对多
	List<Orders>findAllItems();
}
