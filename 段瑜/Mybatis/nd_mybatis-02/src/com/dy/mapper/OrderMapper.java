package com.dy.mapper;

import java.util.List;

import com.dy.entiy.OrderCustom;
import com.dy.entiy.Orders;

public interface OrderMapper {
	OrderCustom findAll(int orderId);
	Orders findAll2(int orderId);
	Orders findDetailById(int orderId);
	Orders OrdersfindItems(int id);
	List<Orders> OrdersAllItems();
}
