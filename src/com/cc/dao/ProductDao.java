package com.cc.dao;

import java.util.List;

import com.cc.entity.Product;

public interface ProductDao {
    List<Product>listByPage(int page,int pageSize);
    Product findById(int pid);
    int changeProductStock(Product pro);
}
