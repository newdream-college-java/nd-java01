package dao.impl;

import java.util.List;

import entity.ProductView;

public interface ProductViewImp {
	//商品详情功能,按照传入的商品id条件查询
	List<ProductView> showProductVew(int id);
}
