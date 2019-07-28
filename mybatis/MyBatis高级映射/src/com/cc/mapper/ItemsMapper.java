package com.cb.mapper;

import com.cb.entity.Items;

public interface ItemsMapper {
	// items商品表-->订单详情ordersdetail:   一对多
	Items findOrderdetail(int a);
}
