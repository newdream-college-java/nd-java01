package com.cb.mapper;

import java.util.List;

import com.cb.entity.Orderdetail;
import com.cb.entity.OrderdetailCustom;

public interface OrderdetailMapper {
	List<Orderdetail>list();
	int insert(Orderdetail od);
	
	OrderdetailCustom findOrders(int a);
	//订单详情ordersdetail-->items商品表：一对一
	Orderdetail findItems(int b);
}
