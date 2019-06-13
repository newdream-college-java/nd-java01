package com.cc.dao;

import java.util.List;

import com.cc.entity.Order;

public interface OrderDao {
    List<Order> listOrderByCondition(Integer eoId,String eoUserName,int page,int pageSize);
    int addOrder(int id);
}
