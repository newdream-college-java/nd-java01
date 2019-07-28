package com.wx.mapper;

import java.util.List;

import com.wx.entity.Orderdetail;
import com.wx.entity.OrderdetailCustom;

public interface OrderdetailMapper {
	List<Orderdetail>list();
	int insert(Orderdetail od);
	
	OrderdetailCustom findOrders(int a);
	//订单详情ordersdetail-->items商品表：一对一
	Orderdetail findItems(int b);
}
