package com.wx.mapper;

import com.wx.entity.Items;

public interface ItemsMapper {
	// items商品表-->订单详情ordersdetail:   一对多
	Items findOrderdetail(int a);
}
