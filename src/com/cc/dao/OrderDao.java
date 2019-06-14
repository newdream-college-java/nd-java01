package com.cc.dao;

import java.util.List;

import com.cc.entity.Order;
import com.cc.entity.Product;

public interface OrderDao {
    List<Order> listOrderByCondition(Integer eoId,String eoUserName,int page,int pageSize);
    /**
     * 
        * @Title: addOrder  
        * @Description: TODO  
        * @param @param id 购买的这个商品id
        * @param @param product  购物车订购的这个商品(包含购买数量)
        * @param @return
        * @return int
        * @throws
     */
    int addOrder(int id,Product product);
}
